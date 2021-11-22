package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    private Words words = new Words();

     @Test
    void testGetFirstWordWithA() {
        Path path = Paths.get("src/test/Resources/words.txt");
        assertEquals("Anna", words.getFirstWordWithA(path));
    }

    @Test
    void testGetFirstWordWithANotSuchWord(){
        Path path = Paths.get("src/test/Resources/anotherwords.txt");
        assertEquals("A", words.getFirstWordWithA(path));
    }

    @Test
    void testIfNoSuchFile() {
        Path path = Paths.get("xyz.txt");
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(path));
        assertEquals("Error while reading file", exception.getMessage());
    }
}
