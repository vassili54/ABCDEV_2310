package Exo_RecetteDeCuisine;

public class App {

	public static void main(String[] args) {
		 Plat choucroute = new Plat("Choucroute");
	     choucroute.ajouterIngredient(new Ingredient("choucroute", "cuite", 500, "g"));
	     choucroute.ajouterIngredient(new Ingredient("lard", "cuit et entier", 150, "g"));
	     choucroute.ajouterIngredient(new Ingredient("saucisse", "entière et cuite", 2, ""));
	        
	     // Test de la méthode comparer
	     Plat choucroute2 = new Plat("Choucroute");
	     choucroute2.ajouterIngredient(new Ingredient("choucroute", "cuite", 500, "g"));
	     choucroute2.ajouterIngredient(new Ingredient("lard", "cuit et entier", 150, "g"));
	     choucroute2.ajouterIngredient(new Ingredient("saucisse", "entière et cuite", 2, ""));
	        
	     System.out.println("Les plats choucroute et choucroute2 sont identiques : " + choucroute.comparer(choucroute2));
	   
	}

}
