package junit5;

public class Gentleman {

    public String sayHello(String name){
        if (name == null) {
            return "Hello Anonimus";
        }
        return "Hello "+name;
    }

}
