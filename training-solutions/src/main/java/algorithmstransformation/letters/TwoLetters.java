package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> twoLetters = new ArrayList<>();
        for (String actual: words) {
            twoLetters.add(actual.substring(0,2));
        }
        return twoLetters;
    }
}
