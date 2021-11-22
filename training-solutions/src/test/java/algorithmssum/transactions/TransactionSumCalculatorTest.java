package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void testSumAmountOfCreditEntries() {
        List<Transaction> testTransacions = Arrays.asList(
                new Transaction ("22323223",TransactionOperation.CREDIT,20),
                new Transaction("2454323223",TransactionOperation.CREDIT,10),
                new Transaction("2232322653",TransactionOperation.DEBIT,30),
                new Transaction("2232ttz3223",TransactionOperation.CREDIT,50),
                new Transaction("223232rtr23",TransactionOperation.DEBIT,40),
                new Transaction("2232322883",TransactionOperation.CREDIT,20));

        int sum = new TransactionSumCalculator().sumAmountOfCreditEntries(testTransacions);
        assertEquals(100,sum);

    }



}
