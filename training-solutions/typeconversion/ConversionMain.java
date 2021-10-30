package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.convertDoubleToDouble(8.545));

        int [] arrayofInts = {1,2,-3,4,215,-221, 122, 0};
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(arrayofInts)));

    }
}
