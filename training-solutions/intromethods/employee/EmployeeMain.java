package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jack Doe",2019,456000);
        System.out.println(employee1);
        employee1.raiseSalary(44000);
        System.out.println("After some raising in salary"+System.lineSeparator()+employee1);
        employee1.setName("Laura Horvath");
        System.out.println("After changing the name of the employee"+System.lineSeparator()+ employee1);

    }
}
