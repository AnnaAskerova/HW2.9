package recipes;

import java.util.Objects;

public class Recipe {
    private final String recipeName;
    private final ProductList products;
    private final Float foodCost;

    public Recipe(String recipeName, ProductList products) {
        if (recipeName == null || recipeName.isBlank()) {
            System.out.println("Не указано название");
            throw new IllegalArgumentException();
        } else {
            this.recipeName = recipeName;
        }
        if (products == null) {
            System.out.println("Пустой список продуктов");
            throw new IllegalArgumentException();
        } else {
            this.products = products;
        }
        foodCost = products.getSum();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public ProductList getProducts() {
        return products;
    }

    public Float getFoodCost() {
        return foodCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return recipeName.equals(recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return recipeName + '\n' + products + String.format("Стоимость продуктов %.2f\n", foodCost);
    }
}
