package Exercice_3;

import java.util.Scanner;

public class App {
/*
VARIABLES
    age est un entier
    poussin est un entier
    pupille est un entier
    minime est un entier
    cadet est un entier
Debut Programme
    Ecrire "Veuillez saisir votre age :"
    Lire age
    Debut Si (age>=6 ET age<=7) Alors
        Ecrire "Catégorie Poussin"
            Sinon   
            Si (age>=6 ET age<=9) Alors
        Ecrire "Catégorie Pupille"
            Sinon
            Si (age>=10 ET age<=11) Alors
        Ecrire "Catégorie Minime"
            Sinon
            Si (age>= 12) Alors
        Ecrire "Catégorie Cadet"
            Sinon
        Ecrire "L'age entre n'est pas dans une categorie valide"        
    Fin Si
Fin Programme 
 */
	public static void main(String[] args) {
		//VARIABLES
		int age, poussin, pupille, minime, cadet;
		
		//Initialisation des catégories d'age
		
		poussin = 6;
		pupille = 9;
		minime = 11;
		cadet = 12;
		
		//Debut de programme
		System.out.println("Veuillez saisir votre age :");
		
		Scanner sc = new Scanner(System.in);
		
		age = sc.nextInt();
		
		//categorisation
		if(age >= 6 && age <= poussin) 
		{
			System.out.println("Catégorie Poussin");
		}else if(age > poussin && age <= pupille) {
			System.out.println("Catégorie Pupille");
		}else if(age > pupille && age <= minime) {
			System.out.println("Catégorie Minime");
		}else if(age >= cadet) {
			System.out.println("Catégorie Cadet");
		}else {
			System.out.println("L'âge saisi ne correspond à aucune catégorie valide");
		}
		
		sc.close();

	}

}
