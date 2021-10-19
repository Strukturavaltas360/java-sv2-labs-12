package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(123, true);

        System.out.println(distance.getdistanceInKm());
        System.out.println(distance.isExact());

        int distanceInKmInt;
        distanceInKmInt = (int) distance.getdistanceInKm();

        System.out.println(distanceInKmInt);

    }

}
