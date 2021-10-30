package mathproblems;

import java.sql.Array;

public class Division {

    public void getDivisors(int number) {
        System.out.print("A "+number+" osztói: |");
        for (int i = 1; i<= number;i++) {
            System.out.print(number%i ==0 ? i+" | "  : "");
        }
        System.out.println();
    }

    public void getRightNumbers(int[] numbers){
        for (int i =1; i<numbers.length;i++) {
            System.out.print(numbers[i]%i ==0 ? numbers[i]+" | ":"");

        }
    }

    public static void main(String[] args) {
        Division div = new Division();

        div.getDivisors(72);

        int [] numbers = {2,4,6,7,8,9,10,14};
        div.getRightNumbers(numbers);
    }

}
