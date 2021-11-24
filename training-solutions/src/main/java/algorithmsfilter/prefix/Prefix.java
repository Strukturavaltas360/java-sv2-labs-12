package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> resultList = new ArrayList<>();
            for (String actual: words) {
                if (actual.startsWith(prefix)) {
                    resultList.add(actual);
                }
            }
        return resultList;
    }
}
