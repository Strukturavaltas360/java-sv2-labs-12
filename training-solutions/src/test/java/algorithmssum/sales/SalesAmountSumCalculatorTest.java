package algorithmssum.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void testSumSalesAmount() {
        List<SalesPerson> testCompany = Arrays.asList(
                new SalesPerson("Béla",150),
                new SalesPerson("Juci",210),
                new SalesPerson("Vera",280),
                new SalesPerson("Ádám",260));

        int sum = new SalesAmountSumCalculator().sumSalesAmount(testCompany);
        assertEquals(900,sum);

    }

}