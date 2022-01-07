
package catalog;

import java.util.ArrayList;
import java.util.List;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class AudioFeatures implements Feature {

    private String title;
    private int length;
    private List<String> composers = new ArrayList<>();
    private List<String> performers = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> composers) {

        this.title = title;
        this.length = length;
        this.composers = composers;
        validate(title, length, composers);
    }


    public AudioFeatures(String title, int length, List<String> composers, List<String> performers) {
        this(title, length, composers);
        this.performers = performers;
    }

    @Override
    public List<String> getContributors() {
        List<String> commonList = new ArrayList<>();
        commonList.addAll(performers);
        commonList.addAll(composers);
        return List.copyOf(commonList);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    private void validate(String title, int length, List<String> composers) {
        if (isBlank(title)) {
            throw new IllegalArgumentException("No title!");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be longer thane 0 minutes!");
        }
        if (isEmpty(composers)) {
            throw new IllegalArgumentException("Item must have composer!");
        }
    }
}

