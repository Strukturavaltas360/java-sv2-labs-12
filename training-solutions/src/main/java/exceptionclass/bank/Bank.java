package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts== null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void deposit(String account, double amount) {
        Account acc = getAccount(account);
        acc.deposit(amount);
    }

    public void payment(String account, double amount) {
        Account acc = getAccount(account);
        acc.subtract(amount);
    }

    private Account getAccount(String account) {
        for (Account acc: accounts) {
            if (acc.getAccountNumber().equals(account)) {
                return acc;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }
}
