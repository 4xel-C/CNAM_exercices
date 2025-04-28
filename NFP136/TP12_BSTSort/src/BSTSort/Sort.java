package BSTSort;
import java.util.ArrayList;

public class Sort {
	
	/**
	 * Fonction permettant le tri "inplace" d'un array d'objet Comparables.
	 * Utilisation d'un arbre de tri binaire pour l'algorithme.
	 * @param <T> Objet comparable.
	 * @param array L'array à trier.
	 * @return 
	 */
	public static <T extends Comparable<T>> ArrayList<T> sort(T[] array) {

		
		// Declaration de l'arbre binaire de recherche servant de support au tri
		BinarySearchTree<T> bst = new BinarySearchTree<>();
		
		// Insertion de tous les éléments de l'array
		for(T element : array) {
			bst.insert(element);
		}
		
		 return bst.bstToArrayList();	
	}
	
	public static void main(String[] args) {
		
		Integer[] arrayExercice = {7, 2, 5, 1, 3, 9};
		
		System.out.println("Impression de l'array à trier: ");
		
		for (int e : arrayExercice) {
			System.out.print(e);
		}
		System.out.println();
		
		
		ArrayList<Integer> result = sort(arrayExercice);
		
		System.out.println("Impression de l'array trié: ");
		
		for (int e : result) {
			System.out.print(e);
		}
		
	}

}
