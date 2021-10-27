package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void findBookAndSetAuthor(String title, String author){

        for (int i =0;i<books.size();i++) {
            if (books.get(i).equals(title)) {
                books.set(i,author+": "+title);
            }
        }
    }

    public List<String> getBooks() {
        return books;
    }

    public static void main(String[] args) {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány könyvet szeretnél felvinni? ");
        int nrOfBooks = sc.nextInt();
        sc.nextLine();
        String titleOfBook;
        for (int i=0;i< nrOfBooks;i++) {
            System.out.print((i+1)+". könyv címe? ");
                titleOfBook = sc.nextLine();
            book.addBook(titleOfBook);
        }
        System.out.print("Melyik könyv címéhez csatoljunk szerzőt a listában? ");
        String findBook = sc.nextLine();
        System.out.print("Szerző? ");
        String author = sc.nextLine();

        book.findBookAndSetAuthor(findBook,author);
        System.out.println(book.getBooks());
    }

}
