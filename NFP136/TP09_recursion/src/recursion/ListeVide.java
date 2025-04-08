package recursion;

public class ListeVide<T extends Comparable<T>> implements ListLisp<T> {
	
	private T element;
	private ListLisp<T> suivant;
	
	// Constructeur de liste non vide
	public  ListeVide() {
		element = null;
		suivant = null;
	}

	public ListePlein<T> cons(T e) {
		return new ListePlein<T>(e, this);
	}
	
	public T head() { return element;}
	
	public ListLisp<T> tail() { return suivant; }
	
	public int longueur() {
		return 0;
	}
	
	public boolean member(T x) {
		if (x.compareTo(element) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
