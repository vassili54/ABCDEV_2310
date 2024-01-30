package Exo_Compte;

public class Compte {

	private Double solde;
	
	public Compte(Double solde) 
	{
		this.solde = solde;
	}
	 public void deposer(Double montant) 
	 {
		 if (montant > 0) 
		 {
			 solde += montant;
			 System.out.println("Versement de " + montant + " effectué.");
		 }
		 else 
		 {
			 System.out.println("Le montant du versement doit être supérieur à 0.");
		 }
	 }
	public void retirer(double montant) 
	{
		if (montant > 0 && montant <= solde) 
		{
			solde -= montant;
			System.out.println("Retrait de " + montant + " effectué.");
		}
		else 
		{
			System.out.println("Montant invalide ou solde insuffisant pour le retrait.");
		}
	}
	public void afficher() 
	{
		System.out.println("Solde actuel : " + solde);
	}
}
