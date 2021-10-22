package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // Háromoperandusúval
        System.out.println("Megoldás háromoperandusúval: ");
        System.out.println(i == 1 ? "Felhasználók listázása" : (i == 2 ? "Felhasználó felvétele" : ""));

        // if-fel
        System.out.println("Megoldás If-fel:");

        if (i == 1) {
            System.out.println("Felhasználók listázása");
        } else {
            if (i == 2) {
                System.out.println("Felhasználó felvétele");
            } else {
                System.out.println("");
            }
        }
    }
}

