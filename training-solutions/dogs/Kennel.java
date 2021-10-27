package dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        Dog buksi = new Dog("Buksi",4,"brown");
        Dog morzsi = new Dog("Morzsi",7,"white");
        Dog muzli = new Dog("Műzli", 2,"black");

        dogs.add(buksi);
        dogs.add(morzsi);
        dogs.add(muzli);
        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("gray");
        System.out.println(dogs);

        Dog dog5 = new Dog("Szalonna",1,"brown");
        System.out.println(dog5);
        dog5=dogs.get(1);
        System.out.println(dog5);

        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog6.setColour("white");
        System.out.println(dogs);

        List<Dog> anotherdogs = dogs;
        Dog dog7 = dog4;
        dog7.setColour("gold");
        System.out.println(anotherdogs);

        morzsi.setColour("yellow");
        System.out.println(anotherdogs);

        morzsi = null;
        System.out.println(anotherdogs);

        Dog dog8 = dogs.get(1);
        dog8 = null;

        System.out.println(anotherdogs);

        Dog dog9 = dogs.get(1);
        dog9.setColour("white");
        System.out.println(anotherdogs);
        
    }
}
