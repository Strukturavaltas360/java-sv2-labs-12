package algorithmscount.transactions;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int limit) {

        int count = 0;
        for (Transaction actualTransaction : transactions) {
            if (actualTransaction.getTransactionOperation() == TransactionType.CREDIT && actualTransaction.getAmount() < limit) {
                count ++;
            }
        }
        return count;
    }
}
