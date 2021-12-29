package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testLongWord() {
        assertEquals("LONGWORD", new LongWord(Path.of("src/test/Resources/longword.txt")).getLongWord());
    }

}