package Exo_Boucle_5;

import java.util.Scanner;

public class App {
/*
Variables
	nombre est un entier
	factorielle est un entier
	i est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
	factorielle <-- 1
Debut pour
	Pour i allant de 2 à nombre
	factorielle <-- factorielle * i
	i suivant
Fin pour
	Ecrire "La factorielle de ",nombre" est :",factorielle
Fin du programme
 */
	public static void main(String[] args) {
		//Variables
		int nombre, factorielle, i;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut programme
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		factorielle = 1;
		for(i = 2; i <= nombre; i++)
		{
			factorielle = factorielle * i;
		}
		System.out.println("La factorielle de " +nombre+" est :" +factorielle);
		
		sc.close();
	}

}
