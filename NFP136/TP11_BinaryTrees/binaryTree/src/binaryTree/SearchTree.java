package binaryTree;

public class SearchTree {
	
	public static <T> T trouveMax(BinTree<T> tree) {
		
		while (!(tree.sad() instanceof Feuille)) {
			tree = tree.sad();
		}
		return tree.racine();
	}
	
	public static <T> T trouveMin(BinTree<T> tree) {
		
		while (!(tree.sag() instanceof Feuille)) {
			tree = tree.sag();
		}
		return tree.racine();
	}
	
	
	public static <T extends Comparable<T>> BinTree<T> insert(T element, BinTree<T> tree) {
		
		if (tree instanceof Feuille) {
			return new Noeud<T>(element, new Feuille<T>(), new Feuille<T>());

		}
		
		if (element.compareTo(tree.racine()) < 0) {
			BinTree<T> left = insert(element, tree.sag());
			return new Noeud<T>(tree.racine(), left, tree.sad());
			
		} else if (element.compareTo(tree.racine()) > 0) {
			BinTree<T> right = insert(element, tree.sad());
			return new Noeud<T>(tree.racine(), tree.sag(), right);
		}
		
		return tree;		

	}
	

	public static <T extends Comparable<T>> BinTree<T> delete(T element, BinTree<T> tree) {
		
		// Si l'élément est une feuile, donc vide, on retourne la feuille
		if (tree instanceof Feuille) {
			return tree;
		}
		
		if (element.compareTo(tree.racine()) < 0) {
			BinTree<T> left = delete(element, tree.sag());
			return new Noeud<T>(tree.racine(), left, tree.sad());
			
		} else if (element.compareTo(tree.racine()) > 0) {
			BinTree<T> right = delete(element, tree.sad());
			return new Noeud<T>(tree.racine(), tree.sag(), right);
			
		// Si nous trouvons l'élément
		} else {
			
			// L'élément à supprimer n'a pas d'enfants, on le remplace par une feuille
			if (tree.sag() instanceof Feuille && tree.sad() instanceof Feuille) {
				return new Feuille<T>();
			}
			
			// Si l'élément à supprimer n'a qu'un enfant: on le remplace par son enfant
			if (tree.sag() instanceof Feuille) return tree.sad();
			if (tree.sad() instanceof Feuille) return tree.sag();
			
			// Si l'élément à supprimer a deux enfant: on le remplace par le min du sous arbre droit (ou le max du sous arbre gauche)
			T min = trouveMin(tree.sad());
			BinTree<T> newRight = delete(min, tree.sad());
			
			// On retourne un nouveau noeud dont la racine est le minimum, le sous arbre gauche est inchangé, avec le droit sans son min. 
			return new Noeud<T>(min, tree.sag(), newRight);			
		}	

	}
	
	
	/**
	 * Method de test pour valider les méthodes
	 * @param args
	 */
	public static void main(String[] args) {
		
		BinTree<Integer> tree = new Feuille<>();
		
		tree = insert(5, tree);
		tree = insert(2, tree);
		tree = insert(6, tree);
		tree = insert(7, tree);
		tree = insert(4, tree);
		tree = insert(9, tree);
		tree = insert(1, tree);
		tree = insert(3, tree);
		
		System.out.println(tree.infixe());
		tree = delete(2, tree);
		System.out.println(tree.infixe());
		
	}

}
