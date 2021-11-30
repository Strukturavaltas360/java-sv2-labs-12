package methodparam.sums;

public class Results {
    private double negativSum;
    private double PositiveSum;

    public double getNegativSum() {
        return negativSum;
    }

    public double getPositiveSum() {
        return PositiveSum;
    }

    public void addPositiveSum(double value) {
        PositiveSum += value;
    }
    public void addNegativeSum(double value) {
        negativSum += value;
    }

}
