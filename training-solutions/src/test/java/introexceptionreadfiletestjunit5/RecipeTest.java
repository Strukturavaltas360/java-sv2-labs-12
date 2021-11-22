package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe();


    @Test
    void testEmptyList() {
        assertEquals(0,recipe.getIngredients().size());
    }

    @Test
    void testGetIngredients() {
        Path path = Paths.get("src/test/Resources/recipe.txt");
        recipe.addIngredients(path);
        assertEquals(Arrays.asList("liszt","margarin","kristálycukor","tojás","citrom","sütőpor","vanillincukor","tejföl","alma","fahéj"), recipe.getIngredients());
    }

    @Test
    void testNoSuchIngredients() {
        Path path = Paths.get("src/test/Resources/recipe.txt");
        recipe.addIngredients(path);
        assertNotEquals(Arrays.asList("só", "bors", "paprika", "szalonna"), recipe.getIngredients());
    }

    @Test
    void testNoSuchFiles() {
        Path path = Paths.get("src/test/Resources/xyz.txt");
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> recipe.readFile(path));
        assertEquals("Error while reading file", exception.getMessage());
    }


}