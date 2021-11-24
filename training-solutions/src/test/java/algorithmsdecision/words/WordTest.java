package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWordFalse() {

        List<String > words = Arrays.asList("fal","jobb","bal","hal");
        assertFalse(new Word().containsLongerWord(words,"alma"));
    }

    @Test
    void testContainsLongerWordTrue() {
        List<String > words = Arrays.asList("fal","jobb","bal","hal","kabát");
        assertTrue(new Word().containsLongerWord(words,"alma"));
    }
}