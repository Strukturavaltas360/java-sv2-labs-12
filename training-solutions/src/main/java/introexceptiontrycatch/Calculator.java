package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg az 'a' operandust! ");
        String s = sc.nextLine();

        int a = 0;
        try {
            a = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem szám, 0-t használunk helyette.");
        }

        System.out.print("Add meg a 'b' operandust! ");
        s = sc.nextLine();

        int b = 0;
        try {
            b = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem szám, 0-t használunk helyette.");

        }

        System.out.print("Add meg az operátort (+,-,*,/)! ");
        s = sc.nextLine();
        switch (s) {
            case "+":
                System.out.println("Az eredmény: " + (a+b));
                return;
            case "-":
                System.out.println("Az eredmény: " + (a-b));
                return;
            case "*":
                System.out.println("Az eredmény: " + (a*b));
                return;
            case "/":
                try {
                    System.out.println("Az eredmény: " + (a/b));
                }
                catch (ArithmeticException ae) {
                    System.out.println("0-val osztás kivétel - " +ae.getMessage());
                }
                return;
            default:
                System.out.println(s + " - nincs ilyen alapművelet");
        }
    }
}
