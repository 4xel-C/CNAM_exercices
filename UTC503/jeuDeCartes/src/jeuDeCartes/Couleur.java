package jeuDeCartes;

public enum Couleur {
	
	PIQUE("pique"), COEUR("coeur"), CARREAU("carreau"), TREFLE("trefle");
	
	private String texte;
	
	Couleur(String texte) {
		this.texte = texte;
	}
	
	public String toString() {
		return this.texte;
	}

}
