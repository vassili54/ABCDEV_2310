package Exercice_2_5;

import java.util.Scanner;

public class App {
	/*
	Variable 
	nombre est un entier
	i est un entier
Debut du programme
	Ecrire "Saisir un nombre entier : "
	lire nombre
	Debut boucle Pour
		Pour i allant de 2 à nombre-1
			Debut Si
				Si nombre mod i = 0
				Alors
					Ecrire nombre, " est divisible par  : ",i
			Fin Si
		i++
	Fin boucle Pour
Fin du Programme
	 */

	public static void main(String[] args) {
		//Variable//
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme//
		System.out.println("Saisir un nombre entier : ");
		nombre = sc.nextInt();
		
		for (int i = 2; i <= nombre;i++) 
		{
			if (nombre % i == 0) 
			{
			System.out.println(nombre + " est divisible par : "+i);
			}
		}
		
		sc.close();
				
				
	}

}
