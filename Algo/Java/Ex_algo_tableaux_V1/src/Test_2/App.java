package Test_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le nombre de valeurs
        System.out.print("Entrez le nombre de valeurs : ");
        int nombreDeValeurs = scanner.nextInt();

        // Créer un tableau pour stocker les valeurs
        int[] tableau = new int[nombreDeValeurs];

        // Saisir les valeurs et les stocker dans le tableau
        for (int i = 0; i < nombreDeValeurs; i++) {
            System.out.print("Entrez la valeur #" + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Fermer le scanner après avoir terminé la saisie
        scanner.close();

        // Compter le nombre de valeurs positives et négatives
        int nombrePositives = 0;
        int nombreNegatives = 0;

        for (int valeur : tableau) {
            if (valeur > 0) {
                nombrePositives++;
            } else if (valeur < 0) {
                nombreNegatives++;
            }
        }

        // Afficher le résultat
        System.out.println("Nombre de valeurs positives : " + nombrePositives);
        System.out.println("Nombre de valeurs négatives : " + nombreNegatives);

	}

}
