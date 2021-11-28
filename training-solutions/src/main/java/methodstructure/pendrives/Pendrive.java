package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return " Név: " + name + "  Kapacitás: " + capacity + " Ár: " + price;
    }

    public boolean isCheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    public void risePrice(int percent) {
        this.price += (int) (price * (percent / 100d));
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (1.0 * other.price / other.capacity > this.price * 1.0 / this.capacity) {
            return -1;
        }
        if (1.0 * other.price / other.capacity < this.price * 1.0 / this.capacity) {
            return 1;
        } else return 0;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
