package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path){
        List<String> recipe = readFile(path);
        for (String actual: recipe) {
            if (actual.contains(" "))  {
                String[] temp = actual.split(" ");
                ingredients.add(temp[2]);
            }
        }
    }

    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file",ioe);
        }
    }
}
