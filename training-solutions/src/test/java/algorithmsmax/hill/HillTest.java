package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testGetMax() {
        List<Integer> heights = Arrays.asList(3456,5678,4789,7854,8754,7621,3459,9431,9898,8953);
        assertEquals(9898, new Hill().getMax(heights));
    }

}