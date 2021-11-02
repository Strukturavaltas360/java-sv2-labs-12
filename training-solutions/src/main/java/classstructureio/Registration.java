package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A regisztrációhoz szükségünk lesz néhány adatra.");

        System.out.println("Kérlek add meg a neved:");
        String name = scanner.nextLine();

        System.out.println("Kérlek add meg az emailcímed:");
        String email = scanner.nextLine();

        System.out.println("Szolgáltatásunkra az alábbi adatokkal regisztráltál:");
        System.out.println("Név: " + name + " | E-mail: "+email);

    }
}
