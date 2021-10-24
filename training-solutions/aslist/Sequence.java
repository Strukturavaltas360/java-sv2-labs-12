package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList(Arrays.asList(1,2));

        System.out.println();
        System.out.println("A lista eredeti tartlam: " +elements);
        System.out.println();

        for (int i = 0;i<5;i++) {
            int value = elements.get(elements.size()-1)*elements.get(elements.size()-2);
            elements.add(value);
        }

        System.out.println(" A lista új tartalma: "+elements);
        System.out.println(" A lista "+elements.size()+" elemből áll.");
    }
}
