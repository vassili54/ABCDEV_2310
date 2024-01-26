package Exo_PoupeeRusse_v1;

public class App {

	public static void main(String[] args) {
		// Création de quatre objets PoupeeRusse
        PoupeeRusse poupee1 = new PoupeeRusse(1, false, false, false);
        PoupeeRusse poupee2 = new PoupeeRusse(2, false, false, false);
        PoupeeRusse poupee3 = new PoupeeRusse(3, false, false, false);
        PoupeeRusse poupee4 = new PoupeeRusse(4, false, false, false);

        // Exemple d'utilisation des méthodes
        poupee1.ouvrir();
        poupee2.placerDans(poupee1);
        poupee3.placerDans(poupee2);
        poupee4.placerDans(poupee3);

        // Utilisation des getters pour afficher les valeurs
        System.out.println("Taille de la poupée 1 : " + poupee1.getTaille());
        System.out.println("Poupée 1 est ouverte : " + poupee1.isEstOuverte());
        System.out.println("Poupée 2 est contenue dans Poupée 1 : " + poupee2.isEstContenuDans());
        System.out.println("Poupée 3 contient une poupée : " + poupee3.isContientPoupee());
        System.out.println("Poupée 4 est contenue dans Poupée 3 : " + poupee4.isEstContenuDans());
	}

}
