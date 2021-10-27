package dogs;

public class Dog {

    String name;
    int age;
    String colour;

    @Override
    public String toString() {
        return "Dog's name: " + name + "  - Age: " + age + "  - Colour: "+colour;
    }

    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
