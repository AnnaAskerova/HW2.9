package recipes;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.add(product)) {
            return;
        } else {
            System.out.println("Такой продукт есть в списке");
            throw new IllegalArgumentException();
        }
    }

    public void addProduct(String name, Float cost, Float weight) {
        Product temp = new Product(name, cost, weight);
        addProduct(temp);
    }

    public void markAsBought(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                product.setBought(true);
            }
        }
    }

    public void deleteProduct(String name) {
        products.removeIf(product -> name.equals(product.getName()));
    }

    public Float getSum() {
        float sum = 0;
        for (Product product : products) {
            sum += (product.getCost() * product.getWeight());
        }
        return sum;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.toString());
        }
        return sb.toString();
    }
}
