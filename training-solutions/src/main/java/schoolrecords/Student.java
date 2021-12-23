package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();


    public Student(String name) {
        if (name.isEmpty() || name == null) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        double sum = 0;
        for (Mark m : marks) {
            sum += m.getMarkType().getMark();
        }
        return marks.size() != 0 ? (int) (sum / marks.size() * 100)/100d  : 0.0;
    }

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0;
        int counter = 0;
        for (Mark m : marks) {
            if (m.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += m.getMarkType().getMark();
                counter++;
            }
        }
        return counter != 0 ? (int) (sum / counter * 100)/100d : 0.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name+" marks: ");
        for (Mark m: marks) {
            sb.append(m.getSubject().getSubjectName()+": "+m.toString()+", ");
        }
        sb.deleteCharAt(sb.length() - 2);
        return sb.toString().trim();
    }

    public String getName() {
        return name;
    }
}
