package jeuvie.bestiole;

import jeuvie.Couleur;


public class Dauphin extends Bestiole{
	
	private static final Couleur MORT = Couleur.BLEU_MARINE;
	private static final Couleur VIVANT = Couleur.BLEU_GRIS;
	
	public Dauphin() {
		super();
	}
	
	public Dauphin(Dauphin that) {
		super(that);
	}
	
	public Couleur getCouleurVivant() {
		return VIVANT;
	}
	
	public Couleur getCouleurMort() {
		return MORT;
	}
	
	public String toString() {
		return "Dauphin n° " + this.getNumero() + " Vivant: " + this.isVivante();
	}
	
	@Override
	public Dauphin clone() {
		return new Dauphin(this);
	}
	



}
