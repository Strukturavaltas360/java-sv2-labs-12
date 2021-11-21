package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> birthDayList = new ArrayList<>();
        int count = 0;
        String name;
        String date;

        System.out.print("How many birthdays do you want to register? " );
        try {
            count = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Not a number!", nfe);
        }
        
        for (int i =1; i<=count; i++) {
            System.out.print("Please enter the name of the person: ");
            name = sc.nextLine();
            System.out.print("Please enter the date of birthday! ");
            date = sc.nextLine();
            birthDayList.add(name+", "+date);
        }

        try {
            Files.write(Paths.get("birthdays.csv"),birthDayList);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
