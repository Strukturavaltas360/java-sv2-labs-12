package controlselections.consonant;

import controlselection.consonant.ToConsonant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    @Test
    void nextChartest () {
        ToConsonant toConsonant = new ToConsonant();
        char c = 'A';
        assertEquals('B', toConsonant.nextChar(c));
        c = 'o';
        assertEquals('p', toConsonant.nextChar(c));
        c = 'x';
        assertEquals('x', toConsonant.nextChar(c));


    }


}
