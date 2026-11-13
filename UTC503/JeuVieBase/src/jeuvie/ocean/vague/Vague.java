package jeuvie.ocean.vague;

import jeuvie.ocean.vague.casemer.CasePeuProfonde;

public class Vague extends LigneEau{

	public Vague(int taille) {
		super(taille);
		this.remplirDeCasesVides();
	}

	
	protected void remplirDeCasesVides() {
		for (int i = 0; i < this.nbColonnes; i++) {
			this.add(new CasePeuProfonde());
		}
	}
	
	@Override
	public Vague clone() {
		Vague cloned = new Vague(this.nbColonnes);
		
		// copy Case
		for (int i = 0; i < this.nbColonnes; i++) {
			cloned.lesCases.set(i, this.lesCases.get(i).clone());
		}
		
		return cloned;
	}
	
}
