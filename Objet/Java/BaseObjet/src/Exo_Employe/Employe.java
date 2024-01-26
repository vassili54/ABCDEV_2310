package Exo_Employe;

import java.util.Calendar;

public class Employe {
	private String matricule;
    private String nom;
    private String prenom;
    private int anneeNaissance;
    private int anneeEmbauche;
    private double salaire;

    public Employe(String _matricule, String _nom, String _prenom, int _anneeNaissance, int _anneeEmbauche, double _salaire) 
    {
        matricule = _matricule;
        nom = _nom;
        prenom = _prenom;
        anneeNaissance = _anneeNaissance;
        anneeEmbauche = _anneeEmbauche;
        salaire = _salaire;
    }

    public int age() 
    {
        Calendar cal = Calendar.getInstance();
        int anneeCourante = cal.get(Calendar.YEAR);
        return anneeCourante - anneeNaissance;
    }

    public int anciennete() 
    {
        Calendar cal = Calendar.getInstance();
        int anneeCourante = cal.get(Calendar.YEAR);
        return anneeCourante - anneeEmbauche;
    }

    public void augmentationDuSalaire() 
    {
        int anciennete = anciennete();
        if (anciennete < 5) 
        {
            salaire *= 1.02; // Augmentation de 2%
        } 
        else if (anciennete < 10) 
        {
            salaire *= 1.05; // Augmentation de 5%
        } 
        else 
        {
            salaire *= 1.1; // Augmentation de 10%
        }
    }

    public void afficherEmploye() 
    {
        System.out.println("Matricule: " + matricule);
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age());
        System.out.println("Anciennete: " + anciennete());
        System.out.println("Salaire: " + salaire);
    }

	
}
