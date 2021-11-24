package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testGetTrainerWithMaxAge() {
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Ferenc",45),
                new Trainer("Ildikó",35),
                new Trainer("Péter",59),
                new Trainer("Judit",25),
                new Trainer("Anita",31),
                new Trainer("Attila",44));

        assertEquals("Péter",new MaxAgeCalculator().getTrainerWithMaxAge(trainers).getName());
    }
}