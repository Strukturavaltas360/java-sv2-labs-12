package isahasa.inhabitant;

public class Inhabitant extends Person {

    ParkingPlace parkingPlace;

    public Inhabitant(String name, ParkingPlace parkingPlace) {
        super(name);
        this.parkingPlace = parkingPlace;
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public void changeParkingPlace(int newNumber) {
        ParkingPlace newPlace = new ParkingPlace(newNumber);
        parkingPlace = newPlace;
    }
}
