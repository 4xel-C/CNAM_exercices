package jeuDeCartes.carte;

import jeuDeCartes.Couleur;
import jeuDeCartes.Valeur;

public interface ICarte {
	
	public Couleur getCouleur();
	public Valeur getFigure();
	public String getMotif();
	public boolean isVisible();
	public String getTypeJeu();
	
}
