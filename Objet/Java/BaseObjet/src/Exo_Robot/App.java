package Exo_Robot;

public class App {

	public static void main(String[] args) {
		// Exemple d'utilisation
        Robot aspirateur = new Robot("iRobot", "ModèleXYZ");
        aspirateur.déplacer();
        aspirateur.nettoyer();
        aspirateur.retourBase();
        System.out.println("Niveau de batterie actuel : " + aspirateur.getNiveauBatterie());

	}

}
