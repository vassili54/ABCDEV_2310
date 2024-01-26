package EXERCICE_4;

import java.util.Random;

public class App {
	/*
	FONCTION entier nbAleatoire(entier min, entier max)
		entier nombre
		nombre <-- est generer aleatoirement
		retourner nombre
	Fin Fonction
	VARIABLES
		nombreMystere est un entier
		nbJoueur est un entier
		nbOrdi est un entier
		max est un entier
		min est un entier
		essai est un entier
	CONSTANTE
		nbEssaiMax = 6

	DEBUT DU PROGRAMME
		essai <-- 0
		min <-- 0
		max <-- 100
		nombreMystere <-- nbAleatoire(min,max)
		Debut boucle
		tant que nombreMystere est different de nbJoueur 
					ET nombreMystere est different de nbOrdi 
					ET essai est infèrieur à nbEssaiMax
		Faire
			Ecrire "Saisir un nombre entre ", min," et ",max
			Lire nbJoueur
			nbOrdi <-- nbAleatoire(min,max)
			essai++
			Debut si
				si nbJoueur egale nombreMystere
					Ecrire "Le joueur humain à gagner en ",essai
				sinon
					Debut si
						si nbJoueur < nombreMystere
							Ecrire "C'est plus"
							min <-- nbJoueur
						Sinon
							Ecrire "C'est moins"
							max <-- nbJoueur+1
					Fin SI
			Fin Si
			Debut Si
				si nbOrdi egale nombreMystere
					Ecrire "L'ordi à gagner en ",essai
				sinon
					Debut Si
						si nbOrdi > nombreMystere
							Ecrire "Le nombre choisit par l'ordi est trop grand"
							Debut si 
								Si max > nbOrdi
								max <-- nbOrdi 
							Fin Si
						Sinon
							Ecrire "Le nombre choisit par l'ordi est trop petit"
							Debut Si
								Si min < nbOrdi
								min <-- nbOrdi 
							Fin Si
						Fin Si
			Fin Si
		Fin tant que
		Debut Si  
			Si essai egale nbEssaiMax
				Debut Si
					Si nombreMystere different de nbJoueur
					Ecrire "Le joueur humain a perdu"
				Fin Si
				Debut Si
					Si nombreMystere different de nbOrdi
					Ecrire "L'ordi a perdu
				Fin si
		Fin Si
	Fin du programme

	 */
	public static int nbAleatoire(int min, int max) {
		int nombre;
		Random rand = new Random();
		nombre = rand.nextInt(max - min +1) + min;
		return nombre;
	}
	
	public static void main(String[] args) {
		int nombreMystere;
		int nbJoueur;
		int nbOrdi;
		int max;
		int min;
		int essai;
		
		final int nbEssaiMax = 6;

	}

}
