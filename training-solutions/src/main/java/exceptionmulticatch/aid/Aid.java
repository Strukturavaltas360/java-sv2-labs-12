package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private static final String SEPARATOR = ":";
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (String actual : lines) {
                String[] fields = actual.split(SEPARATOR);
                StringBuilder sb = new StringBuilder(fields[0] + ": ");
                sb.append(amount / Integer.parseInt(fields[1].trim()));
                result.add(sb.toString());
            }
        } catch (NullPointerException | IOException | ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
        return result;
    }

}
