package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Words {

    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file", ioe);
        }
    }

    public String getFirstWordWithA(Path path){
            List<String> lines = readFile(path);
            for (String actual: lines) {
                if (actual.charAt(0) == 'A') {
                    return actual;
                }
            }
        return "A";
    }

    public static void main(String[] args) {
        try {
            System.out.println(new Words().getFirstWordWithA(Paths.get("src/test/Resources/anotherwords.txt")));
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
    }


}
