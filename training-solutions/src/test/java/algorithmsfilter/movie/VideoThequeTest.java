package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque vt = new VideoTheque();

    @BeforeEach
    void init() {

        vt.addMovies(new Movie("Titanic",Category.DRAMA,5));
        vt.addMovies(new Movie("Dune",Category.SCI_FI,4));
        vt.addMovies(new Movie("Halo",Category.SCI_FI,4));
        vt.addMovies(new Movie("Matrix",Category.SCI_FI,5));
        vt.addMovies(new Movie("The Day After",Category.SCI_FI,3));
    }

    @Test
    void testAddMovies() {
        assertEquals(3, vt.movies.get(4).getRating());
        assertEquals("Matrix", vt.movies.get(3).getTitle());
    }

    @Test
    void testGetGoodMoviesWithCategoryGiven() {
        List<Movie> selectedMovies = vt.GetGoodMoviesWithCategoryGiven(Category.SCI_FI);
        assertEquals(3, selectedMovies.size());
    }
}