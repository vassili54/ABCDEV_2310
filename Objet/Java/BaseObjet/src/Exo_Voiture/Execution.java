package Exo_Voiture;

public class Execution {

	public static void main(String[] args) {
		// Création d'une voiture avec le constructeur par défaut
		Voiture voiture1 = new Voiture();
		
		// Affichage des résultats de la première voiture
		System.out.println("Résultats de la première voiture :");
		voiture1.afficher();
		System.out.println();
		// Création d'une deuxième voiture avec le constructeur avec paramètres
		Voiture voiture2 = new Voiture("Toyota", 25000.0);
		// Affichage des résultats de la deuxième voiture
		System.out.println("Résultats de la deuxième voiture :");
		voiture2.afficher();
		
	}

}
