package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("A bankszámla létrehozásához adatok kellenek!");
        System.out.println("A bankszámla száma:");
        String accountNumber = scanner.nextLine();

        System.out.println("A számlatulajdonos neve:");
        String owner = scanner.nextLine();

        System.out.println("A számla egyenlege:");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber,owner,balance);
        System.out.println(bankAccount.getInfo());
    }
}
