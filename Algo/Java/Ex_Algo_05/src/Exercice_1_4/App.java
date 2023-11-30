package Exercice_1_4;

import java.util.Scanner;

public class App {
	/*
	Variable
	    somme est un entier
	    interet est un reel
	    nombreAnnee est un entier
	    interetSimple est reel
	    interetComposer est reel
	Debut du programme
	    Ecrire "Saisir la somme"
	    Lire somme
	    Ecrire "Saisir l'interet"
	    Lire interet
	    Ecrire " Saisir le nombre d'annee"
	    Lire nombre d'annee
	    interet simple <--somme*(1+nombre d'annee*(interet/100))
	    interet composer <--somme*(1+interet/100)^nombre d'annee
	    Ecrire "valeur acquise avec interet simple", interetSimple
	    Ecrire "valeur acquise avec interet composer", interetComposer
	FIN Programme
			 */
			
	public static void main(String[] args) {
		        // Déclaration des variables
				int somme; //est un entier
				double interet; // est un réel
				int nombreAnnee; // est un entier
				double interetSimple; // est un réel
				double interetComposer; // est un Réel
				
				
		        //Debut du programme

		        Scanner sc = new Scanner(System.in);		
				
		        //Saisir la somme
		        System.out.println("Saisir la somme ");
		        somme  = sc.nextInt();
		        //Saisir l'interet
		        System.out.println("Saisir l'interet ");
		        interet = sc.nextDouble();
		        //Saisir le nombre d'annee
		        System.out.println("Saisir le nombre d'annee");
		        nombreAnnee = sc.nextInt();
		        
		        interetSimple = somme * (1 + nombreAnnee * interet / 100);
		        interetComposer = somme * Math.pow(1 + interet/100) ^ nombreAnnee;
		        System.out.println("valeur acquise avec interet simple est ", interetSimple);
		        System.out.println("valeur acquise avec interet composer est ", interetComposer);
		        
		        // Fermeture du scanner
		        sc.close();		
		
	}

}
