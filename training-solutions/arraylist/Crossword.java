package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {
        String [] words = {"KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"};

        List<String> wordlist = Arrays.asList(words);

        for (String word: wordlist) {
            if (word.length() == 6) {
                System.out.println(word);
            }
        }
    }
}
