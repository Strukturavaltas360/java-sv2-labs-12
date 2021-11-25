package recursion;

public class Vowels {
    public int getNumberOfVowels(String word) {
        if (word.length() > 0) {
            if (isCharAVowel(word.charAt(0))) {
                return 1 + getNumberOfVowels(word.substring(1));
            }
            return 0 + getNumberOfVowels(word.substring(1));
        }
       return 0;
    }

    private boolean isCharAVowel(char ch) {
        String aeiou = "aeiouAEIOUáéíóöőüűúÁÉÍÓÖŐŰÚ";
        if (aeiou.contains(Character.toString(ch))) {
            return true;
            } else {
            return false;
        }
    }

}
