package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        int head;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány fős társaság érkezett?");
        head = scanner.nextInt();
        int seats=10;

        if (head >= 5) {
            head -= 5;
            seats -= 5;
            System.out.println("5 személyes csónak megtelt, további szabad férőhelyek száma: "+seats+".");
        }

        if (head >= 3) {
            head -= 3;
            seats -= 3;
            System.out.println("3 személyes csónak megtelt, további szabad férőhelyek száma: "+seats+".");
        }

        if (head >= 2) {
            head -= 2;
            seats -= 2;
            System.out.println("2 személyes csónak megtelt, további szabad férőhelyek száma: "+seats+".");
        }

        if (head == 1) {
            head --;
            seats -= 2;
            System.out.println("2 személyes csónak félig üresen fut ki. További szabad férőhelyek száma: "+seats+".");
        }

        System.out.println("További szabad férőhelyek száma: "+seats+".");
        System.out.println("Parton maradtak száma: " + head+".");

    }
}
