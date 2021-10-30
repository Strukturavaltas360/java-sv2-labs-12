package numbers;

import java.util.Scanner;

public class Percent {

    public double getValue(int number1, int number2){
        return number1*number2/100d;
    }

    public double getBase(int number1, int number2){
        return number1/(number2/100.0);
    }

    public double getPercent(int number1, int number2){
        return (number2*100.0)/number1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Percent percent = new Percent();
        System.out.println(" A százalékszámításokhoz kérlek adj meg két egész számot! ");
        System.out.print("Első szám: ");
        int number1 = scanner.nextInt();
        System.out.print("Második szám: ");
        int number2 = scanner.nextInt();
        System.out.println("A " + number1 +" "+ number2+"%-a "+percent.getValue(number1,number2)+".");
        System.out.println("A " + number1 +" a(z) "+number2+ " "+percent.getBase(number1,number2)+"%-a.");
        System.out.println("A "+ number1+"-na(e)k a(z) "+number2+" a(z) "+ percent.getPercent(number1,number2)+"%-a.");
    }
}
