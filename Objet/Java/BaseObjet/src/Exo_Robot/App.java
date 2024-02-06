package Exo_Robot;

public class App {

	public static void main(String[] args) {
		// Utilisation
        Robot aspirateur = new Robot("iRobot", "ModèleTrucMachin");
        aspirateur.deplacer();
        aspirateur.nettoyer();
        aspirateur.retourBase();
        System.out.println("Niveau de batterie actuel : " + aspirateur.getNiveauBatterie());

	}

}
