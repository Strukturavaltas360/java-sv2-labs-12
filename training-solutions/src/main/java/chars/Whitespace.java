package chars;

import java.util.Scanner;

public class Whitespace {

    public String makeWhitespaceToStar(String text){
        char [] chars = text.toCharArray();
        for (int i =0; i<text.length();i++) {
            if (Character.isWhitespace(chars[i])) {
                chars[i] = '*';
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whitespace szempontból vizsgálandó szöveg? ");
        String text= scanner.nextLine();
//        String text="tes zt., é334        )  akk";


        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar(text));

    }
}
