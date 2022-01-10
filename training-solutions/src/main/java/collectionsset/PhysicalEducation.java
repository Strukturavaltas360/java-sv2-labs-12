package collectionsset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> order = new TreeSet<>();
            for (Student s: students) {
                order.add(s.getHeight());
            }
        return order;
    }

    public static void main(String[] args) {
        PhysicalEducation physicalEducation = new PhysicalEducation();
        Set<Integer> order = physicalEducation.getOrderInLessons(Arrays.asList(
                new Student("Laci", 150),
                new Student("Misi", 148),
                new Student("Miki", 161),
                new Student("Ákos", 157),
                new Student("Tomi", 159),
                new Student("Péter", 158),
                new Student("Viktor", 154),
                new Student("Feri", 159)));
        System.out.println(order);
    }
}
