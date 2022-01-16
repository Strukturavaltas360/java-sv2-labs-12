package searching;

import java.util.ArrayList;
import java.util.List;

public class BookSearch {

    private List<Book> books = new ArrayList<>();

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (author == null || title == null) {
            throw new IllegalArgumentException("Author or title is null");
        }
        throw new IllegalArgumentException("Book not found");
    }
}
