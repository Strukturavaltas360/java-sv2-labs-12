package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        set(hour, minute);
    }

    public SimpleTime(String timeString) {
        if (timeString == null) {
            throw new InvalidTimeException("Time is null");
        }
        try {
            String[] temp = timeString.split(":");
            int hh = Integer.parseInt(temp[0]);
            int mm = Integer.parseInt(temp[1]);
            set(hh, mm);
        } catch (IllegalArgumentException iae) {
            throw new InvalidTimeException("Time is not hh:mm", iae);
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private void set(int hour, int minute) {
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        this.hour = hour;
        this.minute = minute;
    }
}
