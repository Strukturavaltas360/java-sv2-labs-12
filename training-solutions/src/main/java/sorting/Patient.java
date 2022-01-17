package sorting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;

public class Patient {
    private String name;
    private String TAJ;
    private LocalDateTime dateTime;

    public Patient(String name, String TAJ, LocalDateTime dateTime) {
        this.name = name;
        this.TAJ = TAJ;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public String getTAJ() {
        return TAJ;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

}
