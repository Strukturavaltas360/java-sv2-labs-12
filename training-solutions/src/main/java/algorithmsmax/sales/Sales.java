package algorithmsmax.sales;

import java.util.ArrayList;
import java.util.List;

public class Sales {

    List<Salesperson> salespersonList = new ArrayList<>();

    public List<Salesperson> getSalespersonList() {
        return salespersonList;
    }

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {

        Salesperson bestSalesPerson = sales.get(0);
        for (Salesperson actualPerson: sales) {
            if (actualPerson.getAmount() > bestSalesPerson.getAmount()) {
                bestSalesPerson = actualPerson;
            }
        }
        return bestSalesPerson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson bestSalesPerson = sales.get(0);
        for (Salesperson actualPerson: sales) {
            if ((actualPerson.getAmount()-actualPerson.getTarget()) > (bestSalesPerson.getAmount()- bestSalesPerson.getTarget())){
                bestSalesPerson = actualPerson;
            }
        }
        if (bestSalesPerson.getTarget() - bestSalesPerson.getAmount() > 0) {
            bestSalesPerson = null;
        }
        return bestSalesPerson;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson worstSalesPerson = sales.get(0);
        for (Salesperson actualPerson: sales) {
            if ((actualPerson.getTarget()-actualPerson.getAmount()) > (worstSalesPerson.getTarget()- worstSalesPerson.getAmount())) {
                worstSalesPerson = actualPerson;
            }
        }
        if (worstSalesPerson.getTarget() - worstSalesPerson.getAmount() < 0) {
            worstSalesPerson = null;
        }
        return worstSalesPerson;
    }
}
