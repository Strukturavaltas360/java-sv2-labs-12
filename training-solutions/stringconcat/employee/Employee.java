package stringconcat.employee;

public class Employee {

    String name;
    String occupation;
    int payment;

    public Employee(String name, String occupation, int payment) {
        this.name = name;
        this.occupation = occupation;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return name + " - "+occupation+" - " +payment+ " Ft";
    }
}
