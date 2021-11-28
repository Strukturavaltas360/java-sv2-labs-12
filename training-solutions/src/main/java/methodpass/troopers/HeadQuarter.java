package methodpass.troopers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> trooperList = new ArrayList<>();

    public void moveTrooperByName(String name, Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null");
        }
        Trooper t = findTrooperByName(name);
        if (t != null) {
            moveTrooper(t, target);
        }
    }

    public void moveClosestTrooper(Position target){
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null");
        }
        Trooper t = findClosestTrooper(target);
        if (t != null) {
            moveTrooper(t, target);
        }
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper actual: trooperList) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {

        Trooper closestTrooper = null;
        for (Trooper actual: trooperList) {
            if (closestTrooper== null || actual.distanceFrom(target) < closestTrooper.distanceFrom(target)) {
                closestTrooper = actual;
            }
        }
        return closestTrooper;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null ){
            throw new IllegalArgumentException("Trooper must not be null.");
        }
        trooperList.add(trooper);
    }

    public List<Trooper> getTrooperList() {
        return trooperList;
    }
}
