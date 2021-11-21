package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Recipe {
    private List<String> ingredients;

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path){
        List<String> recipe = readFile(path);
        for (String actual: recipe) {
            if (actual.contains(" ") && actual.length()>1) {
                String[] temp = actual.split("a");
                recipe.add(temp[2]);
            }
        }
    }

    public List<String> readFile(Path path) {
        try {
            return ingredients = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file",ioe);
        }
    }
}
