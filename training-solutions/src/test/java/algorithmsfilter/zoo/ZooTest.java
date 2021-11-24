package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    List<Animal> animals = Arrays.asList(
            new Animal("wolf",4),
            new Animal("lion",4),
            new Animal("spider",8),
            new Animal("bee",6),
            new Animal("penguin",2),
            new Animal("dolphin",0));

    @Test
    void testCreateZoo() {
        Zoo zoo = new Zoo(animals);
        assertEquals(6,zoo.animals.size());
        assertEquals(8,zoo.animals.get(2).getNumberOfLegs());
    }

    @Test
    void getAnimalsWithNumberOfLegsGiven() {
        Zoo zoo = new Zoo(animals);
        List<Animal> filteredAnimals = zoo.getAnimalsWithNumberOfLegsGiven(8);
        assertEquals(1,filteredAnimals.size());

        filteredAnimals = zoo.getAnimalsWithNumberOfLegsGiven(4);
        assertEquals(2,filteredAnimals.size());
    }
}