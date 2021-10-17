package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getInfo() {
        return owner+" ("+accountNumber+"): "+balance+" Ft.";

        //Tóth Kálmán (10073217-12000098-67341590): 103400 Ft
    }
}
