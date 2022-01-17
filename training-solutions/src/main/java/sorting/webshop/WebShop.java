package sorting.webshop;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

public class WebShop {

    List<Product> products = new ArrayList<>();

    public void addProducts(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getProductsOrderByName() {
        List<Product> result = getProducts();
        Collections.sort(result, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return result;
    }

    public List<Product> getProductsOrderByPrice() {
        List<Product> result = getProducts();
        result.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return result;
    }

    public List<Product> getProductsOrderByDate() {
        List<Product> result = getProducts();
        Collections.sort(result, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return result;
    }

}
