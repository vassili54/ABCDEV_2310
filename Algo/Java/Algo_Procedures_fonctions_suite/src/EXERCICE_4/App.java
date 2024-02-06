package EXERCICE_4;

import java.util.Scanner;

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
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int nombreMystere, nbJoueur = 0, nbOrdi = 0, max, min, essai;
        final int nbEssaiMax = 6;

        essai = 0;
        min = 0;
        max = 100;
        nombreMystere = nbAleatoire(min, max);

        while ((nombreMystere != nbJoueur) && (nombreMystere != nbOrdi) && (essai < nbEssaiMax)) {
            System.out.println("Saisir un nombre entre " + min + " et " + max);
            nbJoueur = sc.nextInt();
            nbOrdi = nbAleatoire(min, max);
            essai++;

            if (nbJoueur == nombreMystere) {
                System.out.println("Le joueur humain a gagné en " + essai + " essais.");
            } else {
                if (nbJoueur < nombreMystere) {
                    System.out.println("C'est plus");
                    min = nbJoueur;
                } else {
                    System.out.println("C'est moins");
                    max = nbJoueur - 1;
                }
            }

            if (nbOrdi == nombreMystere) {
                System.out.println("L'ordinateur a gagné en " + essai + " essais.");
            } else {
                if (nbOrdi > nombreMystere) {
                    System.out.println("Le nombre choisi par l'ordinateur est trop grand.");
                    if (max > nbOrdi) {
                        max = nbOrdi;
                    }
                } else {
                    System.out.println("Le nombre choisi par l'ordinateur est trop petit.");
                    if (min < nbOrdi) {
                        min = nbOrdi;
                    }
                }
            }
        }

        if (essai == nbEssaiMax) {
            if (nombreMystere != nbJoueur) {
                System.out.println("Le joueur humain a perdu.");
            }
            if (nombreMystere != nbOrdi) {
                System.out.println("L'ordinateur a perdu.");
            }
        }

        sc.close();
	}

}
