package controliteration.division;

import java.util.Scanner;

public class Division {

    public void getNumbersWithFor(int number, int divider) {
        System.out.print("\u001B[30;44;1m With for:\t\t");
        for (int smallerIntThanNumber = 1; smallerIntThanNumber <number; smallerIntThanNumber++) {
            if (smallerIntThanNumber % divider ==0) {
                System.out.print(smallerIntThanNumber+" | ");
            }
        }
    }

    public void getNumbersWithWhile(int number, int divider) {
        System.out.print("\u001B[30;42;1m With while:\t");
        int smallerIntThanNumber = 1;
        while (smallerIntThanNumber<number) {
            if (smallerIntThanNumber % divider ==0) {
                System.out.print(smallerIntThanNumber+" | ");}
            smallerIntThanNumber++;
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        Scanner scanner = new Scanner((System.in));

        System.out.println();
        System.out.print("\u001B[35;1mAdjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.  ");
        int number = scanner.nextInt();
        System.out.print("\u001B[35;1mHánnyal osztható számokat szeretne kapni?  ");
        int divider = scanner.nextInt();
        System.out.println();

        division.getNumbersWithFor(number,divider);

        System.out.println("\u001B[39;49;0m");
        division.getNumbersWithWhile(number,divider
        );
    }
}
