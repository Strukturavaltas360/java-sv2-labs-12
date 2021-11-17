package introexceptiontrycatch;


import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("car","bus","ship","van","bike");
        try {
            for (String actual: words) {
                System.out.println(actual.charAt(0));
            }
        }
        catch (NullPointerException npe) {
            System.out.println("Itt egy kivétel: " + npe.getMessage());
            System.out.println(npe.getStackTrace());
        }
    }
}
