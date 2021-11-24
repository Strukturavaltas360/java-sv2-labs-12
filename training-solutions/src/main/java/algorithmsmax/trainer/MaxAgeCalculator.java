package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer oldestTrainer = trainers.get(0);
        for (Trainer actualTrainer: trainers) {
            if (actualTrainer.getAge() > oldestTrainer.getAge()) {
                oldestTrainer = actualTrainer;
            }
        }
        return oldestTrainer;
    }
}
