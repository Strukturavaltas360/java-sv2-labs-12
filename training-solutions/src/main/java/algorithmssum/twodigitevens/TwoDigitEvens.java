package algorithmssum.twodigitevens;

public class TwoDigitEvens {

    public int getSum() {
        int sum = 0;
        for (int i = 10; i<100;i++)
            if (i%2 != 0 && i%5 != 0) {
                sum += i;
            }
        return sum;
    }

}
