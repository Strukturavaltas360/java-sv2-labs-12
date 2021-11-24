package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {
    @Test
    void testGetFirstTwoLetters () {
        List<String> words = Arrays.asList("alma","körte","meggy","citrom", "eper");
        List<String> expected = Arrays.asList("al","kö","me","ci", "ep");

        assertEquals(expected,new TwoLetters().getFirstTwoLetters(words));
    }
}