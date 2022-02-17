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

    public void saveActivity(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt =
                     connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?,?,?)")) {
                stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                stmt.setString(2, activity.getDesc());
                stmt.setString(3, activity.getType().toString());
                stmt.execute();

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
        throw new IllegalStateException("Empty query!");
    }

    private Activity buildActivityFromResultSet(ResultSet rs) {
        try {
            long id = rs.getLong("id");
            String desc = rs.getString("activity_desc");
            ActivityType activityType = ActivityType.valueOf(rs.getString("activity_type"));
            LocalDateTime ld = rs.getTimestamp("startTime").toLocalDateTime();
            return new Activity(id, ld, desc, activityType);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
    }

}
