package structures;

public class DequeArray<T> implements Deque<T> {
	
	T[] array;
	private int longueur = 0;
	private int max;
	private int iTete = 0;
	private int iQueue = 0;
	
	public DequeArray(T[] tab) {
		array = tab;
		max = array.length;
	}

	public boolean estVide() {
		return longueur == 0;
	}



	public void ajoutTete(T e) {
		if (longueur == max) {
			System.out.println("Erreur! La Deque est pleine!");
			return;
		} else if (longueur == 0){
			array[iTete] = e;
			longueur++;
		} else {
			iTete = (iTete - 1 + 10) % max; // rajout de +10 pour rester positif
			array[iTete] = e;
			longueur++;
		}
	}


	public void ajoutQueue(T e) {
		if (longueur == max) {
			System.out.println("Erreur! La Deque est pleine!");
			return;
		} else if (longueur == 0){
			array[iQueue] = e;
			longueur++;
		} else {
			iQueue = (iQueue + 1) % max;
			array[iQueue] = e;
			longueur++;
		}
		
	}


	public void enleverTete() {
		if (longueur == 0) {
			System.out.println("Erreur! La Deque est déjà vide!");
		} else {
			array[iTete] = null;
			iTete = (iTete + 1) % max;
			longueur--;
		}
	}


	public void enleverQueue() {
		if (longueur == 0) {
			System.out.println("Erreur! La Deque est déjà vide!");
		} else {
			array[iQueue] = null;
			iQueue = (iQueue - 1 + 10) % max;
			longueur--;
		}
	}


	public T getTete() {
		return array[iTete];
	}


	public T getQueue() {
		return array[iQueue];
	}

	public int getLongueur() {
		return longueur;
	}
	
	public void print() {
		System.out.print("Tableau de la Deque: ");
		for (int i = 0; i < max; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Index Tête: " + iTete);
		System.out.println("Index Queue: " + iQueue);
		System.out.println();
	}
}
