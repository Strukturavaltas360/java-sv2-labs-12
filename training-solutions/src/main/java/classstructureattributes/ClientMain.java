package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client1 = new Client();

        System.out.println("Kérlek add meg a nevedet!");
        client1.name = scanner.nextLine();

        System.out.println("Kérlek add meg a születési évedet");
        client1.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérlek add meg a lakcímedet!");
        client1.address = scanner.nextLine();

        System.out.println("Adatkezelési szabályzatunk szerint rendszerünk az alábbi adatokat tartja nyilván rólad:");
        System.out.println("Név: "+client1.name+"  | Születési év: " + client1.year+" |  Lakcím: "+client1.address);
        }

}
