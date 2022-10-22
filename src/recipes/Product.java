package recipes;

import java.util.Objects;

public class Product {
    private final String name;
    private Float cost;
    private boolean isBought = false;

    public Product(String name, Float cost) {
        if (name == null || name.isBlank()) {
            System.out.println("Заполните карточку товара полностью");
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
        setCost(cost);
    }

    String getName() {
        return name;
    }

    Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        if (cost == null || cost <= 0) {
            System.out.println("Заполните карточку товара полностью");
            throw new IllegalArgumentException();
        } else {
            this.cost = cost;
        }
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public String toString() {
        char c = '-';
        if (isBought) {
            c = '+';
        }
        return String.format("%s, %.2f руб., %c", name, cost, c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
