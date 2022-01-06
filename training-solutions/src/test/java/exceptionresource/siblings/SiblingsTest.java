package exceptionresource.siblings;

import exceptionmulticatch.converter.InvalidBinaryStringException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void testSibling() {
        List<String> expected = Arrays.asList("Béla Molnár", "Jolán Molnár", "Éva Molnár");
        Path path = Paths.get("src/test/Resources/firstnames.txt");
        assertEquals(expected,siblings.getFullNames("Molnár",path));
    }

    @Test
    void testSiblingWithNoSuchFile() {
        Path path = Paths.get("src/test/Resources/firstnames_.txt");
        Exception ex = assertThrows(IllegalStateException.class, () -> siblings.getFullNames("Molnár",path));
        assertEquals("Error while reading file!", ex.getMessage());

    }

}