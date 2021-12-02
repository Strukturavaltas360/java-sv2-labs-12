package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();

        Fruit fruit = new Fruit();
        objects.add(fruit);

        Apple apple = new Apple();
        objects.add(apple);

        Starking starking = new Starking();
        objects.add(starking);

        Vegetable vegetable = new Vegetable();
        objects.add(vegetable);

        objects.add("alma");
        objects.add(12);
        objects.add('x');

        LocalDate localDate = LocalDate.now();
        objects.add(localDate);

        int [] intArray = new int[8];
        objects.add(intArray);

        List<String> lines = new ArrayList<>();
        objects.add(lines);

        System.out.println(objects);
    }
}