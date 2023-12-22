package Exercice_4;

import java.util.Scanner;

public class App {
/*
EXERCICE 4
Cet algorithme est destiné à prédire l'avenir, et il doit être infaillible !
Il lira au clavier l’heure et les minutes, 
et il affichera l’heure qu’il sera une minute plus tard. 
Par exemple, si l'utilisateur tape 21 puis 32, l'algorithme doit répondre :
"Dans une minute, il sera 21 heures 33".
NB : on suppose que l'utilisateur entre une heure valide. 
Pas besoin donc de la vérifier.


Variables
	heures est un entier
	minutes est un entier
Debut du programme
	Ecrire "Saisir les heures : "
	Lire heures
	Ecrire " Saisir les minutes : "
	Lire minutes
	minutes <-- minutes + 1
Debut Si
	Si minutes = 60
	Alors
	minutes <-- 0
	heures <-- heures + 1
Fin Si
Debut Si
	Si heures = 24
	Alors
	heures <-- 0
Fin Si
Ecrire "Dans une minute il sera ",heures,"heure(s) ",minutes,"minute(s)"
Fin du programme
 */
	public static void main(String[] args) {
		//Variables
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme
		System.out.println("Saisir les heures : ");
		int heures = sc.nextInt();
		System.out.println("Saisir les minutes : ");
		int minutes = sc.nextInt();
		minutes = minutes + 1;
		
		if(minutes == 60) {
			minutes = 0;
			heures = heures + 1;
		}
		if(heures == 24) {
			heures = 0;
		}
		System.out.println("Dans une minute il sera " + heures + " heure(s) " + minutes + " minute(s)");
		
		sc.close();

	}

}
