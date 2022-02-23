package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityRepository {

    DataSource dataSource;

    public ActivityRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt =
                     connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?,?,?)",
                             Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.execute();
            connection.setAutoCommit(false);
            saveTrackPoints(connection, getActivityIdFromResultSet(stmt), activity.getTrackPoints());
            connection.setAutoCommit(true);

            return new Activity(getActivityIdFromResultSet(stmt), activity.getStartTime(), activity.getDesc(), activity.getType());


//            return getActivityFromResultSet(stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert into Table", sqle);
        }
    }

    private void saveTrackPoints(Connection connection, long activityId, List<TrackPoint> trackPoints) {
        try (PreparedStatement stmt = connection.prepareStatement("insert into track_point (activity_id, time, lat, lon) values (?, ?,?,?)")) {
            for (TrackPoint actual : trackPoints) {
                if ((actual.getLat() < -90 || actual.getLat() > 90) || (actual.getLon() < -180 || actual.getLon() > 180)) {
                    connection.rollback();
                    throw new IllegalArgumentException("Transaction not succeeded!");
//                    stmt.close();
//                    return;
                }
                stmt.setLong(1, activityId);
                stmt.setDate(2, Date.valueOf(actual.getTime()));
                stmt.setDouble(3, actual.getLat());
                stmt.setDouble(4, actual.getLon());
                stmt.executeUpdate();
            }
            connection.commit();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot save trackpoints!", sqle);
        }
    }

    private long getActivityIdFromResultSet(PreparedStatement stmt) {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new IllegalStateException("Cannot get id");

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert into Table", sqle);
        }
    }


    private Activity getActivityFromResultSet(PreparedStatement stmt) {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                long id = rs.getLong(1);
                return findActivityById(id);
            }
            throw new IllegalStateException("Cannot get id");

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert into Table", sqle);
        }
    }

    public Activity findActivityById(long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement("select * from activities where id = ?")) {
            ps.setLong(1, id);
            return findActivityByStatement(ps);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
    }



    public List<Activity> listActivities() {
        List<Activity> resultActivities = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from activities");
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                resultActivities.add(buildActivityFromResultSet(rs));
            }
            return resultActivities;

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
    }

    private Activity findActivityByStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return buildActivityFromResultSet(rs);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
        throw new IllegalArgumentException("No activity with this id.");
    }

    private Activity buildActivityFromResultSet(ResultSet rs) {
        try {
            long id = rs.getLong("id");
            String desc = rs.getString("activity_desc");
            ActivityType activityType = ActivityType.valueOf(rs.getString("activity_type"));
            LocalDateTime ld = rs.getTimestamp("startTime").toLocalDateTime();
            return new Activity(id, ld, desc, activityType, findTrackPointsById(id));
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
    }

    public List<TrackPoint> findTrackPointsById(long id) {
        List<TrackPoint> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement("select * from track_point where activity_id = ?")) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                result.add(new TrackPoint(rs.getLong("id"), rs.getDate("time").toLocalDate(),
                        rs.getDouble("lat"), rs.getDouble("lon")));
            }
            rs.close();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot find trackpoints!", sqle);
        }
        return result;
    }

}
