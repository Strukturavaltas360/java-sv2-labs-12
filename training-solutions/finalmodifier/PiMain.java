package finalmodifier;

public class PiMain {

    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator();

        System.out.println(circleCalculator.PI);
        System.out.println(circleCalculator.calculateArea(3));
        System.out.println(circleCalculator.calculatePerimeter(3));
        System.out.println();

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateSurfaceArea(3,3));
        System.out.println(cylinderCalculator.calculateVolume(3,3));

        System.out.println();

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(3,3));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(3,3));

    }
}
