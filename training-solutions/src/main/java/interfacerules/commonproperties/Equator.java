package interfacerules.commonproperties;

public class Equator implements Length, Name {

    private final static String NAME = "Equator";
    private final static double LENGTH = 40075;

    public Equator() {
    }

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
