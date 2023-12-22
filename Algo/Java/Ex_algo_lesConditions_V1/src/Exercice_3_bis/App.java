package Exercice_3_bis;

import java.util.Scanner;

public class App {
/*
EXO 3

Variables
	age est un entier
Debut du programme
	Ecrire "Saisir l'age de l'enfant : "
	Lire age
Debut Si
	Si age >= 12
	Alors Ecrire "Categorie Cadet"
	Sinon Si age >= 10
	Alors Ecrire "Categorie Minime"
	Sinon Si age >= 8
	Alors Ecrire "Categorie Pupille"
	Sinon Si age >= 6
	Alors Ecrire "Categorie Poussin"
	Sinon Ecrire "L'âge saisi ne correspond à aucune catégorie valide"
Fin Si
Fin du programme
 */
	public static void main(String[] args) {
		//VARIABLES
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut du programme
		System.out.println("Saisir l'age de l'enfant : ");
		age = sc.nextInt();
		if(age >= 12) {
			System.out.println("Catégorie Cadet");
		}else if(age >= 10) {
			System.out.println("Catégorie Minime");
		}else if(age >= 8) {
			System.out.println("Catégorie Pupille");
		}else if(age >= 6) {
			System.out.println("Catégorie Poussin");
		}else {
			System.out.println("L'âge saisi ne correspond à aucune catégorie valide");
		}
		sc.close();
	}
	
}
