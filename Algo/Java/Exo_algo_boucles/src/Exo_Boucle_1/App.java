package Exo_Boucle_1;

import java.util.Scanner;

public class App {
/*
Variables
	nombre est un entier
Debut du programme
nombre<-- 0
Debut tant que
	tant que nombre < 1 OU nombre > 3
	faire
		Ecrire "Saisir un nombre entre 1 et 3"
		Lire nombre
Fin tant que
fin du programme
 */
	public static void main(String[] args) {
		
		//VARIABLES
        int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		nombre = 0;
		
		while(nombre < 1 || nombre > 3)
		{
			System.out.println("Saisir un nombre entre 1 et 3");
			nombre = sc.nextInt();
		}
		sc.close();
	}

}
