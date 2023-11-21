package exemplescanner;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Déclaration des variables
        int nombre1; // est un entier
        int nombre2; // est un entier
        int resultat; // est un entier

        Scanner sc = new Scanner(System.in);
        
        // Saisie du premier nombre
        System.out.println("Saisir le 1er nombre");
        nombre1 = sc.nextInt();

        // Saisie du deuxième nombre
        System.out.println("Saisir le 2eme nombre");
        nombre2 = sc.nextInt();

        // Calcul de la moyenne
        resultat = nombre1 + nombre2;

        // Affichage de la moyenne
        System.out.println("Le resultat de l'addition de " +nombre1+" et " +nombre2+" est "+resultat);

        // Fermeture du scanner
        sc.close();

	}

}
