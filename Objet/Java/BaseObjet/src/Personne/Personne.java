package Personne;

public class Personne {
	   protected String nom;
	    protected String prenom;
	    protected int anneeNaissance;

	    public Personne(String nom, String prenom, int anneeNaissance) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.anneeNaissance = anneeNaissance;
	    }

	    public String disBonjour() {
	        return "Bonjour !!!\nJe m'appelle : " + prenom + " " + nom;
	    }

	    public int calculeAge(int anneeCourante) {
	        return anneeCourante - anneeNaissance;
	    }
}
