package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student("Laci", 146));
        students.add(new Student("Joci", 142));
        students.add(new Student("Vali", 141));
        students.add(new Student("Feri", 140));
        students.add(new Student("Bibi", 153));
        students.add(new Student("Kimi", 148));

        System.out.println(students);

        Map<String, Integer> studentMap = new TreeMap<>(Collator.getInstance(new Locale("hu","HU")));
        for (Student s: students) {
            studentMap.put(s.getName(),s.getHeight());
        }
        System.out.println(studentMap);

    }
}
