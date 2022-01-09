package catalog;

import static catalog.Validators.isBlank;

public class SearchCriteria {

    private String contributor;
    private String title;

    public static SearchCriteria createByBoth(String contributor, String title) {
        if (isBlank(contributor) || (isBlank(title))) {
            throw new IllegalArgumentException("Contributor or title is null or empty");
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (isBlank(contributor)) {
            throw new IllegalArgumentException("Contributor is null or empty");
        }
        return new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        if (isBlank(title)) {
            throw new IllegalArgumentException("Title is null or empty");
        }
        return new SearchCriteria(title, null);
    }

    public boolean hasTitle() {
        if (!isBlank(title)) {
            return true;
        }
        return false;
    }

    public boolean hasContributor() {
        if (!isBlank(contributor)) {
            return true;
        }
        return false;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    private SearchCriteria(String title, String contributor) {
        this.contributor = contributor;
        this.title = title;
    }
}
