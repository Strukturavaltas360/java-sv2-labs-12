package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest2 {

    private Ship ship;

    @BeforeEach
    void init() {
    ship = new Ship("Fonyód",1999,20.8);
    }

    @Test
    void testName() {
        assertEquals("Fonyód",ship.getName());
    }

    @Test
    void TestNotName(){
        assertNotEquals("fonyód",ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1999,ship.getYearOfConstruction());
        assertTrue(1999==ship.getYearOfConstruction());
        assertFalse(1998==ship.getYearOfConstruction());
    }

    @Test
    void testLength() {
        assertEquals(20.8,ship.getLength());
    }

    @Test
    void testNull() {
        Ship nullShip = null;
        assertNull(nullShip);
        Ship nullShip2 = null;
        nullShip2 = ship;
        assertSame(ship,nullShip2);
    }
}