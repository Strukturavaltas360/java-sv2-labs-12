package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {

    Day day;

    @BeforeEach
    void init (){
        day = new Day();
        Hour hour1 = new Hour(5);
        Hour hour2 = new Hour(10);
        Hour hour3 = new Hour(14);
        Hour hour4 = new Hour(18);
        Hour hour5 = new Hour(23);
        day.addHour(hour1);
        day.addHour(hour2);
        day.addHour(hour3);
        day.addHour(hour4);
        day.addHour(hour5);
    }

    @Test
        void testSetDayPeriod() {
        day.setDayPeriod();

        assertEquals(DayPeriod.NIGHTTIME,day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(2).getPeriod());
        assertEquals(DayPeriod.DAYTIME,day.getHoursOfDay().get(3).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME,day.getHoursOfDay().get(4).getPeriod());
    }
}
