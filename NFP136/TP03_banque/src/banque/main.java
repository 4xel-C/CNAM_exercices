package banque;

public class main {

	public static void main(String[] args) {

		Personne axel = new Personne("Axel", "Cano");

		Compte compteAxel1 = axel.ouvrirCompte();
		Compte compteAxel2 = axel.ouvrirCompte();

		compteAxel2.crediter(200);
		compteAxel2.crediter(50);
		compteAxel1.crediter(100);

		Personne john = new Personne("John", "Doe");

		Compte compteJohn = john.ouvrirCompte();
		compteJohn.crediter(50);

		// Voir la liste des comptes et le montant
		System.out.println("Comptes Axel: ");
		for (int i = 0; i < axel.getComptes().size(); i++) {
			System.out.println("Compte N°: " + axel.getComptes().get(i).getNumero() + " Solde: "
					+ axel.getComptes().get(i).getSolde());
		}

		System.out.println("Comptes John: ");
		for (int i = 0; i < john.getComptes().size(); i++) {
			System.out.println("Compte N°: " + john.getComptes().get(i).getNumero() + " Solde: "
					+ john.getComptes().get(i).getSolde());
		}

		// fermer un compte d'Axel et retirer de l'argent dans un autre
		axel.fermerCompte(compteAxel1);
		compteAxel2.retirer(25);

		// Voir la liste des comptes et le montant
		System.out.println("Comptes Axel: ");
		for (int i = 0; i < axel.getComptes().size(); i++) {
			System.out.println("Compte N°: " + axel.getComptes().get(i).getNumero() + " Solde: "
					+ axel.getComptes().get(i).getSolde());
		}

		// Voir le total des comptes ouverts
		System.out.println("En totalité, " + Compte.getNombreDeComptesAyantEteOuverts() + " comptes ont été ouverts");
	}

}
