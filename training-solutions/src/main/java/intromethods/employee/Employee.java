package intromethods.employee;

public class Employee {


    String name;
    int hiringYear;
    int salary;

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "hiringYear= " + hiringYear +
                " | name= '" + name + '\'' +
                "| salary= " + salary +
                '}';
    }

    public void raiseSalary(int raise) {
        salary += raise;
    }

}
