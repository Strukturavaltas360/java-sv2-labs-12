package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021,11,12);
        LocalTime start = LocalTime.of(18,00);
        LocalTime end = LocalTime.of(21,00);

        Performance performance = new Performance("The Beatles", date, start, end);

        System.out.println(performance.getArtist());
        System.out.println(performance.getDate());
        System.out.println(performance.getStartTime());
        System.out.println(performance.getEndTime());

        System.out.println(performance.getInfo());
    }
}
