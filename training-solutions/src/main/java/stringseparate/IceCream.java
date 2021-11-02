package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {

    public static void main(String[] args) {
        List<String> icecream = Arrays.asList("vanilia","tutti-frutti","karamell","rumosdió","kávé");
        StringBuilder sb = new StringBuilder("\nMa kapható: ");
        boolean b = true;
        for (String ic : icecream) {
            if (b == true) {
                sb.append(ic);
                b = false;
            } else {
                sb.append(", ");
                sb.append(ic);
            }
        }

        sb.append(".\nPisztácia kifogyott, csokoládé nem is volt!!! - Terence Hillnek féláron...");
        System.out.println(sb);
    }
}
