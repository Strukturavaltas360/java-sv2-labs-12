package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> freezedFood = new ArrayList<>();
        freezedFood.add("töltöttkáposzta");
        freezedFood.add("jégkocka");
        freezedFood.add("pulykamell");
        freezedFood.add("meggy");
        freezedFood.add("zöldbab");

        System.out.println(freezedFood.toString()+", elemek száma: "+ freezedFood.size());
        freezedFood.remove("meggy");
        freezedFood.remove("töltöttkáposzta");
        System.out.println(freezedFood.toString()+", elemek száma: "+ freezedFood.size());
    }
}
