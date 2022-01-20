package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {

    List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream()
                .filter(book -> book.getPages() < maxNumberOfPages)
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author){
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(book -> book.getTitle())
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> listAuthors(){
        return books.stream()
                .map(book -> book.getAuthor())
                .distinct()
                .collect(Collectors.toList());
    }

}
