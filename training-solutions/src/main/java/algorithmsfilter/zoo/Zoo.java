package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> resultList = new ArrayList<>();
            for (Animal actual: animals) {
                if (actual.getNumberOfLegs() == numberOfLegs) {
                    resultList.add(actual);
                }
            }
        return resultList;
    }


}
