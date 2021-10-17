package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void Store(int stock) {
        this.stock = this.stock + stock;
    }

    public void Dispatch(int stock) {
        this.stock = this.stock + stock;
    }
}
