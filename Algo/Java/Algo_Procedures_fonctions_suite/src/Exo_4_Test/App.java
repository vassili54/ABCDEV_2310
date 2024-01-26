package Exo_4_Test;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static int nbAleatoire(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) +min;
	}

	public static void main(String[] args) {
        int nombreMystere, nbJoueur = 0, nbOrdi = 0, max, min, essai;
        final int nbEssaiMax = 6;

        essai = 0;
        min = 0;
        max = 100;
        nombreMystere = nbAleatoire(min, max);

        Scanner sc = new Scanner(System.in);
        
        while (nombreMystere != nbJoueur && nombreMystere != nbOrdi && essai < nbEssaiMax) {
            

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
                    max = nbJoueur + 1;
                }
            }

            if (nbOrdi == nombreMystere) {
                System.out.println("L'ordinateur a gagné en " + essai + " essais.");
            } else {
                if (nbOrdi > nombreMystere) {
                    System.out.println("Le nombre choisi par l'ordinateur est trop grand");
                    if (max > nbOrdi) {
                        max = nbOrdi;
                    }
                } else {
                    System.out.println("Le nombre choisi par l'ordinateur est trop petit");
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

	}

}
