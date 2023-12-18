package Exo_2;

public class App {
/*
Enoncé 2: 
Ecrire et utiliser une procédure calculant le périmètre 
et l'aire d'un triangle en connaissant les 3 côtés
Périmètre = p = a + b + c et aire = ((p/2-a)(p/2-b)(p/2-c))1/2


PROCEDURE CalculTriangle (VAL entier a, VAL entier b, VAL entier c)

Déclaration des variables
p est un entier
aire est un entier

p<--a+b+c
aire<--((p/2-a)*(p/2-b)*(p/2-c))*1/2
Ecrire "Le Périmètre est : ",p 
Ecrire "L'aire est : ",aire

FIN PROCEDURE
 */
	//Dans la procédure les valeurs des variables n'on rien en commun avec les variables hors procédure. 
	public static void CalculTriangle(int a, int b, int c) 
	{
		//Variables
		int p;
		int aire;
		//calcule le Périmètre et l'aire.
		p = a + b + c;
		aire = ((p/2-a)*(p/2-b)*(p/2-c))*1/2;
		//Ecrire le calcule le Périmètre et l'aire.
		System.out.println("Le Périmètre est : "+p);
		System.out.println("L'aire est : "+aire);
		
	}
	public static void main(String[] args) {
		//Variables
		int a=5, b=7, c=9;
		////Ecrire un message.
		System.out.println("Valeurs des côtés du triangle : \n"+ a + "\n"+ b + "\n" + c);
		//Lancer la procédure.
		CalculTriangle(a, b, c); 
	}

}
