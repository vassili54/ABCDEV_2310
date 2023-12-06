package Exo_Boucle_3_pour;

import java.util.Scanner;
/*
Variables 
	nombre est un entier
	i est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
Debut pour
	pour i allant de 1 à 10
	nombre <-- nombre + 1
	Ecrire nombre," "
	i suivant
Fin pour
Fin du programme
 */
public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		for(int i = 1;i <= 10;i++)
		{
			nombre = nombre + 1;
			System.out.print(nombre+" ");
		}
		
		
		sc.close();
	}

}
