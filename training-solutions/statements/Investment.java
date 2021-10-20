package statements;

public class Investment {

    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment (int fund, int interestRate){
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
        cost = 0.3;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        double doubleInterestRate;
        doubleInterestRate = interestRate;
        return fund * days * doubleInterestRate/36500;

    }

    public double close(int days) {
        double returnInvestment;
        returnInvestment= active == true? (fund+getYield(days))*(1-cost/100) : 0;
        active = false;
        return returnInvestment;

    }

}
