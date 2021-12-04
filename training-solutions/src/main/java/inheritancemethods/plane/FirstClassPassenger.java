package inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger{
    final int extraCharge = 20000;

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket, percent);
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return super.getPriceOfPlaneTicket() + getExtraCharge();
    }

    public int getExtraCharge() {
        return extraCharge;
    }
}
