package catalog;

import java.util.ArrayList;
import java.util.List;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class PrintedFeatures implements Feature {

    private String title;
    private int numberOfPages;
    private List<String> authors = new ArrayList<>();

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
        validate(title, numberOfPages, authors);
    }

    private void validate(String title, int numberOfPages, List<String> authors) {
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Invalid number of pages!");
        }
        if (isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (isEmpty(authors)) {
            throw new IllegalArgumentException("Empty authors");
        }
    }

    @Override
    public List<String> getContributors() {
        return List.copyOf(authors);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
