package activitytracker;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ActivityRepository {

    private JdbcTemplate jdbcTemplate;

    public ActivityRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveActivity(Activity activity) {
        jdbcTemplate.update("insert into activities (startTime, activity_desc, activity_type) values (?,?,?)",
                activity.getStartTime(), activity.getDescription(), activity.getActivityType().toString());
    }

    public List<String> listActivities() {
        List<String> result = jdbcTemplate.query("select * from activities",
                (rs, rowNumber) -> rs.getString("activity_desc"));
        return result;
    }

    public long saveActivityAndGetId(Activity activity) {
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement stmt = con.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDescription());
            stmt.setString(3, activity.getActivityType().toString());
            return stmt;
        }, holder);
        return holder.getKey().longValue();
    }

    public String findActivityDescById(long id) {
        String s = jdbcTemplate.queryForObject("select activity_desc from activities where id =?", String.class, id);
//                (rs, rowNumber) -> rs.getString("activity_desc"),id);
        return s;
    }

    public Activity findActivityById(long id) {
        Map<String, Object> record = jdbcTemplate.queryForMap("select * from activities where id =?", id);
        LocalDateTime ldt = ((Timestamp) record.get("startTime")).toLocalDateTime();
        String desc = (String) record.get("activity_desc");
        ActivityType type = ActivityType.valueOf(record.get("activity_type").toString());
        return new Activity(ldt, desc, type);
    }
}
