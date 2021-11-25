package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testCreatePerson() {
        Student student = new Student("Vígh Imre","Pécs, Kis u. 23");
        assertEquals("Vígh Imre", student.getName());
    }
}