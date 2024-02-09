package Exo_IMC_Test;

import Exo_IMC.Personne;

public class App {
    public static void main(String[] args) {
        Personne personne = new Personne(1.50, 70, 46);
        System.out.println("IMC: " + personne.imc());
        System.out.println(personne.interpretation());
    }
}