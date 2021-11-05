package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour h: hoursOfDay){
            if (h.getHourNumber() <6 || h.getHourNumber()>22) {
                h.setPeriod(DayPeriod.NIGHTTIME);
            } else {
                h.setPeriod(DayPeriod.DAYTIME);
            }
        }
    }
}
