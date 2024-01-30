package Exo_Montre;

public class Montre {
	private int heure;
	  private int minutes;

	  public Montre() 
	  {
	    this(0, 0);
	  }

	  public Montre(int heure, int minutes) 
	  {
	    this.heure = heure;
	    this.minutes = minutes;
	  }

	  public Montre(Montre autreMontre) 
	  {
	    this.heure = autreMontre.heure;
	    this.minutes = autreMontre.minutes;
	  }

	  public void avancer() 
	  {
	    minutes++;
	    if (minutes == 60) 
	    {
	      minutes = 0;
	      heure++;
	      if (heure == 24) 
	      {
	        heure = 0;
	      }
	    }
	  }

	  public int getHeure() 
	  {
	    return heure;
	  }

	  public int getMinutes() 
	  {
	    return minutes;
	  }

}
