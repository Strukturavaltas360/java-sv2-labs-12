package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    List<Dog> dogs = new ArrayList<>();
    private static long code = 1;

    private void addDog(Dog dog) {
        dog.setCode(code);
        code++;
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
