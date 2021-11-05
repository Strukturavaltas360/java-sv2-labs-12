package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001B[35;1mAdja meg a fibonacci elemek számát! : ");
        int items = scanner.nextInt();

        System.out.print("\u001B[30;44;2m For    | 0 | 1 | ");
        int fibprevprev = 0;
        int fibprev = 1;
        int fib;

        for (int i = 1; i<= items-2;i++) {
            fib = fibprev+fibprevprev;
            System.out.print(fib+" | ");
            fibprevprev = fibprev;
            fibprev = fib;
        }
        System.out.println("\u001B[39;49;0m");
        System.out.print("\u001B[30;43;2m While: | 0 | 1 | ");
        fibprevprev = 0;
        fibprev = 1;
        int i =1;
        while (i<=items-2) {
            fib = fibprev + fibprevprev;
            System.out.print(fib+" | ");
            fibprevprev = fibprev;
            fibprev = fib;
            i++;
        }
    }
}
