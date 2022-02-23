package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        Activity a1 = new Activity(LocalDateTime.of(2021,12,13,10,5),"futááás",ActivityType.RUNNING);
        Activity a2 = new Activity(LocalDateTime.of(2022,2,13,9,5),"irány a csomolungma",ActivityType.HIKING);
        Activity a3 = new Activity(LocalDateTime.of(2022,1,5,15,5),"kosár a grundon",ActivityType.BASKETBALL);
        Activity a4 = new Activity(LocalDateTime.of(2021,11,6,8,5),"bicajozás körbe-körbe",ActivityType.BIKING);

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitydb?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("klaradb");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        ActivityRepository activityRepository = new ActivityRepository(dataSource);
        activityRepository.saveActivity(a1);
        activityRepository.saveActivity(a2);
        activityRepository.saveActivity(a3);
        activityRepository.saveActivity(a4);

        System.out.println(activityRepository.listActivities());

        System.out.println(activityRepository.saveActivityAndGetId(a2));

        System.out.println(activityRepository.findActivityDescById(5));

        System.out.println(activityRepository.findActivityById(3));

    }
}
