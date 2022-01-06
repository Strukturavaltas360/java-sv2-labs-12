
package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{

    private String title;
    private int length;
    private List<String> composers = new ArrayList<>();
    private List<String> performers = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> composers) {
        this.title = title;
        this.length = length;
        this.composers = composers;
    }

    public AudioFeatures(String title, int length, List<String> composers, List<String> performers) {
        this.title = title;
        this.length = length;
        this.composers = composers;
        this.performers = performers;
    }

    @Override
    public List<String> getContributors() {
        return List.copyOf(composers);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}

