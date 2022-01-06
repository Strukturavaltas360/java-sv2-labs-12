package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void testHiddenWord() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(Path.of("src/test/Resources/hiddenword.txt")));
    }

    @Test
    void testHiddenWordWithWrongFileName() {
        Exception e = assertThrows(IllegalStateException.class, () -> hiddenWord.getHiddenWord(Path.of("src/test/Resources/hiddenword_.txt")));
        assertEquals("Can not read file!", e.getMessage());

    }
}