package jeuvie.ocean.vague;

import java.util.ArrayList;

import jeuvie.ocean.vague.casemer.CaseEauProfonde;

public class LigneEauProfonde extends LigneEau {
	
	public LigneEauProfonde(int taille) {
		super(taille);
		this.remplirDeCasesVides();
	}

	
	protected void remplirDeCasesVides() {
		for (int i = 0; i < this.nbColonnes; i++) {
			this.add(new CaseEauProfonde());
		}
	}
	
	@Override
	public LigneEauProfonde clone() {
		LigneEauProfonde cloned = new LigneEauProfonde(this.nbColonnes);
		
		// copy Case
		for (int i = 0; i < this.nbColonnes; i++) {
			cloned.lesCases.set(i, this.lesCases.get(i).clone());
		}
		
		return cloned;
	}
}

