package binaryTree;

public class Exercices {
	
	public static void main(String[] args) {
		
		System.out.println("Exercices Binary Tree:");
		BinTree<Integer> a0 = new Feuille<Integer>();
		BinTree<Integer> a2 = new Noeud<Integer>(2,a0,a0);
		BinTree<Integer> a4 = new Noeud<Integer>(4,a0,a0);
		BinTree<Integer> a7 = new Noeud<Integer>(7,a0,a0);
		BinTree<Integer> a01 = new Noeud<Integer>(0,a2,a7);
		BinTree<Integer> a1 = new Noeud<Integer>(1,a01,a4);
		
		System.out.println("Impression de l'arbre en Infixe: ");
		System.out.println(a1.infixe());
		System.out.println();
		
		System.out.println("Impression de l'arbre en prefixe: ");
		System.out.println(a1.prefixe());
		System.out.println();

		System.out.println("Impression de l'arbre en postfixe: ");
		System.out.println(a1.postfixe());
		System.out.println();
		
		System.out.println("Impression du minimum de l'arbre: ");
		System.out.println(TreeHelper.min(a1));
		System.out.println();
		
		System.out.println("Impression du maximum de l'arbre: ");
		System.out.println(TreeHelper.max(a1));
		System.out.println();
		
		System.out.println("L'arbre contient 4?: ");
		System.out.println(TreeHelper.contient(a1, 4));
		System.out.println();
		
		System.out.println("L'arbre contient 6?: ");
		System.out.println(TreeHelper.contient(a1, 6));
		System.out.println();
		
		System.out.println("Impression de l'arbre en prefixe en utilisant une méthode itérative: ");
		System.out.println(TreeHelper.prefixeIteratif(a1));
		System.out.println();
		
		System.out.println("Impression de l'arbre en largeur d'abord en utilisant une méthode itérative: ");
		System.out.println(TreeHelper.largeurIteratif(a1));
		System.out.println();
		
		System.out.println("Exercices Binary Search Tree:");
		
		BinTree<Integer> tree = new Feuille<>();
		
		System.out.println();
		System.out.println("Creation de l'arbre de recherche vierge et insertion des éléments: 5, 2, 6, 7, 4, 9, 1, 3");
		tree = SearchTree.insert(5, tree);
		tree = SearchTree.insert(2, tree);
		tree = SearchTree.insert(6, tree);
		tree = SearchTree.insert(7, tree);
		tree = SearchTree.insert(4, tree);
		tree = SearchTree.insert(9, tree);
		tree = SearchTree.insert(1, tree);
		tree = SearchTree.insert(3, tree);
		
		System.out.println();
		System.out.println("Impression de l'arbre infixe: ");
		System.out.println(tree.infixe());
		System.out.println();
		
		System.out.println("Le maximum de l'arbre est: " + SearchTree.trouveMax(tree));
		System.out.println("Le minimum de l'arbre est: " + SearchTree.trouveMin(tree));
		System.out.println();
		
		System.out.println("Suppression de l'élément 2: ");
		tree = SearchTree.delete(2, tree);
		System.out.println(tree.infixe());
		System.out.println();
		
		System.out.println("Suppression de l'élément 4: ");
		tree = SearchTree.delete(4, tree);
		System.out.println(tree.infixe());
	}

}
