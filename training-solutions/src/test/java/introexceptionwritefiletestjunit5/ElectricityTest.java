package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File TemporaryFolder;

    @Test
    void testWriteFile() throws IOException {

        Electricity electricity = new Electricity();
        electricity.makelist();

        Path path = TemporaryFolder.toPath().resolve("streets.txt");

        assertEquals("Apáca utca", electricity.getElectricity().get(1));
        System.out.println(path);

        electricity.writeStreets(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(electricity.getElectricity(), lines);

    }

}