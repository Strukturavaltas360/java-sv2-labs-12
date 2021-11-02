package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store1 = new Store("Cipő");
        Store store2 = new Store("Csizma");

        System.out.println("A nap folyamán "+store1.getProduct() +" termékből beérkezett mennyiség:");
        store1.Store(scanner.nextInt());
        System.out.println("A nap folyamán "+store1.getProduct()+" termékből kiszállított mennnyiség:");
        store1.Dispatch(scanner.nextInt());

        System.out.println("A nap folyamán "+store2.getProduct() +" termékből beérkezett mennyiség:");
        store2.Store(scanner.nextInt());
        System.out.println("A nap folyamán "+store2.getProduct()+" termékből kiszállított mennnyiség:");
        store2.Dispatch(scanner.nextInt());

        System.out.println("A mai nap záráskor a " + store1.getProduct() + " termékből készleten van " + store1.getStock()+" db.");
        System.out.println("A mai nap záráskor a " + store2.getProduct() + " termékből készleten van " + store2.getStock()+" db.");
    }
}

