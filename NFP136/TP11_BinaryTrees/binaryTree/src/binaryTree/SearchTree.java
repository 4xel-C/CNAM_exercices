package binaryTree;

public class SearchTree<T extends Comparable<T>> implements BinTree<T> {
	
	BinTree<T> tree;
	
	// Construction d'un arbre vide.
	public SearchTree() {
		tree = new Feuille<>();
	}
	
	@Override
	public boolean estVide() {
		return tree.estVide();
	}

	@Override
	public T racine() {
		return tree.racine();
	}

	@Override
	public BinTree<T> sag() {
		return tree.sag();
	}

	@Override
	public BinTree<T> sad() {
		return tree.sad();
	}

	@Override
	public int hauteur() {
		return tree.hauteur();
	}

	@Override
	public int taille() {
		return tree.taille();
	}

	@Override
	public String prefixe() {
		return tree.prefixe();
	}

	@Override
	public String postfixe() {
		return tree.postfixe();
	}

	@Override
	public String infixe() {
		return tree.infixe();
	}
	
	// Surcharge les méthodes insert & delete pour être appelé via l'instance, sans passer l'arbre en paramètre et modifie In place.
	public void insert(T element) {
		tree = insert(element, tree);
	}
	
	public void delete(T element) {
		tree = delete(element, tree);
	}
	
	// Surcharge les méthodes min & max pour appeler avec l'instance sans passer l'arbre en paramètre
	public T trouveMax() {
		return trouveMax(tree);
	}
	
	public T trouveMin() {
		return trouveMin(tree);
	}
	
	private T trouveMax(BinTree<T> tree) {
		
		while (!(tree.sad() instanceof Feuille)) {
			tree = tree.sad();
		}
		return tree.racine();
	}
	
	private <T> T trouveMin(BinTree<T> tree) {
		
		while (!(tree.sag() instanceof Feuille)) {
			tree = tree.sag();
		}
		return tree.racine();
	}
	
	
	private BinTree<T> insert(T element, BinTree<T> tree) {
		
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
	

	private BinTree<T> delete(T element, BinTree<T> tree) {
		
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
}
