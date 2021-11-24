package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> townsList, int limit) {
            for (int actual: townsList ) {
                if (actual<limit) {
                    return true;
                }
            }
        return false;
    }
}
