package banque;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	private static int nombreDePersonnesAyantExiste = 0;

	private String nom;
	private String prenom;
	private List<Compte> comptes;

	public static int getNombreDePersonnesAyantExiste() {
		return nombreDePersonnesAyantExiste;
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.comptes = new ArrayList<>(); // Initialization de la liste
		nombreDePersonnesAyantExiste++;
	}

	/**
	 * Ouvre un nouveau compte et rajoute le compte à la liste de la personne
	 *
	 * @return Une instance de compte
	 */
	public Compte ouvrirCompte() {
		Compte compte = new Compte();
		comptes.add(compte);
		return compte;
	}

	/**
	 * Ferme un compte de l'utilisateur: le supprime de sa liste de compte et
	 * déréférence l'objet pour ne plus pouvoir appeler les méthodes de compte.
	 *
	 * @param compte Une instance de Compte que possède la Personne dan la liste.
	 */
	public void fermerCompte(Compte compte) {
		if (compte instanceof Compte && comptes.contains(compte)) {
			comptes.remove(compte);
			compte = null;
			System.out.println("Le compte a été fermé!");
		} else {
			System.out.println("Echec de la fermeture du compte");
		}
	}

	public List<Compte> getComptes() {
		return comptes;
	}
}
