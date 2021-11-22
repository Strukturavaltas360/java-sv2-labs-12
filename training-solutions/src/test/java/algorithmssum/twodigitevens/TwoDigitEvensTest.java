package algorithmssum.twodigitevens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitEvensTest {

    @Test
    void testGetSum() {
        assertEquals(1980, new TwoDigitEvens().getSum());
    }

}