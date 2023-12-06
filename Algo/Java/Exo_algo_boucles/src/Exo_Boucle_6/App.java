package Exo_Boucle_6;

import java.util.Scanner;

public class App {
/*
  Variables
	nombre est un entier
	plusGrand est un entier
	i est un entier
  Debut du programme
	plusGrand <-- 0
  Debut pour
	pour i allant de 1 à 20
		Ecrire "Saisir un nombre"
		Lire nombre
	Debut Si
		Si i = 1 OU nombre > plusGrand
		Alors plusGrand <-- nombre
	Fin Si
	i suivant
 Fin pour
	Ecrire "Le nombre le plus grand est : ",plusGrand
 Fin du programme

 */
	public static void main(String[] args) {
		//Variables
		int nombre, plusGrand;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut programme
		plusGrand = 0;
		
		for (int i = 1; i <= 20; i++)
				{
					System.out.println("Saisir un nombre : ");
					nombre = sc.nextInt();
					
					if (i == 1 || nombre > plusGrand)
					{
						plusGrand = nombre;
					}
				}
				
				System.out.println("Le nombre le plus grand est : "+plusGrand);
				
				sc.close();

	}

}
