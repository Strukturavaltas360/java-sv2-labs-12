package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testTableCloth() {
        assertEquals(4,new TableCloth(5).getNumberOfSides());
        assertEquals(5,new TableCloth(5).getSide());
        assertEquals(20,new TableCloth(5).getPerimeter());
        assertEquals(25,new TableCloth(5).getArea());
        assertEquals(7.071,new TableCloth(5).getLengthOfDiagonal(),0.001);
    }
}