package Exo_IMC;

public class App {

	public static void main(String[] args) {
		Personne personne = new Personne(1.90, 55, 46);
        System.out.println("IMC : " + personne.imc());
        System.out.println(personne.interpretation());

	}

}
