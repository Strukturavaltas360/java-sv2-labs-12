package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreatePerson() {
        Person person = new Person("Vígh Imre",13,"Pécs, Kis u. 23");
        assertEquals(13, person.getAge());
    }

}