package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    List<String> bunch = new LinkedList<>();

    public void addFlower(String flower) {
        bunch.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        int position = bunch.size();
        if (position % 2 == 0) {
            bunch.add(position / 2, flower);
        } else {
            bunch.add(position / 2, flower);
            bunch.add((position / 2) + 2, flower);
        }
    }

    public List<String> getBunch() {
        return new LinkedList<>(bunch);
    }
}
