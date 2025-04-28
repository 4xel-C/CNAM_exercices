package BSTSort;

public class Feuille<T extends Comparable<T>> implements BinTree<T>{

	@Override
	public boolean estVide() {
		return true;
	}

	@Override
	public T racine() {
		return null;
	}

	@Override
	public BinTree<T> sag() {
		return null;
	}

	@Override
	public BinTree<T> sad() {
		return null;
	}

	@Override
	public int hauteur() {
		return 0;
	}

	@Override
	public int taille() {
		return 0;
	}

	@Override
	public String prefixe() {
		return "<>";
	}

	@Override
	public String postfixe() {
		return "<>";
	}

	@Override
	public String infixe() {
		return "<>";
	}

}
