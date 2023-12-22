package Exercice_7;

import java.util.Scanner;

public class App {
/*
EXERCICE 7
Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :
• lorsque l'un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
• en cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins
12,5% des voix au premier tour.
Vous devez écrire un algorithme qui permette la saisie des scores de quatre candidats au premier tour.
Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) :
 il dira s'il est élu, battu, s'il se trouve en ballottage favorable 
 (il participe au second tour en étant arrivé en tête à l'issue du premier tour) 
ou défavorable (il participe au second tour sans avoir été en tête au premier tour).
 
Variables
	candidat1, candidat2, candidat3, candidat4 sont des reels
	condition1, condition2, condition3, condition4 sont des booleens
Debut du programme
	Ecrire "Saisir le score du candidat 1 :"
	Lire candidat1
	Ecrire "Saisir le score du candidat 2 :"
	Lire candidat2
	Ecrire "Saisir le score du candidat 3 :"
	Lire candidat3
	Ecrire "Saisir le score du candidat 4 :"
	Lire candidat4
	condition1 <-- candidat1 > 50
	condition2 <-- candidat2 > 50 OU candidat3 > 50 ou candidat4 > 50
	condition3 <-- candidat1 >= candidat2 ET candidat1 >= candidat3 ET candidat1 >= candidat4
	condition4 <-- candidat1 >= 12,5
Debut Si
	Si condition1 = vrai
	Alors Ecrire "Elu au premier tour"
	Sinon Si condition2 = vrai OU condition4 = faux
	Alors Ecrire "Battu, eliminé, sorti !!!"
	Sinon Si condition3 = vrai
	Alors Ecrire "Ballotage favorable"
	Sinon Ecrire "Ballotage defavorable"
Fin Si
Fin du programme
 
 */
	public static void main(String[] args) {
		//VARIABLES
		double candidat1, candidat2, candidat3, candidat4;
		boolean condition1, condition2, condition3, condition4;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme
		System.out.println("Saisir le score du candidat 1 :");
		candidat1 = sc.nextInt();
		System.out.println("Saisir le score du candidat 2 :");
		candidat2 = sc.nextInt();
		System.out.println("Saisir le score du candidat 3 :");
		candidat3 = sc.nextInt();
		System.out.println("Saisir le score du candidat 4 :");
		candidat4 = sc.nextInt();
		
		condition1 = candidat1 > 50;
		condition2 = candidat2 > 50 || candidat3 > 50 || candidat4 > 50;
		condition3 = candidat1 >= candidat2 && candidat1 >= candidat3 && candidat1 >= candidat4;
		condition4 = candidat1 >= 12.5;
		
		if(condition1) 
		{
			System.out.println("Elu au premier tour");
		}
		else if(condition2 || condition4)
		{
			System.out.println("Battu, eliminé, sorti !!!");
		}
		else if(condition3) 
		{
			System.out.println("Ballotage favorable");
		}
		else 
		{
			System.out.println("Ballotage défavorable");
		}
		
		sc.close();

	}

}
