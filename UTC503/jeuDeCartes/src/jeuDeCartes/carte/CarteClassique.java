package jeuDeCartes.carte;

import jeuDeCartes.Couleur;
import jeuDeCartes.Valeur;

public abstract class CarteClassique implements ICarte {
	
	private Couleur couleur;
	private Valeur figure;
	private String motif;
	private boolean visible;
	private String typeJeu;
	
	// Constructor
	public CarteClassique(Couleur couleur, Valeur figure, String motif, String typeJeu) {
		this.couleur = couleur;
		this.figure = figure;
		this.motif = motif;
		this.visible = true;
		this.typeJeu = typeJeu;
	}
	
	@Override
	public Couleur getCouleur() {
		return this.couleur;
	}


	@Override
	public Valeur getFigure() {
		return this.figure;
	}


	@Override
	public String getMotif() {
		return this.motif;
	}


	@Override
	public boolean isVisible() {
		return this.visible;
	}
	
	public String getTypeJeu() {
		return this.typeJeu;
	}
	
	@Override
	public String toString() {
		return "Carte " + this.motif + " : " + this.figure + " " + this.couleur;
	}

}
