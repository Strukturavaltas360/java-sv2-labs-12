package exceptionmulticatch.converter;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String inputString) {
        if (inputString == null) {
            throw new NullPointerException("Binary string is null.");
        }
        boolean[] result = new boolean[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            switch (inputString.charAt(i)) {
                case '1':
                    result[i] = true;
                    break;
                case '0':
                    result[i] = false;
                    break;
                default:
                    throw new IllegalArgumentException("Binary string is not valid.");
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] inputArray) {
        if (inputArray == null) {
            throw new NullPointerException("Boolean array is null.");
        }
        if (inputArray.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        StringBuilder result = new StringBuilder();
        for (boolean b : inputArray) {
            if (b) {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return result.toString();
    }
}
