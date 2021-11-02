package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book();
        System.out.println((new Book()));

        Book emptyBook;
//        System.out.println(emptyBook);

        emptyBook = null;
        System.out.println(emptyBook);

        System.out.println(emptyBook==null);;

        Book book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book==anotherBook);

        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book==anotherBook);


        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Book [] arrayOfBooks = {book1,book2,book3};

        List<Book> listOfBooks = Arrays.asList(arrayOfBooks);

        List<Book> anotherListOfBooks = new ArrayList<>();
        anotherListOfBooks.add(book1);
        anotherListOfBooks.add(book2);
        anotherListOfBooks.add(book3);

        System.out.println(Arrays.toString(arrayOfBooks));
        System.out.println(listOfBooks);
        System.out.println(anotherListOfBooks);

    }
}
