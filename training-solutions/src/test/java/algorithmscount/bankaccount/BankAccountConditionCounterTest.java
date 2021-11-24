package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void testCountBalancesGreaterThan () {

        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("Dömötör Géza", "73773-334343-343434", 256_144),
                new BankAccount("Deres Péter", "7373-334343-34343454", 156_554),
                new BankAccount("Végh Éva", "7378773-334343-3413434", 46_149),
                new BankAccount("Kovács Gizella", "737793001-34343401", 96_154),
                new BankAccount("Fazekas Mariann", "72323773-3310104343-88343434", 210_188));

        int numberOfAccounts = new BankAccountConditionCounter().CountWithBalanceGreaterThan(bankAccounts, 100_000);
        assertEquals(3,numberOfAccounts);

        numberOfAccounts = new BankAccountConditionCounter().CountWithBalanceGreaterThan(bankAccounts, 256_144);
        assertEquals(0,numberOfAccounts);
    }
}