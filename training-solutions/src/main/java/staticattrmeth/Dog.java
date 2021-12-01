package staticattrmeth;

public class Dog {
    private String name;
    private int age;
    private Species species;
    private long code;

    public Dog(String name, int age, Species specie) {
        this.name = name;
        this.age = age;
        this.species = specie;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Species getSpecies() {
        return species;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
