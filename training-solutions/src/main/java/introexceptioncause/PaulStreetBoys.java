package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    public void readFileAndWriteOut() {
        List<String> paulStreetBoys = new ArrayList<>();
        try {
            paulStreetBoys = Files.readAllLines(Paths.get("palutcaifiuk.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file", ioe);
        }
        writeOut(paulStreetBoys);
    }

    public void writeOut(List<String> paulStreetBoys) {
        for (String actual: paulStreetBoys) {
            if ("Nemecsek Ernő".equals(actual)) {
                System.out.println(actual.toLowerCase());
            } else {
                System.out.println(actual);
            }
        }
    }

    public static void main(String[] args) {
        new PaulStreetBoys().readFileAndWriteOut();
    }
}
