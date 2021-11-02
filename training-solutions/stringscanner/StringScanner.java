package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence1 = sc.nextLine();

        Scanner word = new Scanner(sentence1);
        while (word.hasNext()) {
            System.out.println(word.next());
        }

        String sentence2 = sc.nextLine();
        Scanner tagLine = new Scanner(sentence1).useDelimiter(",");
        while (tagLine.hasNext()) {
            System.out.println(tagLine.next());
        }


    }
}
