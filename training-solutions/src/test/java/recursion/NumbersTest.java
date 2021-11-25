package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetSum() {

        assertEquals(3,new Numbers().getSum(new int[] {3}));
        assertEquals(16,new Numbers().getSum(new int[] {3,2,4,7}));
        assertEquals(0,new Numbers().getSum(new int[] {}));

    }
}