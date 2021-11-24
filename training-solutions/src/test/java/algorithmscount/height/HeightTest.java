package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {
    @Test
    void testCountChildrenWithHeightGreaterThan() {
        List<Integer> childrenHeight = Arrays.asList(140,138,123,160,122,111,146,151);
        int heads = new Height().countChildrenWithHeightGreaterThan(childrenHeight,130);
        assertEquals(5,heads);
    }
}