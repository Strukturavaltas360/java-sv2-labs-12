package inheritancemethods.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Extracapacity is less than extrafuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    @Override
    public void drive(int km) {
        if (isEnoughFuel(km)) {
            double usedFuel = km * (getFuelRate() / 100);
            extraFuel -= usedFuel;
            if (extraFuel < 0) {
                modifyFuelAmount(extraFuel);
                extraFuel = 0;
            }
        } else {
            throw new IllegalArgumentException("Sorry, fuel was not enough for the ride, you have to walk!");
        }
    }

    private boolean isEnoughFuel(int km) {
        return getFuel() + extraFuel > km * (getFuelRate() / 100);
    }

    public double calculateRefillAmount() {
        return getTankCapacity() + extraCapacity - getFuel() - extraFuel;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
