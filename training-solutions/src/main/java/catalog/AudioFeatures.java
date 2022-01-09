
package catalog;

import java.util.ArrayList;
import java.util.List;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class AudioFeatures implements Feature {

    private String title;
    private int length;
    private List<String> composer = new ArrayList<>();
    private List<String> performers = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> composer) {
        this.title = title;
        this.length = length;
        this.composer = composer;
        validateTitle(title);
        validateLength(length);
        validateComposer(composer);
    }

    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {
        this(title, length, composer);
        this.performers = performers;
    }

    @Override
    public List<String> getContributors() {
        List<String> commonList = new ArrayList<>();
        commonList.addAll(performers);
        commonList.addAll(composer);
        return new ArrayList<>(commonList);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    private void validateComposer(List<String> composer) {
        if (isEmpty(composer)) {
            throw new IllegalArgumentException("Item must have composer!");
        }
    }

    private void validateLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be longer thane 0 minutes!");
        }
    }

    private void validateTitle(String title) {
        if (isBlank(title)) {
            throw new IllegalArgumentException("No title!");
        }
    }

}

