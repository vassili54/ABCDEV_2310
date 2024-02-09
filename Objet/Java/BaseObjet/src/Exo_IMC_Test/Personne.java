package Exo_IMC_Test;

public class Personne {
	  private double taille;
	  private double poids;
	  //private int age;

	  public Personne(double taille, double poids, int age) {
	    this.taille = taille;
	    this.poids = poids;
	    //this.setAge(age);
	  }

	  public double imc() {
	    return poids / (taille * taille);
	  }

	  public String interpretation() {
	    double imc = imc();
	    String[][] categories = {
	      { "< 16", "Maigreur extrême - Risque de maladie: Elevé" },
	      { "16 - 18.4", "Insuffisance pondérale - Risque de maladie: Moyen" },
	      { "18.5 - 24.9", "Corpulence normale - Risque de maladie: Faible" },
	      { "25 - 29.9", "Surpoids - Risque de maladie: Moyen" },
	      { "30 - 34.9", "Obésité - Risque de maladie: Elevé" },
	      { "35 - 39.9", "Obésité Sévère - Risque de maladie: Très élevé" },
	      { ">= 40", "Obésité morbide - Risque de maladie: Extrêmement élevé" }
	    };

	    for (String[] categorie : categories) {
	      if (imc >= Double.parseDouble(categorie[0])) {
	        return categorie[1];
	      }
	    }

	    return null; // Ne devrait jamais arriver
	  //}

	//public int getAge() {
		//return age;
	//}

	//public void setAge(int age) {
		//this.age = age;
	}
	}