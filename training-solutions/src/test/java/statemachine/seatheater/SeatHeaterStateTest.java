package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeatHeaterStateTest {

    @Test
    void testNext() {
        assertEquals(SeatHeaterState.STATE_THREE, SeatHeaterState.STATE_NULL.next());
        assertEquals(SeatHeaterState.STATE_TWO, SeatHeaterState.STATE_THREE.next());
        assertEquals(SeatHeaterState.STATE_ONE, SeatHeaterState.STATE_TWO.next());
        assertEquals(SeatHeaterState.STATE_NULL, SeatHeaterState.STATE_ONE.next());
    }
}