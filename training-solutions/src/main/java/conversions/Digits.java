package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    List<Integer> integerList = new ArrayList<>();

    public void addDigitsToList(String text) {
        for (int i=0;i<text.length();i++) {
             if (Character.isDigit(text.charAt(i))) {
               integerList.add(Character.getNumericValue(text.charAt(i)));
           }
        }
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public static void main(String[] args) {

        Digits digits = new Digits();
        digits.addDigitsToList("r0jlk3j8he7j49kolo5ii23");
        System.out.println(digits.getIntegerList());
    }
}
