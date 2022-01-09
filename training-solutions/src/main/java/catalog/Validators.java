package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String s) {
        if (s == null) {
            return true;
        }
        if (s.isBlank()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List list) {
        if (list == null) {
            return true;
        }
        if (list.size() == 0) {
            return true;
        }
        return false;
    }
}
