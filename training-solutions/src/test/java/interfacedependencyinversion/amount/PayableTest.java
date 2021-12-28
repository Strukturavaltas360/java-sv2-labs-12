package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testPayable() {
        Payable amount = new Amount();
        assertEquals(15,amount.getPayableAmount(15));

        amount = new BankAtm();
        assertEquals(2000, amount.getPayableAmount(1224));

        amount = new Cash();
        assertEquals(565, amount.getPayableAmount(567));
        assertEquals(560, amount.getPayableAmount(561));
        assertEquals(560, amount.getPayableAmount(558));
    }
}