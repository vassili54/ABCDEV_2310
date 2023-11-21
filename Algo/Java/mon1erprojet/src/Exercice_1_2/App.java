package Exercice_1_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Déclaration des variables
		int rayon; //est un entier
		double aire; // est un réel
		double volume; // est un réel
		
		Scanner sc = new Scanner(System.in);
		
		
		// Saisie du rayon
		System.out.println("Veuillez saisir le rayon de la sphère : ");
		
		rayon = sc.nextInt();
	    
		// Calcul de l'aire
	    aire = 4 * Math.PI * Math.pow(rayon, 2);
	    
	    // Affichage de l'aire // cm² = cm\u00B2
        System.out.println("L'aire de la sphère est : " + aire + " cm\u00B2 ");
        
        
        // Calcul de Volume
        volume = (4.0 / 3.0) * Math.PI * Math.pow(rayon, 3);

        // Affichage de volume // cm³ = cm\u00B3
        System.out.println("volume de la sphère est : " + volume + " cm\u00B3 ");



        // Attente de la saisie pour éviter la fermeture immédiate de la console
        System.out.println("Appuyez sur une touche pour quitter.");
        
        // Fermeture du scanner
        sc.close();
	    
	}

}
