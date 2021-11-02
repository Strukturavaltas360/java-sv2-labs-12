package finalmodifier;

public class Gentleman {


    public String sayHello(String name) {
        final String MESSAGE_PREFIX = "Pálinkás jóreggeét, kedves ";
        return (MESSAGE_PREFIX + name);
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        System.out.println(gentleman.sayHello("Péter")+"!");
    }
}
