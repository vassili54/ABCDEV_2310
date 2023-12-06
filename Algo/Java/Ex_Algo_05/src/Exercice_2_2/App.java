package Exercice_2_2;

import java.util.Scanner;

public class App {
	/*
	VARIABLE
	    a est un entier
	    b est un entier
	    InferieurEgale est une chaine de caractère
	DEBUT DE PROGRAMME    
	    InferieurEgale <--" <="
	    Ecrire "Saisir le nombre a"
	    Lire a
	    Ecrire "Saisir le nombre b"
	    Lire b
	 Debut Si
	 SI a <= b 
	 ALORS
	    Ecrire a, InferieurEgale, b
	Sinon 
	    Ecrire b, InferieurEgale, a
	 Fin Si
	Fin PROGRAMME
	 */
	public static void main(String[] args) {
    //VARIABLES//
		int a;
		int b;
		String InferieurEgale = "<=";

		Scanner sc = new Scanner(System.in);
		
	//Debut Programme//	
		System.out.println("Saisir le nombre a");
		a = sc.nextInt();
		
		System.out.println("Saisir le nombre b");
		b = sc.nextInt();
		
		if (a<=b) {
			System.out.println(a + InferieurEgale + b);
		}
		else {
			System.out.println(b + InferieurEgale + a);
		}

        sc.close();
	}

}
