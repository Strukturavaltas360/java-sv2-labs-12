package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {


    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü",1,450);
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Süss", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü",1,450);
        assertEquals(1,dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() < 7);
        assertFalse(dragon.getNumberOfHeads() == 7);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü",1,450);
        assertEquals(455, dragon.getHeight(),5);
    }
    @Test
    void testNull() {
        Dragon susu = new Dragon("Süsü",1,450);
        Dragon smaug = null;
        assertNull(smaug);
        assertNotNull(susu);
    }
    @Test
    void testSameObjects() {
        Dragon susu = new Dragon("Süsü",1,450);
        Dragon smaug = susu;
        assertSame(susu,smaug);
    }

    @Test
    void testNotSameObjects() {
        Dragon susu = new Dragon("Süsü",1,450);
        Dragon smaug = new Dragon("Süsü",1,450);
        assertNotSame(susu,smaug);

    }

}
