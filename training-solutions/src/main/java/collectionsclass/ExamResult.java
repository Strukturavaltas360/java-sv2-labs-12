package collectionsclass;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult>{
    private String name;
    private int points;

    public ExamResult(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int compareTo(ExamResult o) {
        return points-o.points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return points == that.points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
