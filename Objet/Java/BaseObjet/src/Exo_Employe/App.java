package Exo_Employe;

public class App {

	public static void main(String[] args) {
		 
		Employe agent = new Employe("007", "Bond", "James", 1970, 1995, 7500);
	    agent.augmentationDuSalaire();
	    agent.afficherEmploye();
	}

}
