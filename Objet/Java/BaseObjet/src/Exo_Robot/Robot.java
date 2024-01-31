package Exo_Robot;

public class Robot {
    private String marque;
    private String modèle;
    private int niveauBatterie;

    // Constructeur
    public Robot(String marque, String modèle) {
        this.marque = marque;
        this.modèle = modèle;
        this.niveauBatterie = 100; // Niveau de batterie initial
    }

    // Méthode pour déplacer le robot
    public void déplacer() {
        System.out.println("Le robot se déplace.");
    }

    // Méthode pour nettoyer
    public void nettoyer() {
        if (niveauBatterie > 10) {
            System.out.println("Le robot nettoie la zone.");
            niveauBatterie -= 10;
        } else {
            System.out.println("Niveau de batterie trop faible pour nettoyer.");
        }
    }

    // Méthode pour retourner à la base de chargement
    public void retourBase() {
        System.out.println("Le robot retourne à sa base de chargement.");
        niveauBatterie = 100; // Recharge la batterie à la base
    }

    // Méthode pour obtenir le niveau de batterie actuel
    public int getNiveauBatterie() {
        return niveauBatterie;
    }

    // Méthode pour obtenir la marque du robot
    public String getMarque() {
        return marque;
    }

    // Méthode pour obtenir le modèle du robot
    public String getModèle() {
        return modèle;
    }

}
