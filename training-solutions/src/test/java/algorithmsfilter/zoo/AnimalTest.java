package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testCreateAnimal() {
        Animal animal = new Animal("lion",4);
        assertEquals(4,animal.getNumberOfLegs());
        assertEquals("lion",animal.getName());
    }

}