package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    List<String> bunch = new LinkedList<>();

    public void addFlower(String flower) {
        bunch.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        int position = bunch.size()/2;
        if (bunch.size() % 2 == 0) {
            bunch.add(position, flower);
        } else {
            bunch.add(position, flower);
            bunch.add(position + 2, flower);
        }
    }

    public List<String> getBunch() {
        return new LinkedList<>(bunch);
    }
}
