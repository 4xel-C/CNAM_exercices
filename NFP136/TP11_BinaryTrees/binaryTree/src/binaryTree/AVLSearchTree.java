package binaryTree;

public class AVLSearchTree<T extends Comparable<T>> implements BinTree<T>{
	
	BinTree<T> tree;
	
	public AVLSearchTree() {
		tree = new Feuille<T>();
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
	
	public void insert(T element) {
		tree = insertAVL(element, tree);
	}
	
	public void delete(T element) {
		tree = deleteAVL(element, tree);
	}
	
	private static <T> T trouveMax(BinTree<T> tree) {
		
		while (!(tree.sad() instanceof Feuille)) {
			tree = tree.sad();
		}
		return tree.racine();
	}

	private static <T> T trouveMin(BinTree<T> tree) {
		
		while (!(tree.sag() instanceof Feuille)) {
			tree = tree.sag();
		}
		return tree.racine();
	}
	
	private static <T extends Comparable<T>> BinTree<T> insertAVL(T element, BinTree<T> tree) {
		
		if (tree instanceof Feuille) {
			return new Noeud<T>(element, new Feuille<T>(), new Feuille<T>());
		}
		
		if (element.compareTo(tree.racine()) < 0) {
			BinTree<T> left = insertAVL(element, tree.sag());
			
			// Retourner le noeud équilibré après insertion de l'élément
			return balance(new Noeud<T>(tree.racine(), left, tree.sad()));
			
		} else if (element.compareTo(tree.racine()) > 0) {
			BinTree<T> right = insertAVL(element, tree.sad());
			
			// retourner le noeud équilibé
			return balance(new Noeud<T>(tree.racine(), tree.sag(), right));
		}
		
		return tree;		
	}
	
	
	private static <T extends Comparable<T>> BinTree<T> deleteAVL(T element, BinTree<T> tree) {
		
		// Si l'élément est une feuile, donc vide, on retourne la feuille
		if (tree instanceof Feuille) {
			return tree;
		}
		
		if (element.compareTo(tree.racine()) < 0) {
			BinTree<T> left = deleteAVL(element, tree.sag());
			return balance(new Noeud<T>(tree.racine(), left, tree.sad()));
			
		} else if (element.compareTo(tree.racine()) > 0) {
			BinTree<T> right = deleteAVL(element, tree.sad());
			return balance(new Noeud<T>(tree.racine(), tree.sag(), right));
			
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
			BinTree<T> newRight = deleteAVL(min, tree.sad());
			
			// On retourne un nouveau noeud dont la racine est le minimum, le sous arbre gauche est inchangé, avec le droit sans son min. 
			return balance(new Noeud<T>(min, tree.sag(), newRight));			
		}	
	
	}
	
	/**
	 * Methode permettant de donner la pente d'un arbre binaire
	 * @param tree l'arbre à mesurer
	 * @return
	 */
	private static <T extends Comparable<T>> int pente(BinTree<T> tree) {
		if (tree instanceof Feuille) return 0;
		return tree.sag().hauteur() - tree.sad().hauteur();
	}
	
	
	private static <T extends Comparable<T>> BinTree<T> ror(BinTree<T> tree) {
		
		// Si l'élément est une feuile ou n'a pas de sag, on retourne l'abre
		if (tree instanceof Feuille || tree.sag() instanceof Feuille) {
			return tree;
		}
		
		BinTree<T> leftChild = tree.sag();
		
		// Creation de l'ancien noeud racine qui deviendra le sous arbre droit
		BinTree<T> oldRoot = new Noeud<T>(tree.racine(), leftChild.sad(), tree.sad());
		
		// Creation du nouvel arbre en utilisant l'ancienne root modifié
		BinTree<T> newRoot = new Noeud<T>(leftChild.racine(), leftChild.sag(), oldRoot);
		
		return newRoot;
	}
	
	private static <T extends Comparable<T>> BinTree<T> rol(BinTree<T> tree) {
		
		// Si l'élément est une feuile ou n'a pas de sad, on retourne l'abre
		if (tree instanceof Feuille || tree.sad() instanceof Feuille) {
			return tree;
		}
		
		BinTree<T> rightChild = tree.sad();
		
		// Creation de l'ancien noeud racine qui deviendra le sous arbre gauche
		BinTree<T> oldRoot = new Noeud<T>(tree.racine(), tree.sag(), rightChild.sag());
		
		// Creation du nouvel arbre en utilisant l'ancienne root modifié
		BinTree<T> newRoot = new Noeud<T>(rightChild.racine(), oldRoot, rightChild.sad());
		
		return newRoot;
	}
	
	private static <T extends Comparable<T>> BinTree<T> balance(BinTree<T> tree) {
		
		int pente = pente(tree);
		
		BinTree<T> leftChild = tree.sag();
		BinTree<T> rightChild = tree.sad();
		
		// Si l'arbre penche trop sur la gauche
		if (pente > 1)  {
			
			// le sag penche sur la droite -> double rotation
			if (pente(leftChild) < 0) {
				leftChild = rol(leftChild);
			}
			return ror(new Noeud<T>(tree.racine(), leftChild, rightChild));
			
		// Si l'arbre penche sur la droite
		} else if (pente < -1) {
			
			// Verifier si le sous arbre penche vers la gauche
			if (pente(rightChild) > 0) {
				rightChild = ror(rightChild);
			}
			
			return rol(new Noeud<T>(tree.racine(), leftChild, rightChild));
		}
		
		// Si l'arbre ne penche pas, ne rien modifier
		else return tree;
	}
}
