package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void testFamilyCar() {
        assertEquals(5, new FamilyCar().getNumberOfSeats());
    }

    @Test
    void testSportsCar() {
        assertEquals(2, new SportsCar().getNumberOfSeats());
    }

    @Test
    void testCar() {
        assertEquals(4, new Car("Suzuki", 4).getNumberOfSeats());
    }

}