package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Turkish");
        coffee.setPrice(450);

        System.out.println(coffee.getName()+": "+coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Best cappuccino");
        cappuccino.setPrice(850);
        System.out.println(cappuccino.getName()+": "+cappuccino.getPrice());
    }
}
