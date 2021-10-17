package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public Store(String product) {
        this.product = product;
    }


    public void Store(int amount) {
        this.stock = this.stock + amount;
    }

    public void Dispatch(int amount) {
        this.stock = this.stock - amount;
    }
}
