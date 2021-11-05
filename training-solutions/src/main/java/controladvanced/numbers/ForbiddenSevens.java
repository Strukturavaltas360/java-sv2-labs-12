package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001B[34;1mHonnan induljon a TiltottHetes? ");
        int from = scanner.nextInt();
            for (int i = from; i < 100; i++) {
                if (i%7 == 0) {
                    System.out.println("\u001B[33;1mX");
                    continue;
                } else {
                    if (Integer.toString(i).contains("7")) {
                        break;
                    }
                }
                System.out.println("\u001B[0;34m"+i);
            }
    }
}
