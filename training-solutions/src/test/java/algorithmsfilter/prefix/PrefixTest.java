package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testGetWordsStartWith() {
        List<String> words = Arrays.asList("fajta", "pajta", "kutya", "cica", "ló","papa","palást");

        List<String> result = new Prefix().getWordsStartWith(words,"pa");
        assertEquals(3,result.size());

        assertEquals("papa",result.get(1));

        assertTrue(result.contains("papa"));

        assertFalse(result.contains("ló"));
    }

}