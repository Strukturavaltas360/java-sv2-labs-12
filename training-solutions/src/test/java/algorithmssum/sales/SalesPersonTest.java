package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesPersonTest {

    @Test
    void testCreateSalesPerson() {
    SalesPerson salesPerson = new SalesPerson("Ingrid",245);

    assertEquals("Ingrid",salesPerson.getName());
    assertEquals(245,salesPerson.getAmount());
    }
}