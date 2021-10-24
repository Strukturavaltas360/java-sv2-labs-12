package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a kedvenc filmed?");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Mi a kedvenc könyved?");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Mi a kedvenc italod?");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Mi a kedvenc állatod?");
        favouriteThings.add(scanner.nextLine());

        System.out.println(favouriteThings);
        System.out.println("A lista hossza: "+favouriteThings.size());
    }


}
