package interfacerules.commonproperties;

public class IkeaFurniture implements Length, Name, Width{

    private double width;
    private double length;
    private String name;

    public IkeaFurniture(String name, double length, double width) {
        this.width = width;
        this.length = length;
        this.name = name;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
