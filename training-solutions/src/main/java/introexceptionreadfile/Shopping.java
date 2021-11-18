package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try {
            List<String> shoppinglist = Files.readAllLines(Paths.get("shoppinglist.txt"));
            System.out.println(shoppinglist);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
