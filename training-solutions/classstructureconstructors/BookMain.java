package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Molnár Ferenc","A Pál utcai fiúk");

        System.out.println("Regisztrációs szám:");

        book1.Register(scanner.nextLine());

        System.out.println("A regisztrált könyv:");
        System.out.println("Szerző: "+book1.getAuthor()+"  | Cím: "+book1.getTitle()+"  | Regisztrációs szám: "+book1.getRegNumber());

    }
}
