package Exo_Robot;

public class Robot {
    private String marque;
    private String modèle;
    private int niveauBatterie;

    // Constructeur
    public Robot(String marque, String modèle) 
    {
        this.marque = marque;
        this.modèle = modèle;
        this.niveauBatterie = 100; // Niveau de batterie initial
    }
    // Méthode pour déplacer le robot
    public void deplacer() 
    {
        System.out.println("Le robot se déplace.");
    }

    // Méthode pour nettoyer
    public void nettoyer() 
    {
        utiliserBatterie(10); // Utilise 10 unités de batterie pour nettoyer
        System.out.println("Le robot nettoie la zone.");
    }

    // Méthode pour retourner à la base de chargement
    public void retourBase() 
    {
        System.out.println("Le robot retourne à sa base de chargement.");
        niveauBatterie = 100; // Recharge la batterie à la base
    }
    // Méthode pour effectuer une action
    public void effectuerAction(Action action) 
    {
        switch (action) 
        {
            case DEPLACER:
                deplacer();
                break;
            case NETTOYER:
                nettoyer();
                break;
            case RETOUR_BASE:
                retourBase();
                break;
            default:
                System.out.println("Action non reconnue.");
        }
    }
    // Méthode pour obtenir le niveau de batterie actuel
    public int getNiveauBatterie() 
    {
        return niveauBatterie;
    }

    // Méthode pour obtenir la marque du robot
    public String getMarque() 
    {
        return marque;
    }

    // Méthode pour obtenir le modèle du robot
    public String getModele() 
    {
        return modèle;
    }

    // Méthode privée pour utiliser la batterie
    private void utiliserBatterie(int quantite) 
    {
        if (niveauBatterie >= quantite) 
        {
            niveauBatterie -= quantite;
        } 
        else 
        {
            System.out.println("Niveau de batterie insuffisant.");
        }
    }
}
