package banque;

public class Compte {

	// attribut de classe
	private static int nombreDeComptesAyantEteOuverts = 0;

	// attributs d'instance
	private float solde;
	private int numero;

	/**
	 * Methode getter: public pour accessibilité hors package, static pour être
	 * appelée sans instance.
	 *
	 * @return Le nombre de compte total qui ont été ouverts
	 */
	public static int getNombreDeComptesAyantEteOuverts() {
		return nombreDeComptesAyantEteOuverts;
	}

	/**
	 * Methode constructeur (le numero de compte est automatiquement attribué par ce
	 * dernier, basé sur le nombre de comptes total ouverts.
	 */
	public Compte() {
		nombreDeComptesAyantEteOuverts++;
		this.solde = 0;
		this.numero = nombreDeComptesAyantEteOuverts;
	}

	public float getSolde() {
		return solde;
	}

	public int getNumero() {
		return numero;
	}

	/**
	 * Crédite le compte d'une certaine somme d'argent
	 *
	 * @param somme La quantité d'argent à créditer
	 * @return Le solde du compte
	 */
	public float crediter(float somme) {
		solde = solde + somme;
		return solde;
	}

	/**
	 * Retire une certaine somme d'argent du compte
	 *
	 * @param somme la quantité d'argent à retirer
	 * @return Le solde du compte
	 */
	public float retirer(float somme) {
		solde = solde - somme;
		return solde;
	}
}
