package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    void test() {
        Measurement measurement = new Measurement();
        Path path = Path.of("measurementdata.csv");
        List<String> lines = measurement.readFromFile(path);
        List<String> errorLines = measurement.validate(lines);
        for (String s: errorLines) {
            System.out.println(s);
        }
        assertEquals("3,12a.4,John Doe --> | Hibás mért adat | ",errorLines.get(2));
        assertEquals("a1,12a.4,John Doe --> | Hibás sorszám | Hibás mért adat | ",errorLines.get(4));
    }

}