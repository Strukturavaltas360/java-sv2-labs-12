package methodstructure.bmi;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getBodyMassIndex() {
        return weight / height * height;
    }

    public BmiCategory getBody() {
        if (getBodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        }
        return (getBodyMassIndex() > 25 ? BmiCategory.OVERWEIGHT : BmiCategory.NORMAL);
    }


    public boolean isThinnerThan(BodyMass other) {
        return this.getBodyMassIndex() < other.getBodyMassIndex();

    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}