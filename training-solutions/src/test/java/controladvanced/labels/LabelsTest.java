package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {

    @Test
    void labelstest(){
        Labels labels = new Labels();
        int [][] intarrays = labels.getTableOfNumbers(7);

        assertEquals(9, intarrays[3][4]);

        assertEquals(10, labels.getTableOfNumbers(7)[3][5]);
    }
}
