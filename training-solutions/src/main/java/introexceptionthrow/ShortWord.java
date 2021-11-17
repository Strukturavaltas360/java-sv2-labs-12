package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Írj be egy 5 betűsnél rövidebb szót! ");
        String word = sc.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("Túl hosszú szó!");
        }
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                throw new IllegalArgumentException("A megadott karakterláncban nem csak betűk vannak!");
                }
        }
        System.out.println(word);
    }
}