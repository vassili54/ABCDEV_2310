package Bouteille;

public class Bouteille {
	
	    private String nom;
	    private final double capaciteEnL;
	    private double contenanceEnL;
	    private boolean estOuverture;

	    public Bouteille(String nom, double capaciteEnL, double contenanceEnL, boolean estOuverture) {
	        this.nom = nom;
	        this.capaciteEnL = capaciteEnL;
	        this.contenanceEnL = contenanceEnL;
	        this.estOuverture = estOuverture;
	    }

	    public Bouteille() {
	        this("", 0, 0, false);
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public double getCapaciteEnL() {
	        return capaciteEnL;
	    }

	    public double getContenanceEnL() {
	        return contenanceEnL;
	    }

	    public void setContenanceEnL(double contenanceEnL) {
	        this.contenanceEnL = contenanceEnL;
	    }

	    public boolean isOuverture() {
	        return estOuverture;
	    }

	    public void setOuverture(boolean estOuverture) {
	        this.estOuverture = estOuverture;
	    }

	    public boolean ouvrir() {
	        if (estOuverture) {
	            return false;
	        } else {
	            estOuverture = true;
	            return true;
	        }
	    }

	    public boolean fermer() {
	        if (!estOuverture) {
	            return false;
	        } else {
	            estOuverture = false;
	            return true;
	        }
	    }

	    public boolean remplirTout() {
	        if (estOuverture) {
	            contenanceEnL = capaciteEnL;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean remplir(double quantiteEnL) {
	        if (estOuverture) {
	            if (quantiteEnL + contenanceEnL <= capaciteEnL) {
	                contenanceEnL += quantiteEnL;
	                return true;
	            } else {
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }

	    public boolean viderTout() {
	        if (estOuverture) {
	            contenanceEnL = 0;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean vider(double quantiteEnL) {
	        if (estOuverture) {
	            if (contenanceEnL >= quantiteEnL) {
	                contenanceEnL -= quantiteEnL;
	                return true;
	            } else {
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }

		public void setCapaciteEnL(double d) {
			// TODO Auto-generated method stub
			
		}

}
