package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    List<BankAccount> accounts = Arrays.asList(
            new BankAccount("John","1286712112",121),
            new BankAccount("Joe","1212556112",321),
            new BankAccount("Mary","12321312",167),
            new BankAccount("Ingrid","12112",425));


    @Test
    void testContainsBalanceGreaterThan() {
        assertTrue(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts,400));
    }

    @Test
    void testContainsBalanceGreaterThanFalse() {
        assertFalse(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts,500));
    }

}