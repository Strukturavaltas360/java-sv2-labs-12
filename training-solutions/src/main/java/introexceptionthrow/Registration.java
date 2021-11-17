package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üdvözöllek, kedves felhasználó!");
        System.out.print("Hogy szólíthatlak? ");
        String name = scanner.nextLine();
        boolean valid = true;

        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            valid = false;
        }

        System.out.print("Kérlek add meg az életkorod! ");
        String ageString = scanner.nextLine();

        try {
            validation.validateAge(ageString);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            valid = false;
        }

        System.out.println("A regisztrációhoz megadott adatok: ");
        System.out.println("Név: "+name+"  |  Életkor: "+ageString);
        System.out.println(valid ? "Sikeres regisztráció" : "Sikertelen regisztráció");
    }
}
