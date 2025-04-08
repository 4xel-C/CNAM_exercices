package recursion;

public class Personne implements Comparable<Personne> {
	String nom;
	int salaire;
	
	public Personne(String nom, int salaire) {
		this.nom = nom;
		this.salaire = salaire;
	}

	@Override
	public int compareTo(Personne that) {
		if (this.salaire < that.salaire) return -1;
		if (this.salaire > that.salaire) return -1;
		return 0;
	}
	
	/**
	 * Permet de personnaliser l'impression de l'objet.
	 */
	@Override
	public String toString() {
		return this.nom;
	}

}
