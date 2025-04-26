package binaryTree;

public class Exercices {
	
	public static void main(String[] args) {
		
		System.out.println("=============Exercices Binary Tree=============");
		System.out.println();
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
		
		System.out.println();
		System.out.println("==============Exercices Binary Search Tree===============");
		System.out.println();
		
		SearchTree<Integer> tree = new SearchTree<>();
		
		System.out.println();
		System.out.println("Creation de l'arbre de recherche vierge et insertion des éléments: 5, 2, 6, 7, 4, 9, 1, 3");
		tree.insert(5);
		tree.insert(2);
		tree.insert(6);
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(1);
		tree.insert(3);
		
		System.out.println();
		System.out.println("Impression de l'arbre prefixe: ");
		System.out.println(tree.prefixe());
		System.out.println();
		
		System.out.println("Le maximum de l'arbre est: " + tree.trouveMax());
		System.out.println("Le minimum de l'arbre est: " + tree.trouveMin());
		System.out.println();
		
		System.out.println("Suppression de l'élément 2: ");
		tree.delete(2);
		System.out.println("Impression de l'arbre prefixe: ");
		System.out.println(tree.prefixe());
		System.out.println();
		
		System.out.println("Suppression de l'élément 4: ");
		tree.delete(4);
		System.out.println("Impression de l'arbre prefixe: ");
		System.out.println(tree.prefixe());
		
		System.out.println();
		System.out.println("=========Exercices Arbre AVL============");
		System.out.println();
		
		
		AVLSearchTree<Integer> AVLTree = new AVLSearchTree<>();
		System.out.println("Creation de l'arbre de recherche vierge et insertion des éléments: 5, 2, 6, 7, 9");
		AVLTree.insert(5);
		System.out.println();
		System.out.println("Insertion de 5 et Impression de l'arbre prefixe: ");
		System.out.println(AVLTree.prefixe());
		
		AVLTree.insert(2);
		System.out.println();
		System.out.println("Insertion de 2 et Impression de l'arbre prefixe: ");
		System.out.println(AVLTree.prefixe());
		
		AVLTree.insert(6);
		System.out.println();
		System.out.println("Insertion de 6 et Impression de l'arbre prefixe: ");
		System.out.println(AVLTree.prefixe());
		
		AVLTree.insert(7);
		System.out.println();
		System.out.println("Insertion de 7 et Impression de l'arbre prefixe: ");
		System.out.println(AVLTree.prefixe());
		
		
		AVLTree.insert(9);
		System.out.println();
		System.out.println("Insertion de 9, rééquilibrage de l'arbre et Impression de l'arbre prefixe: ");
		System.out.println(AVLTree.prefixe());
		
		AVLTree.insert(10);
		System.out.println();
		System.out.println("Insertion de 10, rééquillibrage et Impression de l'arbre prefixe: ");
		System.out.println(AVLTree.prefixe());
	}

}
