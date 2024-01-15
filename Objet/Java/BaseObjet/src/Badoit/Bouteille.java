package Badoit;


public class Bouteille {
	private String nom;
    private final double capaciteEnL;
    private double contenanceEnL;
    private boolean estOuverture;

    public Bouteille() {
        this.nom = "";
        this.capaciteEnL = 0.0;
        this.contenanceEnL = 0.0;
        this.estOuverture = false;
    }

    public Bouteille(String nom, double capaciteEnL, double contenanceEnL, boolean estOuverte) {
        this.nom = nom;
        this.capaciteEnL = capaciteEnL;
        this.contenanceEnL = contenanceEnL;
        this.estOuverture = estOuverte;
    }

    public boolean ouvrir() {
        if (estOuverture) {
            return false;
        }
        estOuverture = true;
        return true;
    }

    public boolean fermer() {
        if (!estOuverture) {
            return false;
        }
        estOuverture = false;
        return true;
    }

    public boolean remplirTout() {
        if (estOuverture) {
            return false;
        }
        contenanceEnL = capaciteEnL;
        return true;
    }

    public boolean remplir(double quantiteEnL) {
        if (!estOuverture || contenanceEnL + quantiteEnL > capaciteEnL) {
            return false;
        }
        contenanceEnL += quantiteEnL;
        return true;
    }

    public boolean viderTout() {
        if (!estOuverture) {
            return false;
        }
        contenanceEnL = 0.0;
        return true;
    }

    public boolean vider(double quantiteEnL) {
        if (!estOuverture || contenanceEnL - quantiteEnL < 0) {
            return false;
        }
        contenanceEnL -= quantiteEnL;
        return true;
    }
    
    public String getNom() {
        return nom;
    }

    public double getCapaciteEnL() {
        return capaciteEnL;
    }

    public double getContenanceEnL() {
        return contenanceEnL;
    }

    public boolean isEstOuverture() {
        return estOuverture;
    }

}
