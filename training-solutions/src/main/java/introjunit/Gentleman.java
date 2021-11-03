package introjunit;

public class Gentleman {
    public String sayHello(String name) {

        if (name == null || " ".equals(name.trim())) {
            return "Hello Anonymus";
        }

        return "Hello "+name;
    }
}
