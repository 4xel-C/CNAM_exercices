package jeuDeCartes;

public enum Valeur {
	
	DEUX("deux"), TROIS("trois"), QUATRE("quatre"), CINQ("cinq"), SIX("six"), SEPT("7"), HUIT("8"), NEUF("9"), DIX("10"), VALET("V"), DAME("D"), ROI("R"), AS("A");
	
	private String texte;
	
	Valeur(String texte) {
		this.texte = texte;
	}
	
	public String toString() {
		return this.texte;
	}

}
