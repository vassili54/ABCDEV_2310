package Exo_geometry;

public class TestCercle {

	public static void main(String[] args) {
		// Création d'un point
		Point point = new Point(2.0, 3.0);
		// Création d'un cercle avec un rayon de 5 et un centre au point créé ci-dessus
		Cercle cercle = new Cercle(point, 5.0);
		// Affichage des résultats
		cercle.afficher();
		// Test d'appartenance d'un point au cercle
		Point pointTest = new Point(3.0, 4.0);
		cercle.testAppartenance(pointTest);
		

	}

}
