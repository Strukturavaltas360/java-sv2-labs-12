package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path) {
        StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(getAlphabeticCharacterFrom(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return result.toString();
    }

    private char getAlphabeticCharacterFrom(String line) {
        char[] chars = line.toCharArray();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                return c;
            }
        }
        return ' ';
    }
}