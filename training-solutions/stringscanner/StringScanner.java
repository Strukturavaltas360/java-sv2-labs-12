package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first sentence!");
        String sentence1 = sc.nextLine();

        Scanner word = new Scanner(sentence1);
        while (word.hasNext()) {
            System.out.println(word.next());
        }

        System.out.println("Please enter the second sentence, with more taglines!");
        String sentence2 = sc.nextLine();
        Scanner tagLine = new Scanner(sentence1).useDelimiter(",");
        while (tagLine.hasNext()) {
            System.out.println(tagLine.next());
        }


    }
}
