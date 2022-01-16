package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private int area;
    private Integer levels;

    @Override
    public int compareTo(Building o) {
        return this.levels.compareTo(o.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(levels, building.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                "}\n";
    }

    public Building(String address, int area, Integer levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public static void main(String[] args) {

        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Jókai 2", 130, 3));
        buildings.add(new Building("Petőfi 2", 59, 4));
        buildings.add(new Building("Bálicsi út 84", 30, 1));
        buildings.add(new Building("Süllő 3", 67, 7));
        buildings.add(new Building("Pipacs u. 9", 189, 2));

        System.out.println(buildings);

    }
}
