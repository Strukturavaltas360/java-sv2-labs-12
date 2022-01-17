package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty>{

    private String regNumber;
    private String description;
    private LocalDate foundDate;

    public LostProperty(String regNumber, String description, LocalDate foundDate) {
        this.regNumber = regNumber;
        this.description = description;
        this.foundDate = foundDate;
    }

    public LostProperty(String description, LocalDate foundDate) {
        this.description = description;
        this.foundDate = foundDate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getFoundDate() {
        return foundDate;
    }

    @Override
    public int compareTo(LostProperty o) {
        int compare = description.compareTo(o.description);
        if (compare == 0) {
            return foundDate.compareTo(o.foundDate);
        } else {
            return compare;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(description, that.description) && Objects.equals(foundDate, that.foundDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, foundDate);
    }
}
