package binaryTree;

public class Noeud<T extends Comparable<T>> implements BinTree<T> {
	
	private T root;
	private BinTree<T> left;
	private BinTree<T> right;
	
	public Noeud(T root, BinTree<T> g, BinTree<T> r) {
		this.root = root;
		this.left = g;
		this.right = r;
	}

	public boolean estVide() {
		return false;
	}

	public T racine() {
		return root;
	}

	public BinTree<T> sag() {
		return left;
	}

	
	public BinTree<T> sad() {
		return right;
	}

	public int hauteur() {
		int g = left.hauteur();
		int d = right.hauteur();
		int res = Math.max(g, d);
		return 1 + res;
	}

	public int taille() {
		return 1 + left.taille() + right.taille();
	}

	public String prefixe() {
		return "<" + root + "," + left.prefixe() + "," + right.prefixe() + ">";
	}

	public String postfixe() {
		return "<" + left.postfixe() + "," + right.postfixe() + ","  + root + ">";
	}

	public String infixe() {
		return "<" + left.infixe() + "," + root + "," + right.infixe() + ">";
	}
}
