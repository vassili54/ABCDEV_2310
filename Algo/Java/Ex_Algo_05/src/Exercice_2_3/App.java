package Exercice_2_3;

import java.util.Scanner;

public class App {
/*
 VARIABLE
    a est un reel
    b est un reel
    c est un reel
Debut du programme
    Ecrire "Saisir le nombre a"
    Lire a
    Ecrire "Saisir le nombre b"
    Lire b
    Ecrire "Saisir le nombre c"
    Lire c
    Debut Si 
            Si a<=b ET a<=c Alors
                  Debut Si
                          Si b<=c Alors 
                                  Ecrire a <= b <= c
                                  Sinon
                                  Ecrire a <= c <= b
                  Fin Si
            Sinon Si b <= a ET b <= c Alors
                  Debut Si
                          Si a <= c Alors
                                  Ecrire b <= a <= c
                                  Sinon
                                  Ecrire b <= c <= a
                  Fin Si
            Sinon
                  Debut Si
                          Si a<= b Alors
                          Ecrire c <= a <= b
                          Sinon c <= b <= a 
                  Sin Si
           Fin Si 
Fin programme                                               

 */
	public static void main(String[] args) {
		//VARIABLES//
		double a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut de programme//
		System.out.println("Saisir le nombre a");
		a = sc.nextDouble();
		System.out.println("Saisir le nombre b");
		b = sc.nextDouble();
		System.out.println("Saisir le nombre c");
		c = sc.nextDouble();
		
		if(a<=b && a<=c) 
		{
			if(b<=c) 
			{
				System.out.println(a + " "+ b + " "+ c);
			}
			else 
			{
				System.out.println(a + " "+ c + " "+ b);
			}
		}
		else if(b <= a && b <= c) 
		{
			if(a <= c) 
			{
				System.out.println(b + " "+ a + " "+ c);
			}
			else
			{
				System.out.println(b + " "+ c + " "+ a);
			}
			
		}
		else 
		{	
			if(a<= b)
			{
				System.out.println(c + " "+ a + " "+ b);
			}
			else 
			{
				System.out.println(c + " "+ b + " "+ a);
			}
		}
		sc.close();
	}

}
