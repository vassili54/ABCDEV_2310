package Exercice_9_v1;

import java.util.Scanner;

public class App {
/*
EXERCICE 9
Ecrivez un algorithme qui après avoir demandé un numéro de jour, 
de mois et d'année à l'utilisateur,renvoie s'il s'agit ou non d'une date valide.
Cet exercice est certes d’un manque d’originalité affligeant, 
mais après tout, en algorithmique comme ailleurs, 
il faut connaître ses classiques ! 
Et quand on a fait cela une fois dans sa vie, 
on apprécie pleinement l’existence d’un type numérique « date » dans certains langages…).
Il n'est sans doute pas inutile de rappeler rapidement que le mois de février compte 28 jours, 
sauf si l’année est bissextile, auquel cas il en compte 29. 
L’année est bissextile si elle est divisible par quatre.
Toutefois, les années divisibles par 100 ne sont pas bissextiles, 
mais les années divisibles par 400 le sont.
 
Variables 
	jour, mois, annee, jourMax sont des entiers
	jourValide, moisValide, estBissextille sont des booleens
Debut du programme
	Ecrire "Saisir le numero du jour"
	Lire jour
	Ecrire "Saisir le numero du mois"
	Lire mois
	Ecrire "Saisir l'annee"
	Lire annee
	
	estBissextille <-- annee%400 = 0 OU (annee%100 != 0 ET annee%4 = 0)
	jourMax <-- 0
	moisValide <-- mois >= 1 ET mois <= 12
Debut Si
	Si moisValide
	Alors
	Debut Si
		Si mois = 2 et estBissextille
		Alors jourMax <-- 29
		Sinon Si mois = 2
		Alors jourMax <-- 28
		Sinon Si mois = 4 
			OU mois = 6
			OU mois = 9
			OU mois = 11
		Alors jourMax <-- 30
		Sinon jourMax <-- 31
	Fin Si
	jourValide <-- jour >= 1 ET jour <= jourMax
Fin Si
Debut Si
	Si jourValide = vrai ET moisValide = vrai
	Alors Ecrire "La date est valide"
	Sinon Ecrire "La date n'est pas valide"
Fin Si
Fin du programme
 */
	public static void main(String[] args) {
		//VARIABLES
		int jour, mois, annee, jourMax;
		boolean jourValide, moisValide, estBissextile;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme
		System.out.println("Veuillez saisir le numéro d'un jour");
		jour = sc.nextInt();
		System.out.println("Veuillez saisir le numéro d'un mois");
		mois = sc.nextInt();
		System.out.println("Veuillez saisir l'annee");
		annee = sc.nextInt();
		
		estBissextile = annee%400 == 0 || (annee%100 != 0 && annee%4 == 0);
		jourMax = 0;
		moisValide = mois >= 1 && mois <= 12;
		//Debut si
		if(moisValide) 
		{
			if(mois == 2 && estBissextile) 
			{
				jourMax = 29;
			}
			else if(mois==2) 
			{
				jourMax = 28;
			}
			else if(mois == 4 || mois == 6 || mois == 9 || mois == 11)
			{
				jourMax = 30;
			}
			else
			{
				jourMax = 31;
			}
		}
		//Fin si
		
		jourValide = jour >= 1 && jour <= jourMax;
		
		//Debut Si
		if(jourValide && moisValide) 
		{
			System.out.println("La date est valide");
		}
		else 
		{
			System.out.println("La date n'est pas valide");
		}
		//Fin si
		sc.close();
	}

}
