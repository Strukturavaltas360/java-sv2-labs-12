package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        int inputNr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek adj meg egy számot");
        inputNr = scanner.nextInt();

        if (inputNr>100) {
            System.out.println("A(z) "+inputNr+" nagyobb, mint 100");
        } else {
            System.out.println("A(z) " + inputNr+" kisebb, mint 100");
        }

    }
}
