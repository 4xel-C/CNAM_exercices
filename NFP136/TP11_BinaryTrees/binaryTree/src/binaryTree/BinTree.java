package binaryTree;

public interface BinTree<T> {
	
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
