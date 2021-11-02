package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {

    public static void main(String[] args) {

        List<String > names = Arrays.asList("Ábel Zsuzsanna", "Molnár Péter", "Kiss Virág", "Madár Péter");

        for (String s: names) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!\n", s);
        }
    }

}
