package sortingAlgorithms;
import utils.Helper;


public class BubbleSort {
	
	/**
	 * Permet de trier un array d'entier par ordre croissant en utilisante le bubble sort de complexité O(n²). L'array est trié "in-place" et la méthode ne retourne pas de valeurs.
	 * @param array Un array d'entier à trier.
	 */
	public static void sort(int[] array) {
		
		int len = array.length;
		boolean hasPermuted = true;
		Helper.printArray(array);
		
		
		// Iteration through the array until no permutation observed
		while (hasPermuted) {
			hasPermuted = false;
			for (int i = 1; i < len; i++) {
				
				if (array[i-1] > array[i]) {
					Helper.permute(array, i-1, i);
					
					// Print the array to see the evolution of the algorithm
					Helper.printArray(array);
					
					hasPermuted = true;
				}
			}
		}

		
		return;
	}
	

}
