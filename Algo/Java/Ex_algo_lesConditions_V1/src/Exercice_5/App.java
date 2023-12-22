package Exercice_5;

import java.util.Scanner;

public class App {
/*
EXERCICE 5
Un magasin de reprographie facture 0,10 € les dix premières photocopies, 
0,09 € les vingt suivantes et 0,08€ au-delà. 
Ecrivez un algorithme qui demande à l’utilisateur le nombre 
de photocopies effectuées et qui affiche la facture correspondante.
  
  Variables
	nombre est un entier
	prix est un reel
Debut du programme
	Ecrire "Saisir le nombre de photocopie"
	Lire nombre
Debut Si
	Si nombre <= 10
	Alors
	prix <-- nombre * 0,1
	Sinon Si nombre <= 30
	Alors
	prix <-- 10 * 0,1 + (nombre - 10) * 0,09
	Sinon
	prix <-- 10 * 0,1 + 20 * 0,09 + (nombre - 30) * 0,08
Fin Si
Ecrire "Le prix total est : ", prix
Fin du programme
 */
	public static void main(String[] args) {
		//VARIABLES
		int nombre; 
		double prix;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut du programme
		System.out.println("Saisir le nombre de photocopie");
		nombre = sc.nextInt();
		if(nombre <= 10)
		{
			prix = nombre * 0.1;
		}
		else if(nombre <= 30)
		{
			prix = 10 * 0.1 + (nombre - 10) * 0.09;
		}
		else
		{
			prix = 10 * 0.1 + 20 * 0.09 + (nombre - 30) * 0.08;
		}
		
		System.out.println("Le prix total est : "+prix);
		
		sc.close();
	
	}

}
