package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.Dauphin;
import jeuvie.ocean.IOcean;

public class CaseEauProfonde extends Case {
	
	
	public CaseEauProfonde() {
		super();
	}
	
	public CaseEauProfonde(Dauphin occupant, boolean vide) {
		this.occupant = occupant;
		this.vide = vide;
	}
	
	public Couleur getCouleurCaseVide() {
		return Couleur.BLEU_SOMBRE;
	}


	protected void setBestioleVivante() {
		this.occupant = new Dauphin();
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
		
		if (!this.contientBestioleVivante() && nbVoisins == 3) {
			this.setVivante();
		} else if (this.contientBestioleVivante() && (nbVoisins < 2 || nbVoisins > 3)) {
			this.tuerEventuelOccupant();
		}
		
	}
	
	@Override
	public CaseEauProfonde clone() {
		Dauphin o = (this.occupant == null) ? null : ((Dauphin) this.occupant).clone();
		CaseEauProfonde cloned = new CaseEauProfonde(o, this.vide);
		return cloned;
	}
	
}
