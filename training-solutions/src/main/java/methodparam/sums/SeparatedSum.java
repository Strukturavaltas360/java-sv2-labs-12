package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public String readFromFile(){

        try {
            List<String>  file = Files.readAllLines(Paths.get("floatingnumbers.txt"));
            return file.get(0);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }

    }


    public Results sum(String floatingNumbers) {
        Results resultSums = new Results();
        floatingNumbers = floatingNumbers.replace(",",".");
        String[] doubleStrings = floatingNumbers.split(";");

        for (String actual : doubleStrings) {
            double d = Double.parseDouble(actual);
            if (d < 0) {
                resultSums.addNegativeSum(d);
            } else {
                resultSums.addPositiveSum(d);
            }
        }
        return resultSums;
    }
}
