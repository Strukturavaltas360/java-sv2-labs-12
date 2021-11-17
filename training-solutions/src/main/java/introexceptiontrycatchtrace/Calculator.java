package introexceptiontrycatchtrace;

import java.util.Scanner;

public class Calculator {

    public int inputOperandus(String inputQuestion){
        Scanner sc = new Scanner(System.in);
        System.out.print(inputQuestion);
        String s = sc.nextLine();
        return Integer.parseInt(s);
    }

    public String inputOperator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg az operátort (+,-,*,/)! ");
        return sc.nextLine();
    }

    public int addition (int a, int b) {
        return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    public int division(int a, int b) {
        return a/b;
    }

}
