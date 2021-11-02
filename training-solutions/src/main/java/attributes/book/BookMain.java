package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Egri csillagok");
        System.out.println(book.getTitle());
        book.setTitle("Az öreg halász és a tenger");
        System.out.println(book.getTitle());

    }
}
