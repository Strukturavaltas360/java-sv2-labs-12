package literals;

public class LiteralsMain {

    public static void main(String[] args) {
        System.out.println("1"+"2");

        double quotient = 3/4F;
        double quotient2 = 3F/4F;
        double quotient3 = 3D/4;
        double quotient4 = 3F/4.0;


        System.out.println(quotient);
        System.out.println(quotient2);
        System.out.println(quotient3);
        System.out.println(quotient4);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word ="title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));




    }
}
