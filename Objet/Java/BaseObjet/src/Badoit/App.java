package Badoit;


public class App {

	public static void main(String[] args) {
		  Bouteille badoit = new Bouteille("Badoit", 1.5, 0.5, false);

	        System.out.println("La bouteille " + badoit.getNom() + " est ouverte : " + badoit.isEstOuverture());
	        badoit.ouvrir();
	        System.out.println("La bouteille " + badoit.getNom() + " est ouverte : " + badoit.isEstOuverture());
	        badoit.remplir(0.3);
	        System.out.println("Contenance de la bouteille " + badoit.getNom() + " : " + badoit.getContenanceEnL() + " L");
	    }

	   
	}


