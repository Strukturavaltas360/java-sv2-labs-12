package collectionsset;

import java.util.*;

public class QuestionGame {

    List<RightAnswer> rightAnswers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> result = new HashSet<>();
        Random random = new Random();
        while (result.size() != 5) {
            if (rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int i = random.nextInt(rightAnswers.size());
            result.add(rightAnswers.get(i).getName());
            rightAnswers.remove(i);

        }
        System.out.println(result);
        return result;
    }

}
