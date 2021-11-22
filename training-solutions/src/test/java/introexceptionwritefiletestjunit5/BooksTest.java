package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testMakeReadableList() throws IOException {
        Path path = temporaryFolder.toPath().resolve("newbooks.txt");
        new Books().makeReadableList(path);

        List<String> result = Files.readAllLines(path);
        assertEquals(4,result.size());
        assertEquals("Molnár Ferenc: Pál utcai fiúk",result.get(1));
    }

}