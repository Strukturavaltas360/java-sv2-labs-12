package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool primarySchool;

    @BeforeEach
    void init() {
        List<Person> persons = Arrays.asList(
                new Person("Kiss Zoé", 66, "Pécs, Gyöngyös u. 5."),
                new Person("Új Ádám", 12, "Mohács, Álmos u. 2."),
                new Person("Nagy Edit", 10, "Pécs, Jókai tér 3."),
                new Person("Ábel Anita", 42, "Pécsvárad, Király u. 7."),
                new Person("Császár Ivett", 9, "Pécs, Kis u. 6."),
                new Person("Moha Péter", 36, "Pécs, Ilona u. 9."));

        primarySchool = new PrimarySchool(persons);
    }

    @Test
    void testGetStudents() {
        List<Student> studentList = primarySchool.getStudents();
        assertEquals("Császár Ivett", studentList.get(2).getName());
        assertEquals(3, studentList.size());
    }
}