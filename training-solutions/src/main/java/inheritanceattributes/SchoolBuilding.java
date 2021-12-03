package inheritanceattributes;

public class SchoolBuilding extends Building{
    private int numberOfClassRooms;


    public int getNumberOfClassRooms() {
        return numberOfClassRooms;
    }

    public SchoolBuilding(String name, double area, int floors, int numberOfClassRooms) {
        super(name, area, floors);
        this.numberOfClassRooms = numberOfClassRooms;
    }
}
