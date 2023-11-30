package ExempleExpressionBoolean;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Déclarer et initialiser les variables
	    int a = 2;
	    int b = 5;
	    int c = 7;
	    
	    // Expressions booléennes
	    boolean test1 = (a < b);
	    boolean test2 = (a < b) && (a > c);
	    boolean test3 = (a < b) || (a > c);
	 
	    // Afficher les résultats
	    System.out.println(test1);
	    System.out.println(test2);
	    System.out.println(test3);
	}

}
