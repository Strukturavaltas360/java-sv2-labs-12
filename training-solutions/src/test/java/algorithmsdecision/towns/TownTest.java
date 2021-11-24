package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testTown() {
        List<Integer> towns = Arrays.asList(4546,4564,232,467,878,223,567,89,1334,3453);
        assertTrue(new Town().containsFewerHabitants(towns,100));
        assertTrue(new Town().containsFewerHabitants(towns,90));
        assertFalse(new Town().containsFewerHabitants(towns,88));
    }

}