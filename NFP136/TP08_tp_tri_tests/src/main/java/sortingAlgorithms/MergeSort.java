package sortingAlgorithms;

import utils.Helper;

public class MergeSort {
	
	/**
	 * Méthode permettant de fusionner deux arrays dans un troisieme. Utilisé pour l'algorithme de merge sort.
	 * @param array Array principal qui va recevoir le fusion des deux autres arrays.
	 * @param arrayLeft Array 1 à fusionner.
	 * @param arrayRight Array 2 à fusionner.
	 */
	public static void merge(int[] array, int[] arrayLeft, int[] arrayRight) {
		
		int lenLeft = arrayLeft.length;
		int lenRight = arrayRight.length;
		
		int indexLeft = 0;
		int indexRight = 0;
		
		while (indexLeft < lenLeft && indexRight < lenRight) {
			
			if (arrayLeft[indexLeft] < arrayRight[indexRight]) {
				array[indexLeft + indexRight] = arrayLeft[indexLeft];
				indexLeft++;
			} else {
				array[indexLeft + indexRight] = arrayRight[indexRight];
				indexRight++;
			}	
		}
		
		// if one of the array is done, finish the other
		while  (indexLeft < lenLeft) {
			array[indexLeft + indexRight] = arrayLeft[indexLeft];
			indexLeft++;
		}
		
		while  (indexRight < lenRight) {
			array[indexLeft + indexRight] = arrayRight[indexRight];
			indexRight++;
		}
		return;
	}
	
	/**
	 * Fonction permettant d'effectuer un merge sort de complexity O(nln(n)). La méthode ne retourne aucune valeur et l'array est trié en place.
	 * @param array L'array à trier.
	 */
	public static void sort(int[] array) {
		
		int len = array.length;
		
		// base state (do nothing when the length is 1 because it's already 'sorted'
		if (len == 1 || len == 0) {
			return;
		}
		
		
		Helper.printArray(array);
		int[] left = new int[len / 2];
		int[] right = new int[len - (len / 2)];
		
		// fill the left and right sub-arrays
		for (int i = 0; i < len; i++) {
			if (i < len / 2) {
				left[i] = array[i];
			} else {
				right[i - (len / 2)] = array[i];
			}
		}
		
		// recursively call the sort function on the left and right
		sort(left);
		sort(right);
		
		// merge the sorted array left and right into the array
		merge(array, left, right);
		Helper.printArray(array);
		
		return;
	}
	

}
