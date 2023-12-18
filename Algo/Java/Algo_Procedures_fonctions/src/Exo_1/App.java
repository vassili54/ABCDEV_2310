package Exo_1;

public class App {
/*
Enoncé 1:
Ecrire et utiliser une procédure inversant le contenu de 2 variables a et b passées en arguments

PROCEDURE InverseVariables (VAR entier a,VAR entier b)


Déclarations des variables locales
c est un entier

c <-- a 
a <-- b 
b <-- c 
 Ecrire "Valeurs inversées de a et b : "
 Ecrire "a = ",a
 Ecrire "b = ",b
 

FIN PROCEDURE
 */
	
	public static void InverseVariables(int a,int b)
	{
		// on sauvegarde valeur a dans c
		int c=a;
		// on inverse a et b (a est écrasé)
		a=b;
		// on attribue l'ancienne valeur de a qui a été sauvegardée dans c à b
		b=c;
		System.out.println("Valeurs inversées de a et b : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}


	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		System.out.println("Valeurs de a et b : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		InverseVariables(a,b);
	}

}
