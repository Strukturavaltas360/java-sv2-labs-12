package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void testSum() {
        SeparatedSum separatedSum = new SeparatedSum();
        String floatingNumbers = separatedSum.readFromFile();

        assertEquals(110.6,new SeparatedSum().sum(floatingNumbers).getPositiveSum(),0.000001);
        assertEquals(-153.3,new SeparatedSum().sum(floatingNumbers).getNegativSum(), 0.000001);
    }

}