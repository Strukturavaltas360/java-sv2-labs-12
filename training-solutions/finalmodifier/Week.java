package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static void main(String[] args) {
        List<String> dayOfWeeks = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
        System.out.println(dayOfWeeks);

        String dayToChange = dayOfWeeks.get(1);
        dayOfWeeks.set(1,dayOfWeeks.get(2));
        dayOfWeeks.set(2,dayToChange);
        System.out.println(dayOfWeeks);
    }




}
