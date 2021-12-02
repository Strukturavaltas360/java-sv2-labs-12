package dynamictypes.school;

public class School {
    private String name;
    private int numberOfYears;

    public School(String name, int numberOfYears) {
        this.name = name;
        this.numberOfYears = numberOfYears;
    }

    @Override
    public String toString() {
        return "Name of the school: " + name + "  |  Number of years: " + numberOfYears;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
}
