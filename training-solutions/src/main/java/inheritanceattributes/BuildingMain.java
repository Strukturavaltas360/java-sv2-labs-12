package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("Office building", 1653,3);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Jurisics",3232,2,24);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.getNumberOfClassRooms());
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println((schoolBuilding.getFloors()));
    }
}
