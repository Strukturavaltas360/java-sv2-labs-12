package interfacedependencyinversion.amount;

public class BankAtm implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        return amount % 1000 == 0 ? amount : amount + 1000 - (amount % 1000);
    }
}
