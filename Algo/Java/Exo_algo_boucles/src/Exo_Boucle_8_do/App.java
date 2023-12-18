package Exo_Boucle_8_do;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int prix, sommeDue = 0, montantVerser, reste, nb10E = 0, nb5E = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Saisir le prix de l'article (saisir 0 pour terminer) : ");
            prix = sc.nextInt();

            if (prix != 0) {
                sommeDue += prix;
            }
        } while (prix != 0);

        System.out.println("Vous devez : " + sommeDue + " Euros");
        System.out.println("Montant verser : ");
        montantVerser = sc.nextInt();
        reste = montantVerser - sommeDue;

        while (reste >= 10) {
            nb10E += 1;
            reste -= 10;
        }

        if (reste >= 5) {
            nb5E = 1;
            reste -= 5;
        }

        System.out.println("Rendu de la monnaie");
        System.out.println("Billet de 10 Euros : " + nb10E);
        System.out.println("Billet de 5 Euros : " + nb5E);
        System.out.println("Piece de 1 Euros : " + reste);

        sc.close();

	}

}
