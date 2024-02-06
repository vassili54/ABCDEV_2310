package EXERCICE_1;

public class App {
/*
EXERCICE 1
Écrivez la fonction pourcentage(), qui permet de calculer les pourcentages d’utilisation de la Carte Bleue, du chéquier et des
virements automatiques, sachant que la formule de calcul du pourcentage pour la Carte Bleue est :
Nombre de paiements par Carte Bleue / Nombre total de paiements * 100
Résultat attendu :
Nombre de paiement par Carte Bleue : 5
Nombre de chèques émis : 10
Nombre de virements automatiques : 5
Vous avez émis 20 ordres de débit dont :
25.0 % par Carte Bleue
50.0 % par cheque
25.0 % par virement
 */
	public static void main(String[] args) {
        // Exemple d'utilisation avec les valeurs fournies
        int nbPaiementsCarteBleue = 7;
        int nbCheques = 10;
        int nbVirementsAuto = 3;

        double[] resultats = calculerPourcentage(nbPaiementsCarteBleue, nbCheques, nbVirementsAuto);

        // Affichage des résultats attendus avec System.out.printf
        int totalPaiements = nbPaiementsCarteBleue + nbCheques + nbVirementsAuto;
        System.out.printf("Vous avez émis %d ordres de débit dont :\n", totalPaiements);
        System.out.printf("%.1f %% par Carte Bleue\n", resultats[0]);
        System.out.printf("%.1f %% par chèque\n", resultats[1]);
        System.out.printf("%.1f %% par virement\n", resultats[2]);
    }

    public static double[] calculerPourcentage(int nbPaiementsCarteBleue, int nbCheques, int nbVirementsAuto) {
        int totalPaiements = nbPaiementsCarteBleue + nbCheques + nbVirementsAuto;

        double pourcentageCarteBleue = (double) nbPaiementsCarteBleue / totalPaiements * 100;
        double pourcentageCheques = (double) nbCheques / totalPaiements * 100;
        double pourcentageVirementsAuto = (double) nbVirementsAuto / totalPaiements * 100;

        return new double[]{pourcentageCarteBleue, pourcentageCheques, pourcentageVirementsAuto};
    }
}
