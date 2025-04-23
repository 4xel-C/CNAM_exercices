package binaryTree;

public class Feuille<T extends Comparable <T>> implements BinTree<T> {


	public boolean estVide() {
		return true;
	}

	public T racine() {
		 throw new IllegalArgumentException("C'est une feuille");
	}

	public BinTree<T> sad() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public BinTree<T> sag() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public int hauteur() {
		return 0;
	}

	public int taille() {
		return 0;
	}

	public String prefixe() {
		return "<>";
	}

	public String postfixe() {
		return "<>";
	}

	public String infixe() {
		return "<>";
	}

	public boolean contient(T e) {
		return false;
	}

	public T min() {
		return null;
	}

	public T max() {
		return null;
	}
}
