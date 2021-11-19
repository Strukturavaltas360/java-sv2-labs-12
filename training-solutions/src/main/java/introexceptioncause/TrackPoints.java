package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readFile (){
        try {
            return Files.readAllLines(Paths.get("tracking.csv"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file", ioe);
        }
    }

    public List<String> getHeightDatasFromList (List<String> csvFileLines) {
        List<String> heightDatas = new ArrayList<>();
        for (String actual: csvFileLines) {
            String[] temp = actual.split(";");
            heightDatas.add(temp[2]);
        }
        return heightDatas;
    }

    public List<Integer> getIntegerFromString (List<String> heightDatasInString){
        List<Integer> intDatas = new ArrayList<>();
            for (String actuel: heightDatasInString) {
                intDatas.add(Integer.parseInt(actuel));
            }
        return intDatas;

    }

    public List<Integer> getDifferences(List<Integer> heightDatas){
        List<Integer> differences = new ArrayList<>();
        for (int i = 0; i < heightDatas.size()-1; i++) {
            differences.add(heightDatas.get(i+1)-heightDatas.get(i));
        }
        return differences;
    }

    public void printHeightDatas(List<Integer> heightDifferences) {
        for (int actual: heightDifferences) {
            System.out.println(actual);
        }
    }
}
