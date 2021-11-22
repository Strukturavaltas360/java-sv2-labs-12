package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    List<String> electricity = new ArrayList<>();

    public List<String> getElectricity() {
        return electricity;
    }

    public void makelist() {
        electricity.add(LocalDate.now().toString());
        electricity.add("Apáca utca");
        electricity.add("Irgalmasok útja");
        electricity.add("Jókai tér");
    }

    public void writeStreets(Path path) {
        try {
            Files.write(path, electricity);
        } catch (IOException ioe)
        {
            throw new IllegalStateException("Error while writing file", ioe);
        }
    }



}
