package collectionsmap;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassTrip {

    private static final String SEPARATOR = ":";
    private Map<String, Integer> inPayments = new HashMap<>();

    public void loadInpayments(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(SEPARATOR);
                inPayments.put(fields[0],Integer.parseInt(fields[1].trim()));
            }
        } catch (IOException | NumberFormatException e) {
            throw new IllegalStateException("Error while reading", e);
        }
    }

    public Map<String, Integer> getInPayments() {
        return new HashMap<>(inPayments);
    }
}
