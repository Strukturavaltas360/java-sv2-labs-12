package controlselection.accents;

public class WithoutAccents {

    public static final String VOWELSWITHACCENT="áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
    public static final String VOWELS="aeiooouuuAEIOOOUUU";

    public char getCharsWithoutAccent(char ch) {
        if (VOWELSWITHACCENT.indexOf(ch) >= 0) {
            return VOWELS.charAt(VOWELSWITHACCENT.indexOf(ch));
        }
        return ch;
    }


}
