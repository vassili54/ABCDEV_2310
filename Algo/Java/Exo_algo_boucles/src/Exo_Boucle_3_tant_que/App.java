package Exo_Boucle_3_tant_que;

import java.util.Scanner;
/*
Variables
	nombre est un entier
	i est un entier
Debut du programme
	i <-- 1
	Ecrire "Saisir un nombre"
	Lire nombre
Debut tant que
	Tant que i <= 10
	Faire
	nombre <-- nombre + 1
	Ecrire nombre, " "
	i <-- i + 1
Fin tant que
Fin du programme
 */
public class App {

	public static void main(String[] args) {
		//VARIABLE
		int nombre, i;
		Scanner sc = new Scanner(System.in);
		
		//Debut programme
		i = 1;
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		while(i<=10)
		{
			nombre = nombre + 1;
			System.out.print(nombre + " ");
			i++;
		}
		
		sc.close();

	}

}
