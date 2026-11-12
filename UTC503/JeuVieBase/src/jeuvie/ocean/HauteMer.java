package jeuvie.ocean;

import java.util.ArrayList;
import java.util.List;

import jeuvie.ocean.vague.ILigneEau;
import jeuvie.ocean.vague.LigneEauProfonde;


public class HauteMer extends Ocean {


	private static final int NB_LIGNES = 55;
	private static final int NB_COLONNES = 60;
	
	public HauteMer(ArrayList<ILigneEau> grid) {
		super(grid);
	}
	
	public HauteMer(int forme) {
		super(forme);
	}

	
	protected void remplirDeLignesEau() {
		for (int i = 0; i < NB_LIGNES; i++) {
			this.grille.add(new LigneEauProfonde(NB_COLONNES));
		}
	}

	public int getNbLignes() {		
		return NB_LIGNES;
	}
	
	public int getNbColonnes() {
		return NB_COLONNES;
	}
	
	@Override
	public HauteMer clone() {
		ArrayList<ILigneEau> cloned_grid = new ArrayList<>(this.getNbLignes());
		
		// Clone the grid
		for (int i = 0; i < this.getNbLignes(); i++) {
			cloned_grid.add(this.get(i).clone());
		}
		
		HauteMer cloned = new HauteMer(cloned_grid);
		
		return cloned;
	}



}
