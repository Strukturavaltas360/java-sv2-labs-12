package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {

        int sum = 0;
        for (Transaction actualTransaction : transactions) {
            if (actualTransaction.getTransactionOperation() == TransactionOperation.CREDIT) {
                sum += actualTransaction.getAmount();
            }
        }
        return sum;
    }
}
