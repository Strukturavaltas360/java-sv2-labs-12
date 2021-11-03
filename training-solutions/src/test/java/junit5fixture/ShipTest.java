package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void  init() {
       ship = new Ship("The Mayflower",1609,33.5);
    }

    @Test
    void testName() {
        assertEquals("The Mayflower",ship.getName());
        assertNotEquals("The Pilgrims", ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1609, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction()>1492);
        assertFalse(ship.getYearOfConstruction()>1678);
    }

    @Test
    void testLength() {
        assertEquals(33,ship.getLength(),0.5);
    }

    @Test
    void testNull() {
        Ship ship2 = null;
        assertNull(ship2);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship ship2 = ship;
        assertSame(ship2,ship);
    }

    @Test
    void testNotSameObject(){
        Ship ship2 = new Ship("The Mayflower",1609,33.5);
        assertNotSame(ship2,ship);
    }
}
