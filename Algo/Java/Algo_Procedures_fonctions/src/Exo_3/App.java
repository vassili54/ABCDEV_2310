package Exo_3;

import java.util.Scanner;

public class App {
/*
Enoncé 3:
Ecrire et utiliser une fonction calculant la moyenne de 2 nombres


PROCEDURE MoyenneNombres (VAL entier nombre1, VAL entier nombre2)

Déclaration d'une variable
moyenne est un réel

moyenne <-- (nombre1 + nombre2) /2d
Ecrire "La moyenne est : ",moyenne

FIN PROCEDURE
Variables
nombre1 est un entier
nombre1 est un entier
moyenne est réel
Debut programme
Ecrire "Saisir le 1er nombre"
lire nombre1
Ecrire "Saisir le 2ème nombre"
lire nombre1
MoyenneNombres (nombre1, nombre2)
Fin programme
 */
	public static void MoyenneNombres(int nombre1, int nombre2) 
	{
		//Déclaration variable
		double moyenne;
		
		moyenne = (nombre1 + nombre2) /2d;
		System.out.println("La moyenne est : "+moyenne);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    
        System.out.println("Saisir le 1er nombre");
        int nombre1 = sc.nextInt();
        System.out.println("Saisir le 2eme nombre");
        int nombre2 = sc.nextInt();
    
        sc.close();
    
        MoyenneNombres(nombre1, nombre2);
	}

}
