package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    List<Integer> numbers = new ArrayList<>();

    private void initLottery(int ballCount) {
        for (int i = 1; i <= ballCount; i++) {
            numbers.add(i);
        }
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        initLottery(ballCount);
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < lotteryType) {
            Collections.shuffle(numbers);
            if (!result.contains(numbers.get(0))) {
                result.add(numbers.get(0));
                i++;
            }
        }
        Collections.sort(result);
        return result;
    }

}
