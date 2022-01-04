package exceptions.sum;

public class NumbersSum {


    public int getSum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Null parameter!");
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
        }

        public int getSum (String[]numbers){
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Null parameter!");
            }
            int sum =0;
            try {
                for (String s: numbers) {
                    sum += Integer.parseInt(s);
                }
            } catch (IllegalArgumentException iae) {
                throw new IllegalArgumentException("Not a number!", iae);
            }
            return sum;
        }
    }
