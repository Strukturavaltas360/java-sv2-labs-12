package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String word) {
        for (String actual: words) {
            if (actual.length() > word.length()) {
                return true;
            }
        }
        return false;
    }
}
