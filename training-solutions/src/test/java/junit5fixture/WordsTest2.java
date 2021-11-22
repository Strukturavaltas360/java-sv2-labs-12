package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest2 {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWords("polc");
        words.addWords("nyolc");
        words.addWords("Fal");
        words.addWords("kutya");
        words.addWords("hal");
        words.addWords("kapa");
        words.addWords("kép");
        words.addWords("humpli");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> startWithK = Arrays.asList("kutya", "kapa", "kép");
        words.getWordsStartWith("k");
        assertEquals(startWithK, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> threeDigitsWords = Arrays.asList("Fal","hal","kép");
        words.getWordsWithLength(3);
        assertEquals(threeDigitsWords,words.getWords());
    }

}
