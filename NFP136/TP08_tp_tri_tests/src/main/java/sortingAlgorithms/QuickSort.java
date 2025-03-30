package sortingAlgorithms;
import utils.Helper;

public class QuickSort {
	
	/**
	 * Méthode permettant d'effectuer un quick sort en utilisant un pivot sélectionner en fin d'array.
	 * @param array L'array à trier.
	 * @param low Low limit index of the array to sort
	 * @param high High limit index to the array to sort
	 */
	public static void sort(int[] array, int low, int high) {
		
		Helper.printArray(array);
		
		// base case: if the low index is equal to the high index, we reach the end of the partition
		if (low >= high) {
			return;
		}
		
		int j = low;
		for (int i = low; i < high; i++) {
			if (array[i] < array[high]) {
				
				// permute to keep all lower elements to the left of the pivot
				Helper.permute(array, i, j);
				j++;
				Helper.printArray(array);
			}
		}
		
		// permute the pivot after all his lowest element (j position)
		Helper.permute(array, high, j);
		
		// recursively call the algorithm on the left part of the pivot and on the right part (not including the pivot)
		sort(array, low, j-1);
		sort(array, j+1, high);
		
		Helper.printArray(array);
		return;
	}
	
	
	/**
	 * Supercharge de méthode permettant d'appeler l'algorithme de tri en utilisant un seul paramètre: l'array à trier.
	 * @param array L'array à trier.
	 */
	public static void sort(int[] array) {
		
		int high = array.length - 1;
		int low = 0;
		
		sort(array, low, high);
		
		return;
		
	}

}
