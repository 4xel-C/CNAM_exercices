package jeuvie.ocean;
import java.util.ArrayList;

import jeuvie.ocean.Ocean;
import jeuvie.ocean.vague.ILigneEau;
import jeuvie.ocean.vague.Vague;

public class BordDeCote extends Ocean {
	
	private static final int NB_LIGNES = 95;
	private static final int NB_COLONNES = 70 ; 
	
	public BordDeCote(ArrayList<ILigneEau> grid) {
		super(grid);
	}
	
	public BordDeCote(int forme) {
		super(forme);
	}

	
	protected void remplirDeLignesEau() {
		for (int i = 0; i < NB_LIGNES; i++) {
			this.grille.add(new Vague(NB_COLONNES));
		}
	}

	public int getNbLignes() {		
		return NB_LIGNES;
	}
	
	public int getNbColonnes() {
		return NB_COLONNES;
	}
	
	@Override
	public BordDeCote clone() {
		ArrayList<ILigneEau> cloned_grid = new ArrayList<>(this.getNbLignes());
		
		// Clone the grid
		for (int i = 0; i < this.getNbLignes(); i++) {
			cloned_grid.add(this.get(i).clone());
		}
		
		BordDeCote cloned = new BordDeCote(cloned_grid);
		
		return cloned;
	}

}
