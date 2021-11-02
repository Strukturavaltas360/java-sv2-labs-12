package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Az alkalmazás segítségével két egész típusú számot tudsz összeadni.");
        System.out.println("A program további használatával elfogadod az Általános Szerződési Feltételeinket.");

        System.out.println("Kérlek, add meg az összeadandó számok első tagját: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Kérlek, add meg az összeadandó számok második tagját: ");
        int secondNumber = scanner.nextInt();

        System.out.println();
        System.out.println(firstNumber + " + " +secondNumber);
        System.out.println(firstNumber + secondNumber);
        System.out.println();

        System.out.println("Kérünk, hogy az ÁSZF 3.2.5 pontja értelmében az eredmény 5%-át, azaz $"+ (firstNumber+secondNumber)*0.05+" összeget támogatásként utald el az éhező programozók bankszámlájára.");
        System.out.println("Köszönjük.");

    }
}
