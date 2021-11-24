package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovies(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> GetGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> resultMovies = new ArrayList<>();
        for (Movie actualMovie: movies) {
            if (actualMovie.getCategory() == category && actualMovie.getRating() > 3) {
                resultMovies.add(actualMovie);
            }
        }
        return resultMovies;
    }
}
