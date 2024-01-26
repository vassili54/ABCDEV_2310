package Exo_Montre;

public class App {

	public static void main(String[] args) {
		// Création d'une montre
	    Montre montre = new Montre(13, 45);

	    // Création d'une personne
	    Personne personne = new Personne("Jean");

	    // La personne porte la montre
	    personne.porterMontre(montre);

	    // La personne demande l'heure à une autre personne
	    String heure = personne.demanderHeure(new Personne("Marie"));

	    // Affichage de l'heure
	    System.out.println(heure);

	}

}
