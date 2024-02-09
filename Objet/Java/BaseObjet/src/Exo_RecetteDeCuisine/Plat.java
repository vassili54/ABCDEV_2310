package Exo_RecetteDeCuisine;

import java.util.ArrayList;

public class Plat {
	private String nom;
    private ArrayList<Ingredient> ingredients;

    public Plat(String nom) {
        this.nom = nom;
        this.ingredients = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void ajouterIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public boolean comparer(Plat autrePlat) {
        ArrayList<Ingredient> autreIngredients = autrePlat.getIngredients();

        if (ingredients.size() != autreIngredients.size()) {
            return false;
        }

        for (Ingredient ingr : ingredients) {
            boolean found = false;
            for (Ingredient autreIngr : autreIngredients) {
                if (ingr.comparer(autreIngr)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }

        return true;
      }
}