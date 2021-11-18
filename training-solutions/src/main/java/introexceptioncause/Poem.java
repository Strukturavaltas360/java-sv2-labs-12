package introexceptioncause;

import introexceptionthrow.patient.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public List<String> readfile() {
        try {
            return Files.readAllLines(Paths.get("poem_.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file", ioe);
        }
    }

    public String getFirstLetter (List<String> poem) {
        StringBuilder sb = new StringBuilder();

        for (String actuelLine: poem) {
            sb.append(actuelLine.charAt(0)+", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Poem poem = new Poem();
        try {
            List<String> poemList = poem.readfile();
            System.out.println(poem.getFirstLetter(poemList));
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            System.out.println((ise.getCause()));

        }
    }
}
