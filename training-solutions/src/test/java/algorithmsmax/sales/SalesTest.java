package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salespersonList = Arrays.asList(
            new Salesperson("John",195,265),
            new Salesperson("Vick",327,260),
            new Salesperson("Joe",321,190),
            new Salesperson("Angie",190,160),
            new Salesperson("Mary",278,110),
            new Salesperson("Louie",280,310));


    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {

        Salesperson sp = new Sales().selectSalesPersonWithMaxSalesAmount(salespersonList);
        assertEquals("Vick", sp.getName());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        Salesperson sp = new Sales().selectSalesPersonWithFurthestAboveTarget(salespersonList);
        assertEquals("Mary", sp.getName());
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {
        Salesperson sp = new Sales().selectSalesPersonWithFurthestBelowTarget(salespersonList);
        assertEquals("John", sp.getName());

    }

}