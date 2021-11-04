package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    void addWords (String word) {
        words.add(word);
    }

    void getWordsStartWith(String prefix) {
        for (int i = 0; i < words.size(); i++) {
            if (!words.get(i).startsWith(prefix)) {
               words.remove(i);
               i--;
            }
        }
    }

    void getWordsWithLength(int length){
        for (int i=0;i<words.size();i++) {
            if (words.get(i).length() != length) {
                words.remove(i);
                i--;
            }
        }
    }
}

