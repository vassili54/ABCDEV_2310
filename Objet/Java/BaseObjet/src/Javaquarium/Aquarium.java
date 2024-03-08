package Javaquarium;

import java.util.ArrayList;

public class Aquarium {
	private ArrayList<Poisson> poissons;
    private ArrayList<Algue> algues;

    /**
     * CONSTRUCTEUR DE LA CLASSE Aquarium
     */
    public Aquarium () {
        this.poissons = new ArrayList<Poisson>();
        this.algues = new ArrayList<Algue>();
    }

    /**
     * Ajoute un poisson à l'aquarium
     * 
     * @param nom
     * @param sexe 
     * @param race 
     * @param alimentation 
     */
    private void ajouterPoisson (String nom, Character sexe, String race, String alimentation) {
        Poisson poisson = new Poisson(nom, sexe, race, alimentation);
        this.poissons.add(poisson);
    }

    /*
    *   POISSONS CARNIVORES
    */
    public void ajouterMerou (String nom, Character sexe) {
        this.ajouterPoisson(nom, sexe, "Mérou", "Carnivore");
    }

    public void ajouterThon (String nom, Character sexe) {
        this.ajouterPoisson(nom, sexe, "Thon", "Carnivore");
    }

    public void ajouterPoissonClown (String nom, Character sexe) {
        this.ajouterPoisson(nom, sexe, "Poisson-clown", "Carnivore");
    }

    /*
    *   POISSONS HERBIVORES
    */
    public void ajouterSole (String nom, Character sexe) {
        this.ajouterPoisson(nom, sexe, "Sole", "Herbivore");
    }

    public void ajouterBare (String nom, Character sexe) {
        this.ajouterPoisson(nom, sexe, "Bare", "Herbivore");
    }

    public void ajouterCarpe (String nom, Character sexe) {
        this.ajouterPoisson(nom, sexe, "Carpe", "Herbivore");
    }

    /**
     * Ajouter une algue
     * 
     * @param algue 
     */
    public void ajouterAlgue (Algue algue) {
        this.algues.add(algue);
    }	
}
