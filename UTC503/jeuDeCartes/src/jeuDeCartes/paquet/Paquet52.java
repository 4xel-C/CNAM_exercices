package jeuDeCartes.paquet;
import java.util.ArrayList;
import jeuDeCartes.carte.Carte52;
import jeuDeCartes.Couleur;
import jeuDeCartes.Valeur;

public class Paquet52 {
	
	private ArrayList<Carte52> cartes;
	private static Paquet52 instance = null; // instance statique pour la création et le stockage du singleton.
	
	// Singleton pattern, constructeur privé
	private Paquet52() {
		
		// Creation de la liste de 32 cartes
		this.cartes = new ArrayList<>(52);
		
	
		for (Couleur c : Couleur.values()) {
			
	
			for (Valeur v:  Valeur.values()) {
				// Creer la carte
				Carte52 carte = new Carte52(c, v, "phenix");
				
				// Ajouter la carte au paquet
				this.cartes.add(carte);
			}

		}
	}
	
	// Accesseur de l'instance
	public static Paquet52 getInstance() {
		// Creation si première instance
		if (instance == null) {
			instance = new Paquet52();
		}
		
		return instance;
	}
	
	
	public String toString() {
		
		String text = "";
		
		for (Carte52 carte : this.cartes) {
			text = text + carte + "\n";
		}
		
		return text;
		
	}
	

}
