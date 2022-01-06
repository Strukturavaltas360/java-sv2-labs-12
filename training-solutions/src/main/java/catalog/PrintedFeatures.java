package catalog;

import java.util.ArrayList;
import java.util.List;

public class  PrintedFeatures implements Feature{

    private String title;
    private int numberOfPages;
    private List<String> authors = new ArrayList<>();

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
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
