package Exercice_1_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		int rayon; //est un entier
		int angle; //est un entier
		double aire; // est réel
		
		Scanner sc = new Scanner(System.in);
		
		// Saisie du rayon
		System.out.println("Saisir le rayon : ");
		
		rayon = sc.nextInt();
		
		// Saisie de l'angle
		System.out.println("Saisir l'angle : ");
		
		// Calcul l'aire du secteur circulaire
		aire = (Math.PI * rayon^2 * angle) / 360
		
		// Affichage de l'aire du secteur circulaire
	    System.out.println("L'aire du secteur circulaire est : " + aire);
			
		// Fermeture du scanner
        sc.close();
	}

}
