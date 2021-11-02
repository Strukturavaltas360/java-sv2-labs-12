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

        System.out.println();
        System.out.println(bankAccount.getInfo());

        System.out.println();
        System.out.println("A bankszámlára befizetendő összeg (Ft-ban megadva):");
        int amountOfDeposit = scanner.nextInt();
        bankAccount.deposit(amountOfDeposit);
        System.out.println("Új számlaegyenleg:");
        System.out.println(bankAccount.getInfo());

        System.out.println();
        System.out.println("A bankszámláról felvenni kívánt összeg (Ft-ban megadva):");
        int amountOdWithdraw = scanner.nextInt();
        bankAccount.withdraw(amountOdWithdraw);
        System.out.println("Új számlaegyenleg:");
        System.out.println(bankAccount.getInfo());
    }
}
