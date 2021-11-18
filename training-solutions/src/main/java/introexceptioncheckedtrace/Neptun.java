package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {
        List<String> neptun = new ArrayList<>();
        List<String> neptunCodes = new ArrayList<>();
        try {
            neptun = new Neptun().readNeptun("neptun.csv");
        }
        catch (IOException io) {
            System.out.println("Hiba a file olvasása közben");
        }

        System.out.println(neptun);
        for (String actuel : neptun) {
            String[] temp = actuel.split(",");
            neptunCodes.add(temp[1]);
        }
        System.out.println(neptunCodes);
    }

    public List<String> readNeptun(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }
}
