package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {


    public int sumSalesAmount(List<SalesPerson> salesPersonList) {

        int sum = 0;
        for (SalesPerson actual: salesPersonList) {
            sum += actual.getAmount();
        }
        return sum;
    }
}
