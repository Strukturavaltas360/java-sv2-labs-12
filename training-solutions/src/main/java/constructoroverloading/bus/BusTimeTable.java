package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime>  timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timetable) {
        this.timeTable = timetable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int i = firstHour; i<= lastHour; i++) {
            timeTable.add(new SimpleTime(i,everyMinute));
        }
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        for (int i = 0; i < timeTable.size(); i++) {
            if (timeTable.get(i).getDifference(actual) >= 0) {
                return timeTable.get(i);
            }
        }
        throw new IllegalStateException("No more buses today!");
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }
}
