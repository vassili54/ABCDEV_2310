package Exo_Boucle_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
/*
		 *  Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse
convienne.
*/
		
		/* VARIABLES */
		
		int nombreUtilisateur; // est un entier
		
		/* DEBUT PROGRAMME */
		
		Scanner sc = new Scanner(System.in);
		
	    do {
		 
	      System.out.println("Saisir un nombre compris entre 1 et 3 : ");
	      
		   nombreUtilisateur = sc.nextInt();

	    if (nombreUtilisateur < 1 || nombreUtilisateur > 3) 
	        System.out.println("La réponse ne convient pas.");
	    }    
		while (nombreUtilisateur < 1 || nombreUtilisateur > 3);

	    
	          System.out.println("La réponse convient.");
			   
	       

	    // FIN PROGRAMME
	    sc.close();
		
		
		/* Si nombreUtilisateur < 1 OU nombreUtilisateur > 3 Alors
	    Ecrire "La réponse ne convient pas."
	Fin Si

	Pour limiteNombre <-- 1 à 3 Faire
	    Si nombreUtilisateur = limiteNombre Alors
	        Ecrire "La réponse convient."
	    Fin Si
	Fin Pour */
		
		
	}

}
