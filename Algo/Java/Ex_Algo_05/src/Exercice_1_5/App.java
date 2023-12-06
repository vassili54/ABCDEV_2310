package Exercice_1_5;

import java.util.Scanner;

public class App {
/*
Variable
    a est un entier
    b est un entier
    c est un entier
Debut du programme
    Ecrire "Saisir le nombre a"
    Lire a
    Ecrire "Saisir le nombre b"
    Lire b
    Ecrire "Valeur de a:", a
    Ecrire "Valeur de b:", b
    c <-- a
    a <-- b
    b <-- c
    Ecrire "Valeur de a:", a
    Ecrire "Valeur de b:", b
FIN Programme
 */
	public static void main(String[] args) {
		// Déclaration des variables	
		int a,b,c; //est un entier
		
		
		Scanner  sc = new Scanner(System.in);
		
		// Saisir le nombre
	    System.out.println("Saisir le nombre a");
	    a = sc.nextInt();
		System.out.println("Saisir le nombre b");
		b = sc.nextInt();
		
        System.out.println("Avant inversion");
        System.out.println("Valeur de a: "+a);
		System.out.println("Valeur de b: "+b);
		c = a;
        a = b;
        b = c;
        System.out.println("Après inversion");
		System.out.println("Valeur de a: "+a);
		System.out.println("Valeur de b: "+b);
		
		sc.close();

	}

}
