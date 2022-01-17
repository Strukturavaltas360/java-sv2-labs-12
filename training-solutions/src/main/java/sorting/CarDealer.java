package sorting;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> result = getCars();
        result.sort(new CarPriceComparator());
        return result;
    }

    public List<Car> getCarsOrderedByYearOfConstruction() {
        List<Car> result = getCars();
        result.sort(new CarConstructionComparator());
        return result;
    }
}
