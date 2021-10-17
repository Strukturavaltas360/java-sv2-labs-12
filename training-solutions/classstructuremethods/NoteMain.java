package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Note note1 = new Note();

        System.out.println("Jegyzet írója:");
        note1.setName(scanner.nextLine());

        System.out.println("Jegyzet témája:");
        note1.setTopic(scanner.nextLine());

        System.out.println("Jegyzet tartalma:");
        note1.setText(scanner.nextLine());

        System.out.println("A formázott jegyzet:");
        System.out.println(note1.getNoteText());
    }
}
