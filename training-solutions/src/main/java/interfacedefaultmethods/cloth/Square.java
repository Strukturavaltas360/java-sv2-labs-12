package interfacedefaultmethods.cloth;

public interface Square {

    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return Math.sqrt(2) * getSide();
    }

    default double getPerimeter() {
        return getSide() * getNumberOfSides();
    }

    default double getArea() {
        return getSide() * getSide();
    }

    double getSide();
}
