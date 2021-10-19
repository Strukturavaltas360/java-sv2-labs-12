package Statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds =  scanner.nextInt();

        Time nr1 = new Time(hours, minutes, seconds);

        System.out.println(nr1.getInMinutes());
        System.out.println(nr1.getInSeconds());
    }
}
/*
A TimeMain osztály main() metódusában teszteld az osztályt!
Kérj be a felhasználótól két időpontot, és írd ki az elsőt teljesen majd percekben,
a másodikat teljesen majd másodpercekben, illetve azt, hogy az első korábbi-e, mint a második!

Egy lehetséges kimenet:

Az első időpont 12:3:43 = 723 perc
A második időpont 4:21:38 = 15698 másodperc
Az első korábbi, mint a második: false
 */