package jeuvie.bestiole;

import jeuvie.Couleur;

public class Bigorneau extends Bestiole {

	private static final Couleur MORT = Couleur.GRIS_CLAIR;
	private static final Couleur VIVANT = Couleur.NOIR;
	
	public Bigorneau() {
		super();
	}
	
	public Bigorneau(Bigorneau that) {
		super(that);
	}
	
	public Couleur getCouleurVivant() {
		return VIVANT;
	}
	
	public Couleur getCouleurMort() {
		return MORT;
	}
	
	public String toString() {
		return "Bigorneau n° " + this.getNumero() + " Vivant: " + this.isVivante();
	}
	
	@Override
	public Bigorneau clone() {
		return new Bigorneau(this);
	}
	
	
	
}
