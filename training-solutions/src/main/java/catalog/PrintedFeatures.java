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
        validateTitle(title);
        validateAuthors(authors);
        validateNumberOfPages(numberOfPages);
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private void validateAuthors(List<String> authors) {
        if (isEmpty(authors)) {
            throw new IllegalArgumentException("Empty authors");
        }
    }

    private void validateNumberOfPages(int numberOfPages) {
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Invalid number of pages!");
        }
    }

    private void validateTitle(String title) {
        if (isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

}
