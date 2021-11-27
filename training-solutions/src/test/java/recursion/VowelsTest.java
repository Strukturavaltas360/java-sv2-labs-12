package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void testVowels() {
        assertEquals(6,new Vowels().getNumberOfVowels("almafahalomba"));
        assertEquals(3,new Vowels().getNumberOfVowels("alkotó"));
        assertEquals(4,new Vowels().getNumberOfVowels("Kovács Ottó"));
        assertEquals(0,new Vowels().getNumberOfVowels("Kvcs ttklhmt5"));

        assertEquals(0, new Vowels().getNumberOfVowels(""));
        assertEquals(1, new Vowels().getNumberOfVowels("a"));
        assertEquals(0, new Vowels().getNumberOfVowels("b"));
        assertEquals(9, new Vowels().getNumberOfVowels("árvíztűrő tükörfúrógép"));
    }

}