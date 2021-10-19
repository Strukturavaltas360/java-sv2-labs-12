package Statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek adj meg egy egész számot, megvizsgálom, osztható-e hárommal:");
        input = scanner.nextInt();

        System.out.println(input % 3 ==0 ? "igen" : "nem");

    }
}
