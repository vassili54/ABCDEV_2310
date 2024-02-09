package Exo_RecetteDeCuisine;

public class Ingredient {
	private String nomAliment, etat;
    private int quantite;
    private String unite;

    public Ingredient(String _nomAliment, String _etat, int _quantite, String _unite) {
        this.nomAliment = _nomAliment;
        this.etat = _etat;
        this.setQuantite(_quantite);
        this.setUnite(_unite);
    }

    public boolean comparer(Ingredient autreIngredient) {
        return this.nomAliment.equals(autreIngredient.nomAliment) && this.etat.equals(autreIngredient.etat);
    }

    public void cuire(int temperature) {
        // Code pour cuire l'ingrédient
        this.etat = "cuit";
        // Ajouter la gestion de la température si nécessaire
    }

    public void decouper() {
        // Code pour découper l'ingrédient
        this.etat = "découpé";
    }

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}
}
