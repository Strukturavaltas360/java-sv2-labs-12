package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWords("bálna");
        words.addWords("mi");
        words.addWords("bal");
        words.addWords("balta");
        words.addWords("ma");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> expectedWords = Arrays.asList("mi", "ma");
        words.getWordsStartWith("b");
        assertEquals(expectedWords,words.getWords());
    }

    @Test
    void testgetWordsWithLength(){
        List<String> expectedWords = Arrays.asList("mi", "ma");
        words.getWordsWithLength(2);
        assertEquals(expectedWords,words.getWords());
    }



}
