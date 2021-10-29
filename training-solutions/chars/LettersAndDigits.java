package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text){

        for (char c: text.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println(c + " : ez egy betű");
            } else {
                if (Character.isDigit(c)) {
                    System.out.println(c + " : ez egy számjegy");
                } else {
                    System.out.println(c + " : ez valami egyéb karakter");
                }
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("h.6k,74.iu:9");
    }
}
