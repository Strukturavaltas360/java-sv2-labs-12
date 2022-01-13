package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    Map<String, Integer> paper = new HashMap<>();

    public void putFurtherPaper(String className, int kilogramms) {
        if (!paper.containsKey(className)) {
            paper.put(className, 0);
        }
        paper.put(className, paper.get(className) + kilogramms);
    }

    public String getWinnerClass() {
        String winner = null;
        int max = Integer.MIN_VALUE;
        for (String actual : paper.keySet()) {
            if (max < paper.get(actual)) {
                max = paper.get(actual);
                winner = actual;
            }
        }
        return winner;
    }


//    public String getWinnerClass() {
//        String winner = null;
//        int max = Integer.MIN_VALUE;
//            for (Map.Entry<String,Integer> actual: paper.entrySet()) {
//                if (max < actual.getValue()) {
//                    max = actual.getValue();
//                    winner = actual.getKey();
//                }
//            }
//        return winner;
//    }


    public int getTotalWeight() {
        int sum = 0;
        for (Integer actual : paper.values()) {
            sum += actual;
        }
        return sum;
    }

    public Map<String, Integer> getPaper() {
        return new HashMap<>(paper);
    }
}
