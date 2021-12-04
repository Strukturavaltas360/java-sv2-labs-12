package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel += fuel;
    }

    public void drive(int km) { // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
        if (isEnoughFuel(km)) {
            modifyFuelAmount(-1*km*(fuelRate/100));
        } else {
            throw new IllegalArgumentException("Sorry, fuel was not enough for the ride, you have to walk!");
        }
    }

    private boolean isEnoughFuel(int km) {
        return (fuel >= km*(fuelRate/100));
    }

    public double calculateRefillAmount() { //kiszámolja, mennyit lehet tankolni
        return tankCapacity - fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
