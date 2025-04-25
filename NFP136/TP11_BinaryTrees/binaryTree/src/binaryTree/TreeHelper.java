package binaryTree;
import java.util.Stack;
import java.util.LinkedList;

/**
 * Classe pour implémenter les méthodes d'arbres binaires simples sans modifier l'interface.
 */
public class TreeHelper {
	
	/**
	 * Méthode itérative pour afficher les éléments par ordre préfixe
	 * @param tree L'arbre binaire à afficher.
	 * @return Une String contenant le résultat.
	 */
	public static <T extends Comparable<T>> String prefixeIteratif(BinTree<T> tree) {
		
		// Pile pour stocker les éléments en prefixe
		Stack<BinTree<T>> pile = new Stack<>();
		
		// String builder pour préparer la valeur retour
		StringBuilder prefixe = new StringBuilder();
		
		// Nous allons utiliser la stratégie suivante: ajouter le noeud racine à la pile
		// puis le dépiler, l'ajouter à la string, et insérer les noeuds fils en commencant par la droite
		pile.push(tree);
		BinTree<T> noeud;
		
		while (!pile.isEmpty()) {
			
			noeud = pile.pop();
			if (noeud.estVide()) continue;
			
			prefixe.append(noeud.racine());
			prefixe.append(", ");
			pile.push(noeud.sad());
			pile.push(noeud.sag());
		}
		
		String result = prefixe.toString();
		result = result.trim();
		if (result.endsWith(",")) {
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}
	
	/**
	 * Méthode itérative pour afficher les éléments "largeur d'abord" (niveau par niveau)
	 * @param tree L'arbre binaire à afficher.
	 * @return Une String contenant le résultat.
	 */
	public static <T extends Comparable<T>> String largeurIteratif(BinTree<T> tree) {
		
		// Pile pour stocker les éléments en prefixe
		LinkedList<BinTree<T>> file = new LinkedList<>();
		
		// String builder pour préparer la valeur retour
		StringBuilder prefixe = new StringBuilder();
		
		// Nous allons utiliser la stratégie suivante: ajouter le noeud racine à la pile
		// puis le dépiler, l'ajouter à la string, et insérer les noeuds fils en commencant par la droite
		file.add(tree);
		BinTree<T> noeud;
		
		while (!file.isEmpty()) {
			
			noeud = file.poll();
			if (noeud.estVide()) continue;
			
			prefixe.append(noeud.racine());
			prefixe.append(", ");
			file.add(noeud.sag());
			file.add(noeud.sad());
		}
		
		String result = prefixe.toString();
		result = result.trim();
		if (result.endsWith(",")) {
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}
	
	/**
	 * Méthode pour vérifier si l'abre contient un élément en particulier.
	 */
	public static <T extends Comparable<T>> boolean contient(BinTree<T> tree, T e) {
		if (tree instanceof Feuille) return false;
		
		if (tree.racine() == e) return true;
		
		return (contient(tree.sad(), e) || contient(tree.sag(), e));
	}
	
	/**
	 * Méthode permettant de rechercher le minimum de l'arbre
	 * @param tree L'arbre considéré
	 * @return La valeur T minimale
	 */
	public static <T extends Comparable<T>> T min(BinTree<T> tree) {
		
		if (tree instanceof Feuille) return null;
		
		T min = tree.racine();
		
		// Utilisation de la méthode compareTo de la classe Comparable.
		if (min(tree.sag()) != null && min(tree.sag()).compareTo(min) < 0) {
			min = max(tree.sag());
		}
		
		if (max(tree.sad()) != null && max(tree.sad()).compareTo(min) < 0) {
			min = max(tree.sad());
		}
		
		return min;
	}
	
	/**
	 * Méthode permettant de rechercher le maximum de l'arbre
	 * @param tree L'arbre considéré
	 * @return La valeur T maximale
	 */
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
