package Exo_Boucle_3_Bis;

import java.util.Scanner;

public class App {

	/*
	Ecrire un algorithme qui demande un nombre de départ, 
	et qui ensuite affiche les dix nombres suivants.
	Par exemple, si l'utilisateur entre le nombre 17, 
	le programme affichera les nombres de 18 à 27.
	Ecrire cet algorithme dans un premier temps avec 
	une boucle tant que, puis avec une boucle pour. 
	*/
	
	public static void main(String[] args) {
//Boucle Pour//
//VARIABLES//
     int nombreDepart;
     int i;
     
     Scanner sc = new Scanner(System.in);
     
//Debut Programme//     

	System.out.println("Entrer un nombre de depart : ");	
    nombreDepart = sc.nextInt();
    
    for (i = 1; i <= 10; i++) {
    	System.out.println(nombreDepart + i);
    }
    
    sc.close();
    
	}

}
