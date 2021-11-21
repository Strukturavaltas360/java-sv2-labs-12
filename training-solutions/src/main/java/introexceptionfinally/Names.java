package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Names {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();

        Path path = Paths.get("names3.txt");
        try {
            namesList = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            System.out.println();
            throw new IllegalStateException("Error while reading file", ioe);
        }
        finally {
            System.out.println("End of reading");
        }

        int count = -1;
        String name = "";
        do {
            count++;
            if (namesList.get(count).startsWith("dr")) {
                name = namesList.get(count);
            }
        } while (count < namesList.size()-1 && name.length() == 0);

        System.out.println(name);
    }
}
