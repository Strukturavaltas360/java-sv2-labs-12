package primitivetypes.primitivetypes.exam;


import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private double averageGrades;

    public Person(String name, LocalDate dateOfBirth, int zipCode, double averageGrades) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.averageGrades = averageGrades;
    }

    @Override
    public String toString() {
        return ("Név: " + name +"  | Születési dátum: "+ dateOfBirth + "  | Irányítószám: "+ zipCode+ "  | Átlag: "+ averageGrades);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverageGrades() {
        return averageGrades;
    }
}
