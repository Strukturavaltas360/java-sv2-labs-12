package constructoroverloading.bus;

public class SimpleTime {
    private static final int MINUTES_IN_HOURS = 60;
    private final int hours;
    private final int minutes;


    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getDifference(SimpleTime time) {
        return timeInMinutes() - time.timeInMinutes();
    }

    private int timeInMinutes() {
        return hours * MINUTES_IN_HOURS + minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
