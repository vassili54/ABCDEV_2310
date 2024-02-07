package Exo_Date;

public class Date {
    // Attributs
    private int jour;
    private int mois;
    private int annee;
    private boolean estValide;
    private static final String[] moisNoms = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin",
            "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};

    // Constructeur
    public Date(int _jour, int _mois, int _annee) {
        this.jour = _jour;
        this.mois = _mois;
        this.annee = _annee;
        this.estValide = valideDate();
    }

    // Méthodes
    private boolean valideDate() {
        if (jour < 1 || jour > 31) {
            return false;
        }
        if (mois < 1 || mois > 12) {
            return false;
        }
        if (annee < 1) {
            return false;
        }
        if (mois == 2) {
            if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
                return jour <= 29;
            } else {
                return jour <= 28;
            }
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            return jour <= 30;
        } else {
            return true;
        }
    }

    public static String afficher(Date _date) {
        return String.format("%02d %s %d", _date.jour, moisNoms[_date.mois - 1], _date.annee);
    }

    public boolean comparer(Date _date) {
        if (this.annee < _date.annee) {
            return true;
        } else if (this.annee > _date.annee) {
            return false;
        } else {
            if (this.mois < _date.mois) {
                return true;
            } else if (this.mois > _date.mois) {
                return false;
            } else {
                return this.jour < _date.jour;
            }
        }
    }

    // Accesseurs
    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
        estValide = valideDate();
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
        estValide = valideDate();
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
        estValide = valideDate();
    }

    public boolean isEstValide() {
        return estValide;
    }
}
