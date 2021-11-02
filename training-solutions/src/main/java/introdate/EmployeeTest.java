package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        String name;
        int year;
        int month;
        int day;

        Scanner sc = new Scanner(System.in);

        System.out.println("Belépő dolgozó adatai");
        System.out.println("Név:");
        name = sc.nextLine();
        System.out.println("Születési év:");
        year = sc.nextInt();
        System.out.println("Születési hónap:");
        month = sc.nextInt();
        System.out.println("Születési nap:");
        day = sc.nextInt();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("\nNév: "+ employee.getName()
                +"\nSzületési dátum: "+ employee.getDateOfBirth()
                +"\nBelépés időpontja: " +employee.getBeginEmployment());
    }
}
