package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int sum =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek addj meg 5 egész számot");
        for (int i=0; i<5; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("A bekért számok összege:" + sum);
    }
}
