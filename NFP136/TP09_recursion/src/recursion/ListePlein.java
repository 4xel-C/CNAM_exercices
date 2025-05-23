package recursion;

public class ListePlein<T extends Comparable<T>> implements ListLisp<T> {
	
	private T element;
	private ListLisp<T> suivant;
	
	// Constructeur de liste non vide
	public  ListePlein(T e1, ListLisp<T> s1) {
		element = e1;
		suivant = s1;
	}

	public ListePlein<T> cons(T e) {
		return new ListePlein<T>(e, this);
	}
	
	public T head() { return element;}
	
	public ListLisp<T> tail() { return suivant; }
	
	public int longueur() {
		return 1 + suivant.longueur();
	}
	
	public boolean member(T x) {
		if (x.compareTo(element) == 0) {
			return true;
		} else {
			return suivant.member(x);
		}
	}

}
