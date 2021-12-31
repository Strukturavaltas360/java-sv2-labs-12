package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;


    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        waitingPeople = passengers;
        waitingCargo = cargoWeight;
        for (Ship s : ships) {
            if (s instanceof CanCarryGoods) {
                waitingCargo = ((CanCarryGoods) s).loadCargo(waitingCargo);
            }
            if (s instanceof CanCarryPassengers) {
                waitingPeople = ((CanCarryPassengers) s).loadPassenger(waitingPeople);
            }
        }
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
