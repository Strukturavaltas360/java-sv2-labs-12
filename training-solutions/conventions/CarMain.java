package conventions;

public class CarMain {

    public static void main(String[] args) {


        Car car = new Car("Mini Cooper","1.6 D",4,5);

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

        car.setCarType("Mazda");
        car.setEngineType("1.3");
        car.setDoors(4);
        car.setPersons(5);

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

        car.addModelName("MX-3");

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());
    }
    //Végül írj hozzá egy CarMain nevű osztályt, amelyben teszteled, hogy tényleg minden jól működik-e!
}
