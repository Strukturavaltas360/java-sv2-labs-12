package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> readFile() {
        try {
            return Files.readAllLines(Paths.get("src/test/Resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file", ioe);
        }
    }

   private void writeFile(List<String> lines, Path path){
       try {
           Files.write(path,lines);
       }
       catch (IOException ioe) {
           throw new IllegalStateException("Error while writing file", ioe);
       }
   }

   public void makeReadableList(Path path){

        List<String> books = readFile();
        List<String> readableList = new ArrayList<>();

        for (String actual: books) {
            String [] temp = actual.split(";");
            readableList.add(temp[2] + ": " +temp[1]);
        }

        new Books().writeFile(readableList, path);
   }

}
