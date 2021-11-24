package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            if (Math.abs((i / 10) - (i % 10)) == 5) {
                count ++;
            }
        }
        return count;
    }
}
