package Exercice_1_2;

import java.util.Scanner;

public class App {
	/*	VARIABLE
    nb un nombre entier
Debut Programme
    Ecrire "Veuillez Saisir un nombre :"
    Lire nb
    
    Debut Si 
           Si (nb > 0)
           Alors 
                  Ecrire "le nombre est positif" 
           Sinon
           Si (nb < 0)
           Alors      
                  Ecrire "Le nombre est negatif"
           Sinon 
                  Ecrire "Le nombre est nul"      
    Fin Si
Fin programme     
	
*/
	public static void main(String[] args) {
//VARIABLE//
		int nb;
		
		Scanner sc = new Scanner(System.in);
		
//debut Programme//
		System.out.println("Veuillez Saisir un Nombre : ");
		nb = sc.nextInt();
		if (nb>0) {
			System.out.println("Le nombre est positif");
		}
		else if (nb<0) {
			System.out.println("Le nombre est negatif");
		}
		else {
			System.out.println("Le nombre est nul");
		}
		
		
		sc.close();
	}

}
