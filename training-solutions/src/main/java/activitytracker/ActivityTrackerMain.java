package activitytracker;


import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        List<Activity> activityList = new ArrayList<>(Arrays.asList(
                new Activity(LocalDateTime.of(2022, Month.FEBRUARY, 16, 6, 3), "Kosárlabda", ActivityType.BASKETBALL),
                new Activity(LocalDateTime.of(2022, Month.JANUARY, 28, 11, 20), "Túrázás", ActivityType.HIKING),
                new Activity(LocalDateTime.of(2022, Month.FEBRUARY, 16, 17, 8), "Futáááás", ActivityType.RUNNING),
                new Activity(LocalDateTime.of(2022, Month.FEBRUARY, 16, 14, 35), "Bicajozás", ActivityType.BIKING)));

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("klaradb");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();

//        insertListIntoTable(dataSource, activityList);
//        System.out.println(new ActivityTrackerMain().selectDataById(dataSource, 3L));
//        List<Activity> activitiesByQuery = new ActivityTrackerMain().findAllActivities(dataSource);
//
//        System.out.println(activitiesByQuery);
    }
//
//    private List<Activity> findAllActivities(MariaDbDataSource dataSource) {
//        List<Activity> resultActivities = new ArrayList<>();
//        try (Connection connection = dataSource.getConnection();
//             PreparedStatement statement = connection.prepareStatement("select * from activities");
//             ResultSet rs = statement.executeQuery()) {
//
//            while (rs.next()) {
//                resultActivities.add(buildActivityFromResultSet(rs));
//            }
//            return resultActivities;
//
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query!", sqle);
//        }
//    }
//
//    private Activity selectDataById(MariaDbDataSource dataSource, Long id) {
//        try (Connection connection = dataSource.getConnection();
//             PreparedStatement ps = connection.prepareStatement("select * from activities where id = ?")) {
//            ps.setLong(1, id);
//            return getActivityByStatement(ps);
//
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query!", sqle);
//        }
//    }
//
//    private static void insertListIntoTable(DataSource dataSource, List<Activity> activityList) {
//        try (Connection connection = dataSource.getConnection();
//             PreparedStatement stmt = connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?,?,?)")) {
//            for (Activity actual : activityList) {
//                stmt.setTimestamp(1, Timestamp.valueOf(actual.getStartTime()));
//                stmt.setString(2, actual.getDesc());
//                stmt.setString(3, actual.getType().toString());
//                stmt.execute();
//            }
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot insert into Table", sqle);
//        }
//    }
//
//    private Activity getActivityByStatement(PreparedStatement ps) {
//        try (ResultSet rs = ps.executeQuery()) {
//            if (rs.next()) {
//                return buildActivityFromResultSet(rs);
//            }
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query!", sqle);
//        }
//        throw new IllegalStateException("Empty query!");
//    }
//
//    private Activity buildActivityFromResultSet(ResultSet rs) {
//        try {
//            Long id = rs.getLong("id");
//            String desc = rs.getString("activity_desc");
//            ActivityType activityType = ActivityType.valueOf(rs.getString("activity_type"));
//            LocalDateTime ld = rs.getTimestamp("startTime").toLocalDateTime();
//            return new Activity(id, ld, desc, activityType);
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query!", sqle);
//        }
//    }
}
