package Exo_Voiture;

public class Voiture {

	private String marque;
	private Double prix;
	
	 // Constructeur par défaut
	public Voiture() 
	{
		this.marque = "inconnu";
		this.prix = 0.0;
	}
	
	
	 // Constructeur avec paramètres
	public Voiture(String marque, Double prix) 
	{
		this.marque = marque;
		this.prix = prix;
	}
	// Getters et setters
	public String getMarque()
	{
		return marque;
	}
	public void setMarque(String marque) 
	{
		this.marque = marque;
	}
	public Double getPrix() 
	{
		return prix;
	}
	public void setPrix(Double prix) 
	{
		this.prix = prix;
	}
    // Méthode pour afficher les résultats
	public void afficher() 
	{
		System.out.println("Marque : " + marque);
		System.out.println("Prix : " + prix + " €");
	}
}
