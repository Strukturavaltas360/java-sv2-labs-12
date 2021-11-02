package math.math;

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(8,3));
        System.out.println(Math.min(8,3));

        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(43.676));

        System.out.println(Math.abs(-23));
        System.out.println(Math.negateExact(5));
        System.out.println(Math.addExact(4,5));
        System.out.println(Math.subtractExact(4,5));
        System.out.println(Math.multiplyExact(4,5));

        System.out.println(Math.pow(3,4));

        System.out.println(Math.incrementExact(67));
        System.out.println(Math.decrementExact(67));

        System.out.println(Math.random());
    }
}
