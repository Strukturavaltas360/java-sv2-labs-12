package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
    List<Integer> classes = Arrays.asList(15,21,18,20,19,16);
    int sum = new School().getNumberOfStudents(classes);
    assertEquals(109,sum);
    }

}