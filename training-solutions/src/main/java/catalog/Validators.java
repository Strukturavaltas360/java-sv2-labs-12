package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String s) {
        if (s == null) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List s) {
        if (s == null) {
            return true;
        }
        return false;
    }
}
