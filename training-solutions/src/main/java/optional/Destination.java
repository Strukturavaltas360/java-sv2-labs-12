package optional;

public class Destination {

    private String name;
    private String description;
    private int KmFromHome;

    public Destination(String name, String description, int kmFromHome) {
        this.name = name;
        this.description = description;
        KmFromHome = kmFromHome;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getKmFromHome() {
        return KmFromHome;
    }
}
