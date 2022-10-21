package recipes;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();
    public void addRecipe(Recipe recipe) {
        if (!recipes.add(recipe)) {
            System.out.println("Такой рецепт есть в списке");
            throw new IllegalArgumentException();
        }
    }

    public void addRecipe(String name, ProductList pl) {
        Recipe temp = new Recipe(name, pl);
        addRecipe(temp);
    }

    @Override
    public String toString() {
        var sb = new  StringBuilder();
        for (Recipe recipe : recipes) {
            sb.append(recipe.toString());
        }
        return sb.toString();
    }
}
