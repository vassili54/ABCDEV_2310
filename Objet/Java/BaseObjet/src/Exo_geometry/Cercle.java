package Exo_geometry;

public class Cercle {
	private Point centre;
	private double rayon;
	// Constructeur
	public Cercle(Point centre, double rayon)
	{
		this.centre = centre;
		this.rayon = rayon;
	}
	 // Méthode pour calculer le périmètre du cercle
	public double perimetre()
	{
		return 2 * Math.PI * rayon;
	}
	// Méthode pour calculer la surface du cercle
	public double surface()
	{
		return Math.PI * Math.pow(rayon, 2);
	}
	 // Méthode pour tester si un point appartient au cercle
	public void testAppartenance(Point point)
	{
		double distance = Math.sqrt(Math.pow(point.getAbscisse() - centre.getAbscisse(), 2) + Math.pow(point.getOrdonnee() - centre.getOrdonnee(), 2 ));
		
		if(distance <= rayon) 
		{
			System.out.println("Le point appartient au cercle.");
		}
		else
		{
			System.out.println("Le point n'appartient pas au cercle.");
		}
	}
	// Méthode pour afficher les résultats
	public void afficher()
	{
		System.out.println("Périmètre du cercle : " + perimetre());
		System.out.println("Surface du cercle : " + surface());
	}

}
