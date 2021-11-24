package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> childrenHeight, int heightLimit) {
        int count = 0;
        for (int i = 0; i < childrenHeight.size(); i++) {
            if (childrenHeight.get(i) > heightLimit) {
                count++;
            }
        }
        return count;
    }
}
