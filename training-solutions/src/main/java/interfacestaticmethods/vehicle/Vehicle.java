package interfacestaticmethods.vehicle;

public interface Vehicle {

    static Vehicle of(int numberOfWheels) {
        switch (numberOfWheels) {
            case 2: return new Bicycle(2);
            case 4: return new Car("Skoda",4);
            default: throw new IllegalArgumentException("This is neither a bicycle nor a car.");
        }
    }
}
