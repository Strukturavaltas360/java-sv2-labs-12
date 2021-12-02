package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("fig");
        fruit.setWeight(1.3);
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("grape");
        grape.setType("Chardonnay");
        grape.setWeight(0.8);
        System.out.println(grape.getName());
        System.out.println(grape.getType());
        System.out.println(grape.getWeight());

        Apple apple = new Apple();
        apple.setName("apple");
        apple.setPieces(5);
        apple.setWeight(0.4);
        System.out.println(apple.getName());
        System.out.println(apple.getPieces());
        System.out.println(apple.getWeight());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("golden delicious");
        goldenDelicious.setPieces(7);
        goldenDelicious.setWeight(0.5);
        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getColour());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getWeight());

        Starking starking = new Starking();
        starking.setName("starking");
        starking.setPieces(6);
        starking.setWeight(0.3);
        System.out.println(starking.getName());
        System.out.println(starking.getColour());
        System.out.println(starking.getPieces());
        System.out.println(starking.getWeight());
    }
}
