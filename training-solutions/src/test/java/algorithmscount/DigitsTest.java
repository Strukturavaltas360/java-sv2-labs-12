package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testGetCountOfNumbers(){
        int result = new Digits().getCountOfNumbers();
        assertEquals(9,result);
    }
}