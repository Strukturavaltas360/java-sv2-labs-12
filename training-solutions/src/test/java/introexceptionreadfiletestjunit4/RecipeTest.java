package introexceptionreadfiletestjunit4;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    void testGetIngredients() {
        Path path = Paths.get("src/test/Resources/recipe.txt");
        recipe.addIngredients(path);
        assertEquals(Arrays.asList("liszt","margarin","kristálycukor","tojás","citrom","sütőpor","vanillincukor","tejföl","alma","fahéj"), recipe.getIngredients());

    }


}