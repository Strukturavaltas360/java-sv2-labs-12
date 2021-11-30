package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        argsTest(results);
        int count = 0;
        double limit = 1.0 * maxPoints * limitInPercent / 100d;
        for (int actual : results) {
            if (actual > limit) {
                count++;
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        argsTest(results);
        double limit = 1.0 * maxPoints * limitInPercent / 100;
        for (int actual : results) {
            if (actual < limit) {
                return true;
            }
        }
        return false;
    }

    private void argsTest(int[] args) {
        if (args == null || args.length ==0) {
            throw new IllegalArgumentException("Number of results must not be empty!");

        }
    }

}
