package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> voteResultIntegerMap = new HashMap<>();
        for (Map.Entry<String, VoteResult> me : votes.entrySet()) {
            if (!voteResultIntegerMap.containsKey(me.getValue())) {
                voteResultIntegerMap.put(me.getValue(), 0);
            }
            voteResultIntegerMap.put(me.getValue(), voteResultIntegerMap.get(me.getValue())+1);
        }
        System.out.println(voteResultIntegerMap);
        return voteResultIntegerMap;
    }
}
