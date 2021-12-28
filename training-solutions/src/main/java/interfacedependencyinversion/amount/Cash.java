package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {

        switch (amount % 10) {
            case 0:
                return amount;
            case 1, 2:
                return (amount / 10) * 10;
            case 8, 9:
                return (amount / 10) * 10 + 10;
            default:
                return (amount / 10) * 10 + 5;
        }
    }
}
