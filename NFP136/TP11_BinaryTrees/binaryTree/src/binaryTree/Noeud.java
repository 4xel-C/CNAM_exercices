package binaryTree;

public class Noeud<T extends Comparable<T>> implements BinTree<T> {
	
	private T root;
	private BinTree<T> left;
	private BinTree<T> right;
	
	public Noeud(T root, BinTree g, BinTree r) {
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
		int d = left.hauteur();
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

	/**
	 * Méthode pour vérifier si l'abre contient un élément en particulier.
	 */
	public static <T extends Comparable<T>> boolean contient(BinTree<T> tree, T e) {
		if (tree instanceof Feuille) return false;
		
		if (tree.racine() == e) return true;
		
		return (contient(tree.sad(), e) || contient(tree.sag(), e));
	}


	public static <T extends Comparable<T>> T min(BinTree<T> tree) {
		
		if (tree instanceof Feuille) return null;
		
		T min = tree.racine();
		
		if (min(tree.sag()) != null && min(tree.sag()).compareTo(min) < 0) {
			min = max(tree.sag());
		}
		
		if (max(tree.sad()) != null && max(tree.sad()).compareTo(min) < 0) {
			min = max(tree.sad());
		}
		
		return min;
	}
 
	public static <T extends Comparable<T>> T max(BinTree <T> tree) {
		
		if (tree instanceof Feuille) return null;
		
		T max = tree.racine();
		
		if (max(tree.sag()) != null && max(tree.sag()).compareTo(max) > 0) {
			max = max(tree.sag());
		}
		
		if (max(tree.sad()) != null && max(tree.sad()).compareTo(max) > 0) {
			max = max(tree.sad());
		}
		
		return max;
	}
}
