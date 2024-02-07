package EXERCICE_2;

import java.util.Scanner;
/*
EXERCICE 2
Ecrivez une fonction qui retourne le plus grand nombre entier présent dans un tableau
Exemple :
int[] tab = {1, 2, 9, 4};
Sortie prévue : 9
 */
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une série de nombres séparés par des espaces :");
        String input = sc.nextLine();
        String[] numbersString = input.split(" ");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) 
        {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        int maxNumber = getMaxNumber(numbers);
        System.out.println("Le plus grand nombre entier présent dans le tableau est : " + maxNumber);
        
        sc.close();
    }
	
    public static int getMaxNumber(int[] numbers) 
    {
        if (numbers.length == 0) 
        {
            throw new IllegalArgumentException("Le tableau est vide.");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > max) 
            {
                max = numbers[i];
            }
        }
        return max;
        
     
	}

}