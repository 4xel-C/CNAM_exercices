package structures;

class FileArray<T> implements File<T>{
	
	private T[] file;		 // Tableau de la file
	private int maxi;		 // Nombre maximum d'éléments dans la file
	private int iTete = 0;   // Index du début de file (sortie des éléments)
	private int iQueue = 0;  // Index de la fin de la file (entré de nouveaux éléments)
	private int longueur= 0; // Taille de la file (nombre d'éléments)
	
	public FileArray(T[] array) {
		file = array;
		maxi = array.length;
	}

	public boolean estVide() {
		return longueur == 0;
	}
	
	public void enfiler(T e) {
		if (longueur == maxi) {
			System.out.println("Erreur! La file est pleine!");
			return;
		} else {
			file[iQueue] = e;
			iQueue = (iQueue + 1) % maxi;
			longueur++;
		}
	}
	
	public void defiler() {
		if (estVide()) {
			System.out.println("La queue est vide: aucun élément à défiler!");
			return;
		}
		file[iTete] = null; // déréférencement pour optimiser la mémoire
		iTete = (iTete + 1) % maxi;
		longueur--;
	}
	
	public T getPremier() {
		return file[iTete];
	}
	
	public void printFile() {
		System.out.print("Tableau de la File: ");
		for (int i = 0; i < maxi; i++) {
			System.out.print(file[i] + " ");
		}
		System.out.println();
		System.out.println("Index Tête: " + iTete);
		System.out.println("Index Queue: " + iQueue);
		System.out.println();
	}

}
