package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        int a =0;
        try {
            a = calculator.inputOperandus("Add meg az első operandust! ");
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem szám, 0-t használunk helyette.");
        }

        int b =0;
        try {
            b = calculator.inputOperandus("Add meg a második operandust! ");
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem szám, 0-t használunk helyette.");
        }



        switch (calculator.inputOperator()) {
            case "+":
                System.out.println("Az eredmény: " + calculator.addition(a,b));
                return;
            case "-":
                System.out.println("Az eredmény: " + calculator.subtraction(a,b));
                return;
            case "*":
                System.out.println("Az eredmény: " + calculator.multiplication(a,b));
                return;
            case "/":
                try {
                    System.out.println("Az eredmény: " + calculator.division(a,b));
                }
                catch (ArithmeticException ae) {
                    System.out.println("0-val osztás!");
                }
                return;
            default:
                System.out.println("Nincs ilyen alapművelet!");
        }
    }
}
