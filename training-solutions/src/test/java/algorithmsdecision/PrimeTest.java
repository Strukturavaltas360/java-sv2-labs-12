package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime() {
        assertTrue(new Prime().isPrime(13));
        assertTrue(new Prime().isPrime(7));

        assertFalse(new Prime().isPrime(88));
        assertFalse(new Prime().isPrime(1));
        assertFalse(new Prime().isPrime(0));
        assertFalse(new Prime().isPrime(-12));
    }
}