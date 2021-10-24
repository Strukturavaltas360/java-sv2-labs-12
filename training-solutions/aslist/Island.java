package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island{
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("kés", "wifi router", "kispárna");
        System.out.println();
        System.out.println("A három dolog, amit magaddal vinnél egy lakatlan szigetre: " + importantThings);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Egyet kicserélhetsz. Mi legyen az?");
        String thingToChange = scanner.nextLine();
        int i = importantThings.indexOf(thingToChange);

        System.out.println("Mit vinnél helyetted?");
        thingToChange = scanner.nextLine();
        importantThings.set(i,thingToChange);
        System.out.println("A három dolog, amit magaddal vinnél egy lakatlan szigetre:" + importantThings);
    }
}
