package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(Integer.toBinaryString(211));
        System.out.println(operators.isEven(9));
        System.out.println(operators.getResultOfDivision(16,3));
        System.out.println(operators.isNull(null));
        System.out.println(operators.isEmpty(null));


    }
}
