package Ex_Ville;

public class App {

	public static void main(String[] args) {
		
		Ville ville1 = new Ville();
		Ville ville2 = new Ville("Metz","France," 117000);
		
		System.out.println(ville2.decrisToi());
		
		ville2.setNomVille("Moscou");
		ville2.setNomPays("Russie");
		ville2.setNbhabitants(13100000);
		
		System.out.println(ville2.decrisToi());

	}

}
