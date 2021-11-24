package algorithmsmax;

import java.util.Arrays;

public class Plane {

    public int getLongestOcean(String map) {
        String [] mapArray = map.split("1");
        int max = 0;
        for (String actualSlice: mapArray) {
            if (actualSlice.length() > max) {
                max = actualSlice.length();
            }
        }
        return max;
    }
}
