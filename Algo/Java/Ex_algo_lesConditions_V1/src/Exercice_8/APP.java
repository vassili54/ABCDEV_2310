package Exercice_8;

import java.util.Scanner;

public class APP {
/*
EXERCICE 8
Une compagnie d'assurance automobile propose à ses clients quatre familles de tarifs identifiables par une
couleur, du moins au plus onéreux : tarifs bleu, vert, orange et rouge. Le tarif dépend de la situation du
conducteur :
• un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer
le tarif rouge, si toutefois il n'a jamais été responsable d'accident. Sinon, la compagnie refuse de
l'assurer.
• un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25
ans mais titulaire du permis depuis moins de deux ans a le droit au tarif orange s'il n'a jamais
provoqué d'accident, au tarif rouge pour un accident, sinon il est refusé.
• un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert
s'il n'est à l'origine d'aucun accident et du tarif orange pour un accident, du tarif rouge pour deux
accidents, et refusé au-delà
• De plus, pour encourager la fidélité des clients acceptés, la compagnie propose un contrat de la
couleur immédiatement la plus avantageuse s'il est entré dans la maison depuis plus de cinq ans.
Ainsi, s'il satisfait à cette exigence, un client normalement "vert" devient "bleu", un client
normalement "orange" devient "vert", et le "rouge" devient orange.
Ecrire l'algorithme permettant de saisir les données nécessaires (sans contrôle de saisie) et de traiter ce
problème. Avant de se lancer à corps perdu dans cet exercice, on pourra réfléchir un peu et s'apercevoir
qu'il est plus simple qu'il n'en a l'air (cela s'appelle faire une analyse !)

Variables
	age, annePermis, nbAccident, anneAssurance sont des entiers
	condition1, condition2, condition3 sont des booleens
	situation est une chaine de caracteres
Debut du programme
	Ecrire "Saisir l'age : "
	Lire age
	Ecrire "Saisir le nombre d'annees de permis"
	Lire annePermis
	Ecrire "Saisir le nombre d'accidents : "
	Lire nbAccident
	Ecrire "Saisir le nombre d'annees d'assurance : "
	Lire anneeAssurance
	condition1 <-- age >= 25
	condition2 <-- annePermis >= 2
	condition3 <-- anneAssurance > 5
Debut Si
	Si condition1 = faux ET condition2 = faux
	Alors
		Debut Si
			Si nbAccident = 0
			Alors situation <-- "Rouge"
			Sinon situation <-- "Refuser"
		Fin Si
	Sinon Si (condition1 = faux ET condition2 = vrai) OU (condition1 = vrai ET condition2 = faux)
	Alors
		Debut Si
			Si nbAccident = 0
			Alors situation <-- "Orange"
			Sinon Si nbAccident = 1 
			Alors situation <-- "Rouge"
			Sinon situation <-- "Refuser"
		Fin Si
	Sinon
		Debut Si
			Si nbAccident = 0
			Alors situation <-- "Vert"
			Sinon Si nbAccident = 1
			Alors situation <-- "Orange"
			Sinon Si nbAccident = 2
			Alors situation <-- "Rouge"
			Sinon situation <-- "Refuser"
		Fin Si
Fin Si
Debut Si
	Si condition3 = vrai
	Alors 
		Debut Si
			Si situation = "Rouge"
			Alors situation <-- "Orange"
			Sinon Si situation = "Orange"
			Alors situation <-- "Vert"
			Sinon Si situation = "Vert"
			Alors situation <-- "bleu"
		Fin Si
Fin Si
Ecrire "Votre situation : ",situation
Fin du programme
 */
	public static void main(String[] args) {
		// VARIABLES
		String situation;
		int age, annePermis, nbAccident, anneAssurance;
		boolean condition1; 
		boolean condition2; 
		boolean condition3;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut programme
		System.out.println("Saisir l'age : ");
		age = sc.nextInt();
		System.out.println("Saisir le nombre d'annees de permis");
		annePermis = sc.nextInt();
		System.out.println("Saisir le nombre d'accidents : ");
		nbAccident = sc.nextInt();
		System.out.println("Saisir le nombre d'annees d'assurance : ");
		anneAssurance = sc.nextInt();
		
		condition1 = age >= 25;
		condition2 = annePermis >= 2;
		condition3 = anneAssurance > 5;
		//debut si
		if(!condition1 && !condition2) {
			//debut si
			if (nbAccident == 0) {
				situation = "Rouge";
			} else {
				situation = "Refuser";
			}
			//Fin si
		}
		else if ((!condition1 && condition2) || (condition1 && !condition2)) {
			//debut si
			if(nbAccident == 0) {
				situation = "Orange";
			}
			else if(nbAccident == 1) {
				situation = "Rouge";
			}
			else {
				situation = "Refuser";
			}
			//Fin si
		}
		else {
			//Debut si
			if(nbAccident == 0) {
				situation = "Vert";
				}
			else if(nbAccident == 1) {
				situation = "Orange";
			}
			else if(nbAccident == 2) {
				situation = "Rouge";
			}
			else {
				situation = "Refuser";
			}
			//Fin si		
		}
		    //Fin si
		
		    //Debut si
		    if(condition3) {
			   if(situation == "Rouge") {
				situation = "Orange";
				}
			   else if(situation == "Orange") {
				situation = "Vert";
			    }
			   else if(situation == "Vert") {
				situation = "bleu";
			    }
			//Fin si
				
		}
		//Fin si
		System.out.println("Votre situation : "+situation);
		
		sc.close();
	}

}
