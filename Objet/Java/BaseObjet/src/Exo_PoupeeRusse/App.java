package Exo_PoupeeRusse;

public class App {

	public static void main(String[] args) {
		        PoupeeRusse p1 = new PoupeeRusse(1);
		        PoupeeRusse p2 = new PoupeeRusse(2);
		        PoupeeRusse p3 = new PoupeeRusse(3);

		        p1.fermer();
		        p2.ouvrir();
		        p3.fermer();

		        p1.placerDans(p2);
		        p2.placerDans(p3);

		        System.out.println("p1 est dans p2: " + (p1.getContenue() == p2));
		        System.out.println("p2 est dans p3: " + (p2.getContenue() == p3));

		        p1.sortirDe(p2);
		        p2.sortirDe(p3);

		        System.out.println("p1 est dans p2: " + (p1.getContenue() == p2));
		        System.out.println("p2 est dans p3: " + (p2.getContenue() == p3));
		    }
	

	}


