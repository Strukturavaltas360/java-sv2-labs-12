package controlselections.accents;

import controlselection.accents.WithoutAccents;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {

    @Test
    void Accentest(){
        WithoutAccents withoutAccents = new WithoutAccents();
        char c = 'á';
        assertEquals('a',withoutAccents.getCharsWithoutAccent(c));

        c = 'Ó';
        assertEquals('O',withoutAccents.getCharsWithoutAccent(c));

        c = 'U';
        assertEquals('U',withoutAccents.getCharsWithoutAccent(c));

        c = 'k';
        assertEquals('k',withoutAccents.getCharsWithoutAccent(c));
    }
}
