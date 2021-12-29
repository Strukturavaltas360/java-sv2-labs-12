package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testTypeWriterState() {
        assertEquals(TypeWriterState.LOWERCASE, TypeWriterState.UPPERCASE.endRow());
        assertEquals(TypeWriterState.UPPERCASE, TypeWriterState.LOWERCASE.endRow());
    }

}