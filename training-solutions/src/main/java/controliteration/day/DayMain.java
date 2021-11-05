package controliteration.day;

import java.util.Arrays;

public class DayMain {

    public static void main(String[] args) {
        Day day = new Day();
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

        day.setDayPeriod();

        System.out.println(day.getHoursOfDay().get(0).period);
        System.out.println(day.getHoursOfDay().get(1).period);
        System.out.println(day.getHoursOfDay().get(2).period);
        System.out.println(day.getHoursOfDay().get(3).period);
        System.out.println(day.getHoursOfDay().get(4).period);

    }
}
