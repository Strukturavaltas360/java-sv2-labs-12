package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> p) {
        Pendrive bestPendrive = null;
        for (Pendrive actual : p) {
            if (bestPendrive == null || bestPendrive.comparePricePerCapacity(actual) > 0) {
                bestPendrive = actual;
            }
        }
        return bestPendrive;
    }

    public Pendrive getCheapest(List<Pendrive> p) {
        Pendrive cheapestPendrive = null;
        for (Pendrive actual : p) {
            if (cheapestPendrive == null || actual.isCheaperThan(cheapestPendrive)) {
                cheapestPendrive = actual;
            }
        }
        return cheapestPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> p, int percent, int capacity){
        for (Pendrive actual: p) {
            if (actual.getCapacity() == capacity) {
                actual.risePrice(percent);
            }
        }
    }
}