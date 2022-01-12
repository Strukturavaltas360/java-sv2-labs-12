package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int next= Integer.MAX_VALUE;
        for (int i : applicants.keySet()) {
            if (i > lastNumber && i - lastNumber < next) {
                next = i;
            }
        }
        return applicants.get(next);
    }
}
