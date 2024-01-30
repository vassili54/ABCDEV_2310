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
		return longueur * largeur;
	}
	// Méthode pour calculer le périmètre
	public Double perimetre()
	{
		return 2 * (longueur + largeur);
	}
	// Méthode pour afficher les résultats
	public void afficher() 
	{
		System.out.println("Longueur : " + longueur);
		System.out.println("Largeur : " + largeur);
		System.out.println("Surface : " + surface());
		System.out.println("Périmètre : " + perimetre());
	}
}
