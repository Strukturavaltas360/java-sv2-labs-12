package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testTemperature() {
        List<Integer> temperatures = Arrays.asList(2,3,4,6,7,6,7,8,7,5,3,2,0,-1);
        assertEquals(-1,new Temperature().getMin(temperatures));
    }

}