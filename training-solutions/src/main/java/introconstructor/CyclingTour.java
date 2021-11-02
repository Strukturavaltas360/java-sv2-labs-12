package introconstructor;

import java.time.LocalDate;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public static void main(String[] args) {

        CyclingTour cyclingTour = new CyclingTour("Mecsekpölöskei gurulás",LocalDate.of(2021, 11, 20));
        System.out.println(cyclingTour.getDescription() +"  "+ cyclingTour.getStartTime()+"  "+cyclingTour.getKms()+"  "+cyclingTour.getNumberOfPeople());
        cyclingTour.registerPerson(4);
        cyclingTour.ride(23.5);
        System.out.println(cyclingTour.getDescription() +"  "+ cyclingTour.getStartTime()+"  "+cyclingTour.getKms()+"  "+cyclingTour.getNumberOfPeople());
        cyclingTour.registerPerson(2);
        cyclingTour.registerPerson(7);
        cyclingTour.registerPerson(1);
        cyclingTour.ride(13.9);
        cyclingTour.ride(21.0);
        cyclingTour.ride(19.1);
        System.out.println(cyclingTour.getDescription() +"  "+ cyclingTour.getStartTime()+"  "+cyclingTour.getKms()+"  "+cyclingTour.getNumberOfPeople());
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride(double km) {
        kms += km;
    }

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }
}
