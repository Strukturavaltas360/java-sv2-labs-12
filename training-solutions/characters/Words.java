package characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String theWord;
        System.out.print("Add meg a betűzendő szót! ");
        theWord = scanner.nextLine();
        System.out.println("A betűzendő szó: " + theWord);

        String wordFromStudent = "";
        char[] letter = new char[theWord.length()];
         for (int i= 0; i<theWord.length();i++) {
             letter[i] = scanner.nextLine().toCharArray()[0];
             wordFromStudent = wordFromStudent + letter[i];
        }
        System.out.println("A begépelt szó: " + wordFromStudent+"\t"+ Arrays.toString(letter));
        System.out.println(theWord.equals(wordFromStudent) ? "A megoldás helyes!" : "A megoldás hibás!");

    }

}
