package Exo_IMC;

public class Personne {
	private double taille;
    private double poids;
    private int age;

    public Personne(double taille, double poids, int age) {
        this.taille = taille;
        this.poids = poids;
        this.setAge(age);
    }

    public double imc() {
        return poids / (taille * taille);
    }

    public String interpretation() {
        double imc = imc();
        if (imc < 16) {
            return "Maigreur extrême - Risque de maladie: Elevé";
        } else if (imc >= 16 && imc <= 18.4) {
            return "Insuffisance pondérale - Risque de maladie: Moyen";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Corpulence normale - Risque de maladie: Faible";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Surpoids - Risque de maladie: Moyen";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obésité - Risque de maladie: Elevé";
        } else if (imc >= 35 && imc <= 40) {
            return "Obésité Sévère - Risque de maladie: Très élevé";
        } else {
            return "Obésité morbide - Risque de maladie: Extrêmement élevé";
        }
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
