package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérlek add meg a nevedet! ");
        String name = sc.nextLine();
        System.out.print("Melyik filmre szeretnél jegyet venni? ");
        String title = sc.nextLine();
        System.out.print("Hány jegyet kérsz? ");
        int number = sc.nextInt();
        System.out.print("Melyik sorba szeretrnél ülni? ");
        int row = sc.nextInt();

        System.out.printf("Vásárló neve: %s\nFilm címe: %s\n",name,title);
        for (int i = 1; i<= number; i++) {
            System.out.print(" | "+row +". sor, "+i+". szék |");
        }
        System.out.println();
        System.out.println("Jó szórakozást!");
    }
}
