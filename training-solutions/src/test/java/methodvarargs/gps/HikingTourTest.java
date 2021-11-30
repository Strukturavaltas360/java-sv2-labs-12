
package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour hikingTour = new HikingTour();

    @Test
    void testEmptyList() {
        assertEquals(0, hikingTour.getFieldPointList().size());
    }

    @Test
    void testLogFieldPoints() {
        hikingTour.logFieldPoints(LocalDateTime.of(2021, 11, 4, 9, 14),
                new FieldPoint(LocalDateTime.of(2021, 11, 4, 8, 12), 47.205902, 17.555667),
                new FieldPoint(LocalDateTime.of(2021, 11, 4, 8, 25), 47.212332, 17.565437),
                new FieldPoint(LocalDateTime.of(2021, 11, 4, 8, 46), 47.225752, 17.542887));

        assertEquals(3, hikingTour.getFieldPointList().size());
        assertEquals(LocalDateTime.of(2021, 11, 4, 9, 14), hikingTour.getFieldPointList().get(1).getTimeOfLogging());
        assertEquals(47.225752, hikingTour.getFieldPointList().get(2).getLatitude());
    }

    @Test
    void testLogFieldPointsNullTimestamp() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> hikingTour.logFieldPoints(null,
                        new FieldPoint(LocalDateTime.of(2021, 11, 4, 8, 12), 47.205902, 17.555667),
                        new FieldPoint(LocalDateTime.of(2021, 11, 4, 8, 25), 47.212332, 17.565437),
                        new FieldPoint(LocalDateTime.of(2021, 11, 4, 8, 46), 47.225752, 17.542887)));
        assertEquals("Time of logging must not be null!", ex.getMessage());
    }
}