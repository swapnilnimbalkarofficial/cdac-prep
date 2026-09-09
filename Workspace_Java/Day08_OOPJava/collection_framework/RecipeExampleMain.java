package collection_framework;

import java.util.List;

public class RecipeExampleMain {

    public static void main(String[] args) {

        Recipe r1 = new Recipe();

        r1.setName("Vada Pav");
        r1.setPreparationTime(30);

        List<String> vadaIngredients =
                List.of("Potato", "Bread", "Chatani");

        r1.setIngredients(vadaIngredients);

        // ----------------------------

        Recipe r2 = new Recipe();

        r2.setName("Misal Pav");
        r2.setPreparationTime(40);

        List<String> misalIngredients =
                List.of("Mataki", "Onion", "Chatani");

        // Add list of ingredients
        r2.addIngredient(misalIngredients);

        r2.addIngredient("Sauce");
        r2.addIngredient("Cheese");
        r2.addIngredient("Mirchi");

        // ----------------------------

        System.out.println("Name: " + r1.getName());
        System.out.println("Ingredients: " + r1.getIngredients());

        List<String> firstName = r1.getIngredients();

        for (String ing : firstName) {
            System.out.println(ing);
        }

        System.out.println("--------------------------------------------");

        System.out.println("Name: " + r2.getName());
        System.out.println("Ingredients: " + r2.getIngredients());

        List<String> secondName = r2.getIngredients();

        for (String ing : secondName) {
            System.out.println(ing);
        }
    }
}