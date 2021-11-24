package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testCreateBankAccount() {
        BankAccount bankAccount = new BankAccount("Dömötör Géza","73773-334343-343434",256_144);

        assertEquals("Dömötör Géza",bankAccount.getNameOfOwner());
        assertEquals("73773-334343-343434",bankAccount.getAccountNumber());
        assertEquals(256_144,bankAccount.getBalance());
    }
}