package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testCreateMovie() {
        Movie movie = new Movie("Titanic", Category.DRAMA,5);
        assertEquals(5, movie.getRating());
        assertEquals(Category.DRAMA, movie.getCategory());
    }
}