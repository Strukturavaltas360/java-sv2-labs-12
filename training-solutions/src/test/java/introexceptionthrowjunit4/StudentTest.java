package introexceptionthrowjunit4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student();

    @Test
    void testAddNotes() {
        student.addNote(3);
        student.addNote(4);
        student.addNote(5);

        assertEquals(3, student.getNote().get(0));
        assertEquals(4, student.getNote().get(1));
        assertEquals(5, student.getNote().get(2));

        assertEquals(3, student.getNote().size());
    }

    @Test
    public void testAddNoteAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}
