package Exo_Boucle_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	/*
	 * VARIABLES

       nombreUser est un ENTIER


     DEBUT PROGRAMME

        Ecrire "Saisir un nombre : "
        Lire nombreUser

Debut Tant Que
		Tant Que nombreUser < 10 OU nombreUser > 20
        Faire
        Si nombreUser > 20 Alors
        Ecrire "Plus petit !"
        Lire nombreUser

       Sinon Si nombreUser < 10 Alors
       Ecrire "Plus grand !"
       Lire nombreUser
       Fin si

Fin programme

	 */


		
		// Variable 
		
		int nombreUser;
		
		Scanner sc = new Scanner(System.in);
		
		// Debut programme
		
		
		System.out.println("Saisir un nombre : ");
		nombreUser = sc.nextInt();
		
		
		while (nombreUser < 10 || nombreUser > 20) {
		
		if (nombreUser > 20) {
			System.out.println("Plus petit !");
			nombreUser = sc.nextInt();
		}
		else if (nombreUser < 10) {
			System.out.println("Plus Grand !");
			nombreUser = sc.nextInt();
		}
		}
		
		
		//Fin programme 
		sc.close();
		
		
	}


}
