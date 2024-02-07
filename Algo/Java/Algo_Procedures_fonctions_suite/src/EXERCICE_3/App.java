package EXERCICE_3;

public class App {
/*
EXERCICE 3
Ecrire une fonction qui permet de savoir si un entier est divisible par un autre
BOOLEEN FONCTION estDivisible ( entier a, entier b)
SI (a mod b = 0)
retourner vrai;
SINON
retourner faux;
FIN
 */
	
	public static void main(String[] args) {
		int a = 10;
        int b = 5;
        
        if (estDivisible(a, b)) 
        {
            System.out.println(a + " est divisible par " + b);
        } 
        else 
        {
            System.out.println(a + " n'est pas divisible par " + b);
        }
    }

    public static boolean estDivisible(int a, int b) 
    {
        if (a % b == 0) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
	}

}
