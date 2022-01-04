package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file!", ioe);
        }
    }

    public List<String> validate(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String actualLine : lines) {
            StringBuilder errorLine = new StringBuilder(" --> | ");
            String[] temp = actualLine.split(",");
            if (temp.length > 3) {
                errorLine.append("Túl sok tagból áll | ");
            }
            if (temp.length < 3) {
                errorLine.append("Túl kevés tagból áll | ");
            }
            if (temp.length > 0 && !isItAnInt(temp[0])) {
                errorLine.append("Hibás sorszám | ");
            }
            if (temp.length > 1 && !isItADouble(temp[1])) {
                errorLine.append("Hibás mért adat | ");
            }
            if (temp.length > 2 && !isItAName(temp[2])) {
                errorLine.append("Hibás név | ");
            }
            if (errorLine.length() > 7) {
                result.add(actualLine + errorLine);
            }
        }
        return result;
    }

    private boolean isItAName(String s) {
        if (s.contains(" ")) {
            return true;
        }
        return false;
    }

    private boolean isItADouble(String s) {
        try {
            double number = Double.parseDouble(s);
            return true;
        } catch (IllegalArgumentException ise) {
            return false;
        }
    }

    private boolean isItAnInt(String s) {
        try {
            int number = Integer.parseInt(s);
            return true;
        } catch (IllegalArgumentException ise) {
            return false;
        }
    }

}
