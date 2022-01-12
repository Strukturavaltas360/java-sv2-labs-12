package collectionsqueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                result.add(p.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> people = Arrays.asList(
                new Person("Péter", 22),
                new Person("Péter", 16),
                new Person("Péter", 29),
                new Person("Péter", 36),
                new Person("Péter", 47),
                new Person("Péter", 71),
                new Person("Péter", 66),
                new Person("Péter", 58));

        Queue<Integer> pq = vaccination.getVaccinationOrder(people);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }

}
