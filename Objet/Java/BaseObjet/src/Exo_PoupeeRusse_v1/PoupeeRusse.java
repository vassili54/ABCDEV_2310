package Exo_PoupeeRusse_v1;

public class PoupeeRusse {
    private int taille;
    private boolean estOuverte;
    private boolean contientPoupee;
    private boolean estContenuDans;

    // Getters
    public int getTaille() {
        return taille;
    }

    public boolean isEstOuverte() {
        return estOuverte;
    }

    public boolean isContientPoupee() {
        return contientPoupee;
    }

    public boolean isEstContenuDans() {
        return estContenuDans;
    }

    // Setters
    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setEstOuverte(boolean estOuverte) {
        this.estOuverte = estOuverte;
    }

    public void setContientPoupee(boolean contientPoupee) {
        this.contientPoupee = contientPoupee;
    }

    public void setEstContenuDans(boolean estContenuDans) {
        this.estContenuDans = estContenuDans;
    }

    
    // Constructeur
    public PoupeeRusse(int taille, boolean estOuverte, boolean contientPoupee, boolean estContenuDans) {
        this.taille = taille;
        this.estOuverte = estOuverte;
        this.contientPoupee = contientPoupee;
        this.estContenuDans = estContenuDans;
    }

    // Méthode pour ouvrir la poupée
    public boolean ouvrir() {
        if (!estOuverte) {
            estOuverte = true;
            return true;
        }
        return false; // Déjà ouverte
    }

    // Méthode pour fermer la poupée
    public boolean fermer() {
        if (estOuverte && !contientPoupee) {
            estOuverte = false;
            return true;
        }
        return false; // Impossible de fermer
    }

    // Méthode pour placer une poupée dans une autre
    public boolean placerDans(PoupeeRusse p) {
        if (!estOuverte && !p.estContenuDans && !p.contientPoupee) {
            p.contientPoupee = true;
            p.estContenuDans = true;
            return true;
        }
        return false; // Impossible de placer
    }

    // Méthode pour sortir une poupée d'une autre
    public boolean sortirDe(PoupeeRusse p) {
        if (p.estContenuDans && p.contientPoupee) {
            p.contientPoupee = false;
            p.estContenuDans = false;
            return true;
        }
        return false; // Impossible de sortir
    }

    
}