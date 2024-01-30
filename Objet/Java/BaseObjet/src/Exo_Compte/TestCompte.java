package Exo_Compte;

public class TestCompte {

	public static void main(String[] args) {

		Compte compte = new Compte(1000.0);
		
		compte.afficher();
		
		compte.deposer(500.0);
		
		compte.afficher();
		
		compte.retirer(200.0);
		
		compte.afficher();

	}

}
