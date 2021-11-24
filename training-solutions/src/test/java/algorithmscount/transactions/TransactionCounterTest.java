package algorithmscount.transactions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void testCountEntryLessThan() {
        List<Transaction> transactionList = Arrays.asList(
                new Transaction("32424",TransactionType.DEBIT,4),
                new Transaction("324264",TransactionType.DEBIT,6),
                new Transaction("329424",TransactionType.CREDIT,5),
                new Transaction("3324624",TransactionType.DEBIT,165),
                new Transaction("36372424",TransactionType.DEBIT,82),
                new Transaction("324167624",TransactionType.CREDIT,7),
                new Transaction("3254724",TransactionType.CREDIT,3),
                new Transaction("3228424",TransactionType.DEBIT,9),
                new Transaction("324264",TransactionType.CREDIT,12),
                new Transaction("3242454",TransactionType.CREDIT,32));

        int result = new TransactionCounter().countEntryLessThan(transactionList,10);
        assertEquals(3,result);

        assertEquals(0, new TransactionCounter().countEntryLessThan(transactionList,1));
        assertEquals(5, new TransactionCounter().countEntryLessThan(transactionList,170));
    }
}