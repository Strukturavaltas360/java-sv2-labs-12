package inheritanceattributes.book;

public class ShippedBook extends Book {
    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {// kiszámolja a darabszám ismeretében a teljes árat, postaköltséggel együtt
        return pieces * price + shippingCost;
    }

    @Override
    public String toString() {
        return (getTitle()+": " + price+" Ft, postaköltség: " + shippingCost+" Ft");
    }
}


