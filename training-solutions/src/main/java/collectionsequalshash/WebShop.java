package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    List<Product> products = new ArrayList<>();

    public int findHowMany(Product product) {
        int counter =0;
        for (Product p: products) {
            if (p.equals(product)) {
                counter ++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.products.add(new Product("alma",2323));
        webShop.products.add(new Product("eper",2324));
        webShop.products.add(new Product("banán",2325));
        webShop.products.add(new Product("pirosalma",2323));
        webShop.products.add(new Product("szőlő",2326));
        webShop.products.add(new Product("dió",2327));
        webShop.products.add(new Product("zöldalma",2323));

        System.out.println(webShop.findHowMany(new Product("starking",2323)));
    }
}
