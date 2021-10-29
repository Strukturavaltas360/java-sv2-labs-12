package chars;

import java.util.Scanner;

public class Words {

    public String pushWord(String word) {
        char [] chars = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            chars[i] = (char)(chars[i]+1);
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        Words words = new Words();
        System.out.println("This util will push forward every chars of the following word. Please enter the word!");
        Scanner scanner = new Scanner(System.in);
        String wordForPush = scanner.nextLine();

        System.out.println(words.pushWord(wordForPush));

    }
}
