package Exo_PoupeeRusse;

public class PoupeeRusse {
    private int taille;
    private boolean ouverte;
    private PoupeeRusse contenue;

    public PoupeeRusse(int taille) {
        this.taille = taille;
        this.ouverte = false;
        this.setContenue(null);
    }

    public boolean ouvrir() {
        if (!ouverte && getContenue() == null) {
            ouverte = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean fermer() {
        if (ouverte && getContenue() == null) {
            ouverte = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean placerDans(PoupeeRusse p) {
        if (fermer() && getContenue() == null && p.ouverte && p.getContenue() == null && p.taille > taille) {
            p.setContenue(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean sortirDe(PoupeeRusse p) {
        if (p.getContenue() == this && p.ouverte) {
            p.setContenue(null);
            return true;
        } else {
            return false;
        }
    }

	public PoupeeRusse getContenue() {
		return contenue;
	}

	public void setContenue(PoupeeRusse contenue) {
		this.contenue = contenue;
	}
}