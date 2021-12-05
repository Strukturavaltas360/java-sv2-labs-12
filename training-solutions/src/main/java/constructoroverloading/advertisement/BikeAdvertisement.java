package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {

    private String description;
    private int price;
    private List<String> extras;
    private String brand;
    private String serialNumber;

    public BikeAdvertisement(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public BikeAdvertisement(String description, int price, String brand) {
        this(description,price);
        this.brand = brand;
    }

    public BikeAdvertisement(String description, int price, List<String> extras, String brand) {
        this (description, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String description, int price, List<String> extras, String brand, String serialNumber) {
        this(description, price, extras, brand);
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}

