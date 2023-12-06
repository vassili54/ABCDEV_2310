package Exercice_2_4;

import java.util.Scanner;

public class App {
/*
Variable
	annee est un entier
Debut du programme
	Ecrire "saisir une année"
	Lire annee
	Debut Si
		Si annee mod 4 = 0 ET annee mod 100 != 0 OU annee mod 400 = 0 
		Alors
			Ecrire "l'annee ",annee," est bissextile"
		Sinon
			Ecrire "l'annee ",annee," n'est pas bissextile"
	Fin Si
Fin du programme
 */
	public static void main(String[] args) {
		//variable//
		int annee;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme//
		System.out.println("saisir une année ");
		annee = sc.nextInt();
		
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) 
		{
			System.out.println("L'annee "+annee+" est bissextile");
		}
		else 
		{
			System.out.println("L'annee "+annee+" n'est pas bissextile");
		}
		
		sc.close();

	}

}
