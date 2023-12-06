package Exo_Boucle_4;

import java.util.Scanner;

public class App {
/*
Variables
	nombre est un entier
	somme est un entier
	i est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
	somme <-- 0
Debut pour
	Pour i allant de 1 à nombre
	somme <-- somme + i
	i suivant
Fin pour
	Ecrire "La somme est :",somme
Fin du programme
 */
	public static void main(String[] args) {
		//Variables
		int nombre, somme, i;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		somme = 0;
		for(i = 1; i <= nombre; i++)
		{
			somme = somme + i;
		}
		System.out.println("La somme est : "+somme);
		
		sc.close();
	}

}
