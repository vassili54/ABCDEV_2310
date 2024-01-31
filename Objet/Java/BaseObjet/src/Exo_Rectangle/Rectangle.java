package Exo_Rectangle;

public class Rectangle {
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) 
	{
		this.longueur = longueur;
		this.largeur = largeur;
	}
	// Méthode pour calculer la surface
	public Double surface()
	{
		return (this.longueur * this.largeur);
	}
	// Méthode pour calculer le périmètre
	public Double perimetre()
	{
		return (this.longueur + this.largeur) * 2;
	}
	// Méthode pour afficher les résultats
	public void afficher() 
	{
		System.out.println("Longueur : " + this.longueur);
		System.out.println("Largeur : " + this.largeur);
		System.out.println("Surface : " + this.surface());
		System.out.println("Périmètre : " + this.perimetre());
	}
}
