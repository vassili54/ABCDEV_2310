package Exo_4;

import java.util.Scanner;

public class App {
/*
Enoncé 4:
Ecrire et utiliser une fonction déterminant 
si une année passée en paramètre est bissextile ou non


PROCEDURE AnneeBisextille (VAL entier annee)

Debut Si
		Si annee mod 4 = 0 ET annee mod 100 != 0 OU annee mod 400 = 0 
		Alors
			Ecrire "l'annee ",annee," est bisextille"
		Sinon
			Ecrire "l'annee ",annee," n'est pas bisextille"
	Fin Si
FIN PROCEDURE

Variable
	annee est un entier
Debut du programme
	Ecrire "saisir une année"
	Lire annee
	
	AnneeBisextille(annee)

Fin du programme
 */
	public static void AnneeBisextille(int annee) 
	{
		
		if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0 ) 
		{
			System.out.println("l'annee " +annee+ " est bisextille");
		}
		else 
		{
			System.out.println("l'annee " +annee+ " n'est pas bisextille");
		}
	}
	public static void main(String[] args) {
		int annee;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une année");
		annee = sc.nextInt();
		
		sc.close();
		
		AnneeBisextille(annee);

	}

}
