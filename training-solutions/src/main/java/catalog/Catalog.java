package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        for (CatalogItem c : catalogItems) {
            if (c.getRegistrationNumber().equals(registrationNumber)) {
                catalogItems.remove(c);
                return;
            }
        }
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasAudioFeature()) {
                result.add(c);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                result.add(c);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                sum += c.numberOfPagesAtOneItem();
            }
        }
        return sum;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem c : catalogItems) {
            if (c.hasAudioFeature()) {
                sum += c.fullLengthAtOneItem();
            }
        }
        return sum;
    }

    public double averagePageNumberOver(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int sum = 0;
        int counter = 0;
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature() && c.numberOfPagesAtOneItem() > number) {
                sum += c.numberOfPagesAtOneItem();
                counter++;
            }
        }
        if (counter == 0) {
            throw new IllegalArgumentException("No page");
        }
        return sum / counter;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        String contributorToFind = searchCriteria.getContributor();
        String titleToFind = searchCriteria.getTitle();
        for (CatalogItem c : catalogItems) {
//            if ((hasCriteriaBoth(searchCriteria) && (c.getTitles().contains((titleToFind)) && c.getContributors().contains(contributorToFind)))
//                    || (!hasCriteriaBoth(searchCriteria) && c.getTitles().contains(titleToFind) || (c.getContributors().contains(contributorToFind)))) {

            if ((hasCriteriaBoth(searchCriteria) && AreBothCriteriaTrue(c, titleToFind, contributorToFind))
                    || (!hasCriteriaBoth(searchCriteria) && IsOneOfTheCriteriasIsTrue(c, titleToFind, contributorToFind))) {
                result.add(c);
            }
        }
        return result;
    }

    private boolean hasCriteriaBoth(SearchCriteria searchCriteria) {
        if (searchCriteria.hasContributor() && searchCriteria.hasTitle()) {
            return true;
        }
        return false;
    }

    private boolean AreBothCriteriaTrue(CatalogItem c, String titleToFind, String contributorToFind) {
        if (c.getTitles().contains((titleToFind)) && c.getContributors().contains(contributorToFind)) {
            return true;
        }
        return false;
    }

    private boolean IsOneOfTheCriteriasIsTrue(CatalogItem c, String titleToFind, String contributorToFind) {
        if (c.getTitles().contains(titleToFind) || c.getContributors().contains(contributorToFind)) {
            return true;
        }
        return false;
    }

}
