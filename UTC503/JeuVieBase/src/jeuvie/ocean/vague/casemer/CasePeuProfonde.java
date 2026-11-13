package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.Bigorneau;
import jeuvie.ocean.IOcean;

public class CasePeuProfonde extends Case{

	public CasePeuProfonde() {
		super();
	}
	
	public CasePeuProfonde(Bigorneau occupant, boolean vide) {
		this.occupant = occupant;
		this.vide = vide;
	}
	
	public Couleur getCouleurCaseVide() {
		return Couleur.BLEU_SOMBRE;
	}


	protected void setBestioleVivante() {
		this.occupant = new Bigorneau();
		this.vide = false;
	}

	/**
	 * � chaque �tape, l��volution d�une cellule est enti�rement d�termin�e par l��tat de ses huit voisines de la fa�on suivante :

	 * Une cellule morte poss�dant exactement trois voisines vivantes devient vivante (elle na�t).
	 * Une cellule vivante poss�dant deux ou trois voisines vivantes le reste, sinon elle meurt.
	 * @param col la colonne dans la matrice
	 * @param j la ligne dans la matrice
	 * @return si cette case pr�cise doit survivre ou non.
	 */
	public void evoluer(IOcean copie, int col, int lg){
		int nbVoisins = copie.compterVoisinsVivants(col, lg);
		
		if (!this.contientBestioleVivante() && (nbVoisins == 3 || nbVoisins == 8)) {
			this.setVivante();
		} else if (this.contientBestioleVivante() && (nbVoisins < 2 || nbVoisins > 4)) {
			this.tuerEventuelOccupant();
		}
		
	}
	
	@Override
	public CasePeuProfonde clone() {
		Bigorneau b = (this.occupant == null) ? null : ((Bigorneau) this.occupant).clone();
		CasePeuProfonde cloned = new CasePeuProfonde(b, this.vide);
		return cloned;
	}
	
	
	
}
