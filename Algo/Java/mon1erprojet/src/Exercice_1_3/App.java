package Exercice_1_3;

import java.util.Scanner;

public class App {

	/* 
           Exercice 1.3 Calcul de la surface d'un secteur circulaire

Variable
	rayonR est un entier 
	angleA est un entier
	aire est un reel
Constante
	pi est un reel
Début du programme
	Ecrire " Saisir le rayon R"
	lire rayonR
	Ecrire " Saisir l'angle a"
	lire angleA
	aire <-- (pi*rayonR^2*angleA)/360
	ecrire "L'aire du secteur circulaire est : ",aire 
fin du programme 
 
 */
	public static void main(String[] args) {
		// Déclaration des variables
		int rayon; //est un entier
		int angle; //est un entier
		double aire; // est réel
		
		Scanner  sc = new Scanner(System.in);
		
		// Saisie du rayon
		System.out.println("Saisir le rayon : ");
		rayon = sc.nextInt();
		
		// Saisie de l'angle
		System.out.println("Saisir l'angle : ");
		angle = sc.nextInt();
		
		// Calcul l'aire du secteur circulaire
		aire = (Math.PI * Math.pow(rayon, 2) * angle) / 360;
		
		// Affichage de l'aire du secteur circulaire
	    System.out.println("L'aire du secteur circulaire est : " + aire);
			
		// Fermeture du scanner
        sc.close();
	}

}
