package jeuDeCartes.paquet;
import java.util.ArrayList;
import jeuDeCartes.carte.Carte32;
import jeuDeCartes.Couleur;
import jeuDeCartes.Valeur;

public class Paquet32 {
	
	private ArrayList<Carte32> cartes;
	private static Paquet32 instance = null; // instance statique pour la création et le stockage du singleton.
	
	// Singleton pattern, constructeur privé
	private Paquet32() {
		
		// Creation de la liste de 32 cartes
		this.cartes = new ArrayList<>(32);
		
	
		for (Couleur c : Couleur.values()) {
			
			// Commencer à la valeur 7 
			for (int i = 5; i < Valeur.values().length; i++) {
				// Creer la carte
				Carte32 carte = new Carte32(c, Valeur.values()[i], "phenix");
				
				// Ajouter la carte au paquet
				this.cartes.add(carte);
			}

		}
	}
	
	// Accesseur de l'instance
	public static Paquet32 getInstance() {
		// Creation si première instance
		if (instance == null) {
			instance = new Paquet32();
		}
		
		return instance;
	}
	
	
	public String toString() {
		
		String text = "";
		
		for (Carte32 carte : this.cartes) {
			text = text + carte + "\n";
		}
		
		return text;
		
	}
	

}
