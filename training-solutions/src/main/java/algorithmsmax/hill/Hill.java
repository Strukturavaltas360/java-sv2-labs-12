package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> heights) {
        int max = heights.get(0);
        for (int actual: heights) {
            if (actual > max) {
                max = actual;
            }
        }
        return max;
    }
}
