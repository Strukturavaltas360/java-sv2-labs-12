package algorithmscount.transactions;

public class Transaction {
    private String accountNumber;
    private TransactionType transactionType;
    private int amount;

    public Transaction(String accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransactionOperation() {
        return transactionType;
    }

    public int getAmount() {
        return amount;
    }
}
