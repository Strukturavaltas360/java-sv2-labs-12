package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operations {


    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("underground.txt"));
    }

    public String getDailySchedule(List<String> underground) {

        String dailySchedule = LocalDate.now().toString()+", ";
        for (String actuel: underground) {
            if (actuel.charAt(0) == '2') {
                dailySchedule += actuel+" | ";
            }
        }
        return dailySchedule;
    }

    public static void main(String[] args) {
        List<String> underground = new ArrayList<>();
        Operations operations = new Operations();

        try {
            underground = operations.readFile();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println(operations.getDailySchedule(underground));
    }
}
