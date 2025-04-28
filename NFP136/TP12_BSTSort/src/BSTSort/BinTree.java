package BSTSort;

public interface BinTree<T extends Comparable<T>> {
	
	boolean estVide();

	T racine();
	
	BinTree<T> sag();
	BinTree<T> sad();
	
	int hauteur();
	int taille();
	
	String prefixe();
	String postfixe();
	String infixe();
}
