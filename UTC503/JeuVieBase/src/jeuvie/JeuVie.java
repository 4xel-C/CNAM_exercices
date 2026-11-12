package jeuvie;
import jeuvie.bestiole.Dauphin;

import controleur.Controleur;
import jeuvie.ocean.HauteMer;
import jeuvie.ocean.Ocean;
import java.util.ArrayList;
import jeuvie.ocean.vague.casemer.Case;
import jeuvie.ocean.vague.casemer.CaseEauProfonde;

public class JeuVie {

	public static void main(String[] args) {
		
		// Création de 10 dauphins
//		ArrayList<Dauphin> dauphins = new ArrayList<>();
//		ArrayList<Case> cases = new ArrayList<>();
//		
//		for (int i = 0; i < 10; i++) {
//			dauphins.add(new Dauphin());
//		}
//		
//		for (Dauphin dauphin : dauphins ) {
//			if (dauphin.getNumero() % 2 == 0) {
//				dauphin.tuer();
//			}
//			System.out.println(dauphin);
//		}
//		
//		// ajouter les cases
//		for (int i = 0; i <20; i++ ) {
//			
//			if (i % 2 == 0) {
//				cases.add(new CaseEauProfonde(dauphins.get(i / 2), false));
//			} else {
//				cases.add(new CaseEauProfonde());	
//			}
//		}
//		
//		for (Case case_ : cases) {
//			System.out.println(case_);
//		}
//		
		
		//new Controleur(new BordDeCote(Ocean.PI));
		//new Controleur(new BordDeCote(Ocean.ALEA));

//		new Controleur(new HauteMer(Ocean.ALEA));
		//new Controleur(new HauteMer(Ocean.BARRE));
		new Controleur(new HauteMer(Ocean.CANON));
		// new Controleur(new HauteMer(Ocean.CLOWN), Controleur.ITER_CLOWN);
		//new Controleur(new HauteMer(Ocean.PI), Controleur.ITER_PI);
		//new Controleur(new HauteMer(Ocean.GRAND_VAISSEAU));
		//new Controleur(new HauteMer(Ocean.PETIT_VAISSEAU));

	}

}
