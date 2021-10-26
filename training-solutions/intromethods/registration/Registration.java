package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String addNames(String firstname, String lastname) {
            return firstname +" "+ lastname;
    }

    public LocalDate convertIntsToDate (int year, int month, int day){
        return LocalDate.of(year,month,day);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Registration reg = new Registration();

        System.out.println("A regisztrációhoz szükség lesz néhány adatra!");
        System.out.print("Vezetéknév: ");
        String firstname = sc.nextLine();
        System.out.print("Keresztnév: ");
        String lastname = sc.nextLine();

        String fullname = reg.addNames(firstname,lastname);

        System.out.print("Születési év: ");
        int yearofBirth = sc.nextInt();
        System.out.print("Születés hónapja: ");
        int monthOfBirth = sc.nextInt();
        System.out.print("Születés napja: ");
        int dayOfBirth = sc.nextInt();
        LocalDate dateOfBirth = reg.convertIntsToDate(yearofBirth, monthOfBirth, dayOfBirth);

        sc.nextLine();
        System.out.print("E-mail elérhetőség: ");
        String email = sc.nextLine();

        Person person1 = new Person(fullname, dateOfBirth, email);
        System.out.println(person1);
    }
}
