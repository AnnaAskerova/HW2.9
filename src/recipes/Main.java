package recipes;


public class Main {
    public static void main(String[] args) {

        var forBorsch = new ProductList();
        forBorsch.addProduct("Говядина", 600f, 0.5f);
        forBorsch.addProduct("Картофель", 39.90f, 0.5f);
        forBorsch.addProduct("Морковь", 49.90f, 0.2f);
        forBorsch.addProduct("Лук", 19.90f, 0.2f);
        forBorsch.addProduct("Томаты", 119.90f, 0.6f);
        forBorsch.addProduct("Капуста", 46.90f, 0.4f);
        var borsch = new Recipe("Борщ", forBorsch);

        var forMeatBall = new ProductList();
        forMeatBall.addProduct("Свинина", 450f, 0.3f);
        forMeatBall.addProduct("Яйца", 150f, 0.07f);
        forMeatBall.addProduct("Манная крупа", 79.90f, 0.05f);
        forMeatBall.addProduct("Лук", 19.90f, 0.1f);
        var meatBall = new Recipe("Фрикадельки", forMeatBall);
        var meatBalls = new Recipe("Мясные шарики", forMeatBall);
        var meatBalls2 = new Recipe("Мясные шарики", forBorsch);

        var recipeList = new RecipeList();
        recipeList.addRecipe(borsch);
        recipeList.addRecipe(meatBalls);
        recipeList.addRecipe(meatBall);
//        recipeList.addRecipe(meatBalls2);
        System.out.println(recipeList);
    }
}