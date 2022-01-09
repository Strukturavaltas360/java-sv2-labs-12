package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class CatalogItem {

    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = new ArrayList<>(Arrays.asList(features));
        validateFeatures(this.features);
        validatePrice(price);
        validateRegistrationNumber(registrationNumber);
    }

    public boolean hasAudioFeature() {
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int sum = 0;
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                sum += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return sum;
    }

    public int fullLengthAtOneItem() {
        int sum = 0;
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                sum += ((AudioFeatures) f).getLength();
            }
        }
        return sum;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for (Feature f : features) {
            result.addAll(f.getContributors());
        }
        return result;
    }

    public List<String> getTitles() {
        List<String> result = new ArrayList<>();
        for (Feature f : features) {
            result.add(f.getTitle());
        }
        return result;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return new ArrayList<>(features);
    }

    private void validateFeatures(List<Feature> features) {
        if (isEmpty(features)) {
            throw new IllegalArgumentException("Empty features!");
        }
    }

    private void validatePrice (int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive!");
        }
    }

    private void validateRegistrationNumber(String registrationNumber) {
        if (isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Empty registration number!");
        }
    }
}
