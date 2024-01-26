package Exo_Montre;

public class Personne {
	  private String nom;
	  private Montre montre;

	  public Personne() {
	    this("");
	  }

	  public Personne(String nom) {
	    this.nom = nom;
	    montre = null;
	  }

	  public void porterMontre(Montre montre) {
	    if (this.montre != null) {
	      throw new RuntimeException("La personne porte déjà une montre.");
	    }
	    this.montre = montre;
	  }

	  public void enleverMontre() {
	    if (this.montre == null) {
	      throw new RuntimeException("La personne ne porte pas de montre.");
	    }
	    this.montre = null;
	  }

	  public String demanderHeure(Personne autrePersonne) {
	    if (autrePersonne.montre == null) {
	      return "";
	    }
	    return autrePersonne.montre.getHeure() + ":" + autrePersonne.montre.getMinutes();
	  }

}
