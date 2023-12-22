package Exercice_8;

import java.util.Scanner;

public class App {
/*
EXERCICE 8
Ecrivez un algorithme permettant, toujours sur le même principe, 
à l’utilisateur de saisir un nombre déterminé de valeurs. 
Le programme, 
une fois la saisie terminée, 
renvoie la plus grande valeur en précisant
quelle position elle occupe dans le tableau. 
On prendra soin d’effectuer la saisie dans un premier temps, 
et la recherche de la plus grande valeur du tableau dans un second temps.

Variables
    nb est un entier
    position est un entier
    i est un entier
    tab[] est un tableau d'entier
Debut du programme
    Ecrire " Saisir un nombre : "
	Lire nb
	tab[] <-- tab[nb]
Debut pour
        Pour i allant de 0 à nb -1
            Ecrire "Saisir le nombre n° ",i+1
            Lire tab[i]
		i Suivant
Fin pour
		position <-- 0
Debut pour
		pour i allant de 0 à nb-1
		Debut Si
                Si tab[i] > tab[position]
				Alors position <-- i
		Fin Si
		i suivant
Fin pour
		Ecrire "Le nombre le plus grand : ",tab[position]
		Ecrire "Le nombre occupe la position : ",position
Fin du programme		
 */
	public static void main(String[] args) {
//VARIABLES
		int nb, position;
		int tab[];
	
		Scanner sc = new Scanner(System.in);
//Debut du programme
		System.out.println(" Saisir un nombre : ");
		nb = sc.nextInt();
		tab = new int [nb];
		
		for(int i = 0;i <= tab.length-1; i++) 
		{
			System.out.println("Saisir le nombre n° " + i+1);
			tab[i] = sc.nextInt();
		}
		position = 0;
		
		for(int i = 0;i <= tab.length-1; i++) 
		{
			if(tab[i] > tab[position])
			{
				position = i;
			}
		}
		System.out.println("Le nombre le plus grand : " +tab[position]);
		System.out.println("Le nombre occupe la position : " +position);
		
		sc.close();	

	}

}
