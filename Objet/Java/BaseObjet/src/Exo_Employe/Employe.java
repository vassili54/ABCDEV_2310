package Exo_Employe;

import java.util.Calendar;

public class Employe {
	private String matricule;
    private String nom;
    private String prenom;
    private int anneeNaissance;
    private int anneeEmbauche;
    private double salaire;
    private Calendar cal = Calendar.getInstance();
    private int anneeCourante = cal.get(Calendar.YEAR);

    public Employe(String _matricule, String _nom, String _prenom, int _anneeNaissance, int _anneeEmbauche, double _salaire) 
    {
        this.matricule = _matricule;
        this.nom = _nom;
        this.prenom = _prenom;
        this.anneeNaissance = _anneeNaissance;
        this.anneeEmbauche = _anneeEmbauche;
        this.salaire = _salaire;
    }

    public int age() 
    {
        return anneeCourante - this.anneeNaissance;
    }

    public int anciennete() 
    {
        return anneeCourante - this.anneeEmbauche;
    }

    public void augmentationDuSalaire() 
    {
        if (this.anciennete() < 5) 
        {
            this.salaire = this.salaire + this.salaire * 2 / 100; // Augmentation de 2%
        } 
        else if (this.anciennete() < 10) 
        {
        	this.salaire = this.salaire + this.salaire * 5 / 100;; // Augmentation de 5%
        } 
        else 
        {
        	this.salaire = this.salaire + this.salaire * 10 / 100;; // Augmentation de 10%
        }
    }

    public void afficherEmploye() 
    {
        System.out.println("Matricule: " + this.matricule);
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Age: " + this.age());
        System.out.println("Anciennete: " + this.anciennete());
        System.out.println("Salaire: " + this.salaire);
    }

	
}
