package structures;

public interface Pile<T> {

	boolean estVide();
	void push(T e);
	T getTop();
	T pop();
	int hauteur();
	void renverse();
	void printPile();
	
}