package Exo_Date;

public class App {

	public static void main(String[] args) {
		Date date1 = new Date(31, 12, 2023); // Date valide
		Date date2 = new Date(29, 2, 1977); // Date invalide

		System.out.println(date1.isEstValide()); // false
		System.out.println(date2.isEstValide()); // true

	}

}
