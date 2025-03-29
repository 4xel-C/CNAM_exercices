package sortingAlgorithms;

import utils.Helper;

public class InsertionSort {

	/**
	 * Permet de trier un array d'entier par ordre croissant en utilisant l'insertion sort de complexité O(n²). L'array est trié "in-place" et la méthode ne retourne pas de valeurs.
	 * @param array Un array d'entier à trier.
	 */
	public static void sort(int[] array) {
		
		int len = array.length;
		Helper.printArray(array);
		
		for (int i = 1; i < len; i++) {
			int j = i;
			int keyToInsert = array[i];
			
			while (j > 0 && keyToInsert < array[j-1]) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = keyToInsert;
			Helper.printArray(array);
		}
		return;
	}
}

