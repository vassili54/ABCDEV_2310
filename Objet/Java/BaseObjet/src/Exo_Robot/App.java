package Exo_Robot;
/**
 * Énumération pour les boutons de la manette
 */
enum Manette {
 ALLUMER, ETEINDRE, AVANCER, TOURNERADROITE, TOURNERAGAUCHE, RECULER;
}

public class App {

	public static void main(String[] args) {
	       // Création d'une instance de Robot
        Robot monRobot = new Robot();

        // Simulation de l'utilisation de la manette
        monRobot.action(Bouton.ALLUMER);
        monRobot.action(Bouton.AVANCER);
        monRobot.action(Bouton.TOURNERADROITE);
        monRobot.action(Bouton.AVANCER);
        //monRobot.action(Bouton.ETEINDRE);

        // Affichage des informations sur le robot
        System.out.println(monRobot.affichageRobotInfo());
	}

}
