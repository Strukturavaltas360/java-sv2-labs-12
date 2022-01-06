package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = features;
    }


    public boolean hasAudioFeature() {
        if (features.contains(AudioFeatures.class)) {
            return true;
        }
        return false;
    }

    public boolean hasPrintedFeatures() {
        if (features.contains(PrintedFeatures.class)) {
            return true;
        }
        return false;
    }

//    public int numberOfPagesAtOneItem() {
//        if (hasPrintedFeatures()) {
//            Feature feature2 = new Feature();
//
//            }
//            return new fe
//        }
//        return this.
//    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return List.copyOf(features);
    }
}
