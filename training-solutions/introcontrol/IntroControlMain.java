package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl control = new IntroControl();

        System.out.println(control.subtractTenIfGreaterThanTen(8));
        System.out.println(control.describeNumber(0));
        System.out.println(control.greetingToJoe("Joe"));
        System.out.println(control.calculateBonus(1000000));
        System.out.println(control.calculateConsumption(9990,10));

        control.printNumbers(9);
        control.printNumbersBetween(3,7);
    }
}
