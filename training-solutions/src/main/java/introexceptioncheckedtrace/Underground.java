package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {
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
