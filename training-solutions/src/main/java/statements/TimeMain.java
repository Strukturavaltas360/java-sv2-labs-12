package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Első időpont:");
        System.out.println("Óra:");
        int hours = scanner.nextInt();
        System.out.println("Perc:");
        int minutes = scanner.nextInt();
        System.out.println("Másodperc:");
        int seconds =  scanner.nextInt();

        Time time1 = new Time(hours, minutes, seconds);

        System.out.println("Második időpont:");
        System.out.println("Óra:");
        hours = scanner.nextInt();
        System.out.println("Perc:");
        minutes = scanner.nextInt();
        System.out.println("Másodperc:");
        seconds =  scanner.nextInt();

        Time time2 = new Time(hours, minutes, seconds);


        System.out.println("Az első időpont: " + time1.toString() +" = "+time1.getInMinutes() + " perc.");
        System.out.println("A második időpont: " + time2.toString() +" = "+time2.getInSeconds() + " másodperc.");
        System.out.println("Az első korábbi, mint a második: " + time1.earlyerThan(time2)+ "  Méghozzá "+ (time2.getInSeconds() - time1.getInSeconds())+" másodperccel.");

    }
}
