package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    @Test
    void testNumberSumInteger() {
        int[] intArray = {10,24,32,0,98};
        assertEquals(164, new NumbersSum().getSum(intArray));
    }

    @Test
    void testNumberSumIntegerWithNull() {
        int[] intArray = {};
        NumbersSum numbersSum = new NumbersSum();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(intArray));
        assertEquals("Null parameter!", ex.getMessage());
    }

    @Test
    void testNumberSumString() {
        String[] StringArray = {"4","56","7","23","1"};
        NumbersSum numbersSum = new NumbersSum();
        assertEquals(91, numbersSum.getSum(StringArray) );
    }

    @Test
    void testNumberSumStringWithNull() {
        String[] StringArray = {};
        NumbersSum numbersSum = new NumbersSum();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(StringArray));
        assertEquals("Null parameter!", ex.getMessage());
    }

    @Test
    void testNumberSumStringWithNaN() {
        String[] StringArray = {"4","ssw","7","23","1"};
        NumbersSum numbersSum = new NumbersSum();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(StringArray));
        assertEquals("Not a number!", ex.getMessage());
    }

}

