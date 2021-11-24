package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void testCreateSalesPerson() {
        Salesperson sp = new Salesperson(" John",180,160);
        assertEquals(160,sp.getTarget());
    }

}