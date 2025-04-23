package binaryTree;

public class BinaryTest {
	
	public static void main(String[] args) {
		
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
		System.out.println(Noeud.min(a1));
		System.out.println();
		
		System.out.println("Impression du maximum de l'arbre: ");
		System.out.println(Noeud.max(a1));
		System.out.println();
		
		System.out.println("L'arbre contient 4?: ");
		System.out.println(Noeud.contient(a1, 4));
		System.out.println();
		
		System.out.println("L'arbre contient 6?: ");
		System.out.println(Noeud.contient(a1, 6));
		System.out.println();
	}

}
