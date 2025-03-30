package sortingAlgorithms;

import utils.Helper;

public class ShellSort {
	
	/**
	 * Permet de trier un array en utilisant le ShellSort.
	 * @param array l'array à trier
	 */
	public static void sort(int[] array) {
		
		int len = array.length;
		
		// initialization of the gap
		int gap = 0;
		
		// set up the gap
		while (gap < len-1) {
			gap = (3 * gap) + 1;
		}
		
		Helper.printArray(array);
		while (gap >= 1) {
			
			for (int i = gap; i < len; i++) {
				int j = i;
				int key = array[i];  // element to sort
				
				while (j >= gap && array[j - gap] > key)  {
					array[j] = array[j - gap];
					j -= gap;
				}
				
				array[j] = key;
				Helper.printArray(array);
				
			}
			
			// reduction of gap
			gap /= 3;
		}
	}
}
