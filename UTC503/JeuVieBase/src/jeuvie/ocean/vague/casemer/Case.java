package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.IBestiole;

public abstract class Case implements ICase {

	public abstract Couleur getCouleurCaseVide();
	public abstract Case clone();
	protected abstract void setBestioleVivante();
	protected boolean vide = true;
	protected IBestiole occupant = null;



	public void setVivante(){
		setBestioleVivante();
	}	

	public Couleur getCouleur(){
		if (this.vide) {
			return getCouleurCaseVide();
		} else {
			return occupant.getCouleur();
		}
	}


	public boolean contientBestioleVivante(){
		if (this.vide == true || !this.occupant.isVivante()) {
			return false;
		} else {
			return true;
		}
	}

	public void tuerEventuelOccupant(){
		if (!vide) {
			this.occupant.tuer();
		}
	}
	
	public boolean isVide() {
		return this.vide;
	}

	public String toString() {
		if (this.isVide()) {
			return "Case vide!";
		} else {
			return "Case contient: " + this.occupant;
		}
	}
	

}
