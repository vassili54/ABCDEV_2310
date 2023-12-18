package Exercice_1;

public class App {
/*
Variables
	 tab1[7] est un tableau d'entier
	i est un entier
Debut du programme
	Debut pour
		pour i allant de 0 à 6
		tab1[i] <-- 0
		i suivant
	Fin pour
Fin du programme
 */
	public static void main(String[] args) {
		// Déclaration et création d'un tableau de 7 valeurs numériques
        int[] tableau = new int[7];

        
        // Remplissage du tableau avec des zéros
        for(int i = 0; i <= tableau.length-1; i++) 
        {
            tableau[i] = 0;
        }
	}

}
