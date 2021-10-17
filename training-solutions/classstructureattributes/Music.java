package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("'Music for java coding' (M4JC) alkalmazásunk első lejátszási listájának elkészítéséhez kérlek add meg a kedvenc zeneszámod adatait!");

        Scanner scanner = new Scanner(System.in);
        Song favSong = new Song();

        System.out.println("Kedvenc zeneszámod előadója?");
        favSong.band = scanner.nextLine();

        System.out.println("Kedvenc zeneszámod címe?");
        favSong.title = scanner.nextLine();

        System.out.println("Kedvenc zeneszámod hossza egész percre kerekítve?");
        favSong.length = scanner.nextInt();

        System.out.println("A lejátszási lista generálása az alábbi zeneszámból kiindulva történik:");
        System.out.println("Előadó neve: "+favSong.band+"  | Zeneszám címe: "+ favSong.title +"  | Zeneszám hossza: "+favSong.length+" perc.");
    }

}
