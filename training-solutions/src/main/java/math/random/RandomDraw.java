package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Péter");
        names.add("Géza");
        names.add("Szabolcs");
        names.add("Tamás");
        names.add("Klára");
        names.add("Judit");
        names.add("Eszter");
        names.add("Hajnalka");
        names.add("Éva");
        names.add("László");

        Random rnd = new Random();
        int firstNameIndex = rnd.nextInt(5);
        int secondNameIndex= 5+ rnd.nextInt(5);

        System.out.println(firstNameIndex+" "+secondNameIndex);
        System.out.println(names.get(firstNameIndex)+ " és "+ names.get(secondNameIndex));

    }
}
