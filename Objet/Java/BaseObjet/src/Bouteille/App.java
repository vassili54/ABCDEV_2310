package Bouteille;

public class App {

	public static void main(String[] args) {
		Bouteille bouteille = new Bouteille("Badoit", 1.5, 0.5, false);

		System.out.println("Nom de la bouteille : " + bouteille.getNom());
		System.out.println("Capacité de la bouteille : " + bouteille.getCapaciteEnL());
		System.out.println("Quantité de liquide contenue dans la bouteille : " + bouteille.getContenanceEnL());
		System.out.println("Ouverture de la bouteille : " + bouteille.isOuverture());

		bouteille.setNom("Evian");
		bouteille.setCapaciteEnL(2.0);
		bouteille.setContenanceEnL(1.0);
		bouteille.ouvrir();

		System.out.println("Nouveau nom de la bouteille : " + bouteille.getNom());
		System.out.println("Nouvelle capacité de la bouteille : " + bouteille.getCapaciteEnL());
		System.out.println("Nouvelle quantité de liquide contenue dans la bouteille : " + bouteille.getContenanceEnL());
		System.out.println("Nouvelle ouverture de la bouteille : " + bouteille.isOuverture());


	}

}
