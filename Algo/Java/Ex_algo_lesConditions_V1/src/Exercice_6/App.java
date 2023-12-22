package Exercice_6;

import java.util.Scanner;

public class App {
/*
EXERCICE 6
Les habitants de Zorglub paient l’impôt selon les règles suivantes :
•
les hommes de plus de 20 ans paient l’impôt
•
les femmes paient l’impôt si elles ont entre 18 et 35 ans
•
les autres ne paient pas d’impôt
Le programme demandera donc l’âge et le sexe du Zorglubien, 
et se prononcera donc ensuite sur le fait que l’habitant est imposable.

EXERCICE 6

Variables
	genre est une chaine de caracteres
	age est un entier
	condition1 est un booleen
	condition2 est un booleen
Debut du programme
	Ecrire "Saisir le genre (M/F) : "
	Lire genre
	Ecrire "Saisir l'age : "
	Lire age
	condition1 <-- genre = "M" ET age > 20
	condition2 <-- genre = "F" ET (age > 18 ET age < 35)
Debut Si
	Si condition1 = vrai OU condition2 = vrai
	Alors Ecrire "Imposable"
	Sinon Ecrire "Non Imposable"
Fin Si
Fin du programme

 
 */
	public static void main(String[] args) {
		//VARIABLES
		String genre;
		int age;
		boolean condition1, condition2;
		
		Scanner sc = new Scanner(System.in);
		//Debut de Programme
		System.out.println("Saisir le genre (M/F) : ");
		genre = sc.next();
		System.out.println("Saisir l'age : ");
		age = sc.nextInt();
		
		condition1 = genre == ("M") && age > 20;
		condition2 = genre.equals ("F") && (age > 18 && age < 35);
		
		if(condition1 || condition2) 
		{
			System.out.println("Imposable");
		}
		else 
		{
			System.out.println("Non Imposable");
		}
		sc.close();
		

	}

}
