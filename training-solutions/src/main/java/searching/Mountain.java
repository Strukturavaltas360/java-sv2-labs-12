package searching;

import java.util.Arrays;

public class Mountain {

    private int[] heightsArray;

    public Mountain(int[] heightsArray) {
        this.heightsArray = heightsArray;
    }

    public boolean searchPike(Pike pike) {
        int heightToFind = pike.getHeight();
        return Arrays.binarySearch(heightsArray, heightToFind) >= 0;

    }
}
