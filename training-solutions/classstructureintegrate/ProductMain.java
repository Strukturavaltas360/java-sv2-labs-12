package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a termék?");
        String productName = scanner.nextLine();
        System.out.println("Hány forint legyen a termék egységára?");
        int productPrice = scanner.nextInt();

        Product product = new Product(productName, productPrice);

        System.out.println("A(z) "+ product.getName() + " egységára jelenleg " + product.getPrice()+ " Ft.");


        System.out.println("Ez így túl olcsó, emeljük meg az árat! Emelés mértéke (Ft): ");
        int amountOfIncrease = scanner.nextInt();
        product.increasePrice(amountOfIncrease);
        System.out.println("A(z) "+ product.getName() + " egységára jelenleg " + product.getPrice()+ " Ft.");


        System.out.println("Ez így meg kicsit sok, csökkentsük az árat! Csökkentés mértéke (Ft): ");
        int amountOfDecrease = scanner.nextInt();
        product.decreasePrice(amountOfDecrease);
        System.out.println("A(z) " + product.getName() + " egységára jelenleg " + product.getPrice()+ " Ft.");


        //Próbáld ki az osztály működését a ProductMain osztály main() metódusban,
        // ahol a példány létrehozásához szükséges adatokat a felhasználótól kéred be!
    }

}
