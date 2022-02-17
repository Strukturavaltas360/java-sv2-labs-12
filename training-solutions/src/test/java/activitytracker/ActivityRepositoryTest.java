package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityRepositoryTest {

    ActivityRepository activityRepository;

    Flyway flyway;

    @BeforeEach
    void init () {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("klaradb");

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach datasource", sqle);
        }

        flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityRepository = new ActivityRepository(dataSource);
    }

    @Test
    void insertAndListAllTest() {
        List<Activity> activityList = new ArrayList<>(Arrays.asList(
                new Activity(1, LocalDateTime.of(2022, Month.FEBRUARY, 16, 6, 3), "Kosárlabda", ActivityType.BASKETBALL),
                new Activity(2, LocalDateTime.of(2022, Month.JANUARY, 28, 11, 20), "Túrázás", ActivityType.HIKING),
                new Activity(3, LocalDateTime.of(2022, Month.FEBRUARY, 16, 17, 8), "Futáááás", ActivityType.RUNNING),
                new Activity(4, LocalDateTime.of(2022, Month.FEBRUARY, 16, 14, 35), "Bicajozás", ActivityType.BIKING)));

        activityList.stream()
                .forEach(activity -> activityRepository.saveActivity(activity));

        List<Activity> result = activityRepository.listActivities();
        assertEquals(activityList, result);
    }

    @Test
    void insertAndFindByIdTest() {
        List<Activity> activityList = new ArrayList<>(Arrays.asList(
                new Activity(LocalDateTime.of(2022, Month.FEBRUARY, 16, 6, 3), "Kosárlabda", ActivityType.BASKETBALL),
                new Activity(LocalDateTime.of(2022, Month.JANUARY, 28, 11, 20), "Túrázás", ActivityType.HIKING),
                new Activity(LocalDateTime.of(2022, Month.FEBRUARY, 16, 17, 8), "Futáááás", ActivityType.RUNNING),
                new Activity(LocalDateTime.of(2022, Month.FEBRUARY, 16, 14, 35), "Bicajozás", ActivityType.BIKING)));

        activityList.stream()
                .forEach(activity -> activityRepository.saveActivity(activity));

        Activity result = activityRepository.findActivityById(2);
        assertEquals(new Activity(2, LocalDateTime.of(2022, Month.JANUARY, 28, 11, 20), "Túrázás", ActivityType.HIKING), result);

    }


}