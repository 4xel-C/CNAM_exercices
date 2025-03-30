package sortingAlgorithms;

import utils.Helper;

public class SelectionSort {
	
	
	/**
	 * Permet de trier un array en utilisant le selection sort (complexité de O(n²)). L'array est trier in place et la méthode ne retourne pas de valeurs.
	 * @param array l'array à trier.
	 */
	public static void sort(int[] array) {
		
		int len = array.length;
		Helper.printArray(array);
		
		for (int i = 0; i < len; i++) {
			
			int indexMin = i;
			
			for (int j = i; j < len; j++) {
				
				if (array[j] < array[indexMin]) {
					indexMin = j;
				}
				
			}
			
			// Use the helper function to permute the 2 numbers in the position i and indexMin.
			Helper.permute(array, i, indexMin);
			Helper.printArray(array);

		}
		
	}
}
