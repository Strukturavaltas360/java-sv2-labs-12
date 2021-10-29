package primitivetypes.primitivetypes.exam;

import packages.prefix.Prefix;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Név: ");
        String name= scanner.nextLine();
        System.out.print("Születési dátum (YYYY-MM-DD): ");
        String dateOfBirthS = scanner.nextLine();
        System.out.print("Irányítószám: ");
        String zipCodeS = scanner.nextLine();
        System.out.print("Átlag: ");
        String averageGradeS = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthS);
        int zipCode = Integer.parseInt(zipCodeS);
        double averageGrade = Double.parseDouble(averageGradeS);

        Person person = new Person(name,dateOfBirth,zipCode,averageGrade);
        System.out.println(person);

        Exam exam = new Exam();
        exam.addPerson(person);

        Person person1 = person;
        Person person2 = person;

        exam.addPerson(person1);
        exam.addPerson(person2);

        System.out.println(exam.getPersonlist());



    }
}
//újabb metódushívással készítesz megfelelő számokat a szövegként beérkezett adatokból!