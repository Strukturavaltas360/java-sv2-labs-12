package controlselection.consonant;

public class ToConsonant {

    public char nextChar(char ch) {
        String  aeiou = "aeiouAEIOU";
        if (!aeiou.contains(Character.toString(ch))) {
            return ch;
        }
        return (char)(ch+1);
    }
}
