package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers) {
        if (numbers.length > 0) {
            int[] tmp = Arrays.copyOfRange(numbers,1,numbers.length);
            return numbers[0] + getSum(tmp);
        }
        return 0;
    }
}
