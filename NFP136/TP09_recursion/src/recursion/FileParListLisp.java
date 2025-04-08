package recursion;

public class FileParListLisp<T extends Comparable<T>> {

	private ListLisp<T> file;

	public FileParListLisp() {
		this.file = new ListeVide<>();
	}

	public boolean estVide() {
		return file instanceof ListeVide;
	}

	public void enfile(T e) {

		// Si file vide, ajouter au début
		if (this.estVide()) {
			file = file.cons(e);

			// si file pleine, ajouter à la fin.
		} else {
			file = ajouterFin(file, e);
		}
	}

	public ListLisp<T> ajouterFin(ListLisp<T> liste, T e) {

		// Si on atteind la listeVide (cas de base) Creer une liste pleine avec
		// l'élément et une listeVide
		if (liste.longueur() == 0)
			return new ListePlein<>(e, new ListeVide<>());

		// Si l'on a pas encore la listeVide, creer une nouvelle liste à patir de head de
		// chaque tail jusqu'à atteindre la fin.
		return new ListePlein<>(liste.head(), ajouterFin(liste.tail(), e));
	}

	// retirer l'élément du début
	public T defiler() {
		if (estVide()) throw new IllegalArgumentException("La file est vide!");
		T e = file.head();
		file = file.tail();
		return e;
	}
	
	public T head() {
		return file.head();
	}

}
