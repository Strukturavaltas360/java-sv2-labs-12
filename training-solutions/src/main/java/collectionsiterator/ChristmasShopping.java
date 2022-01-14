package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    List<ChristmasPresent> christmasPresent = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> christmasPresent) {
        this.christmasPresent = christmasPresent;
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresent.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> i = christmasPresent.iterator();
        while (i.hasNext()) {
            if (i.next().getPrice() > maxPrice) {
                i.remove();
            }
        }
    }
}
