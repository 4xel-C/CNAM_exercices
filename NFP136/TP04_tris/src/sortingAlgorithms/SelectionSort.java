package sortingAlgorithms;

import utils.Helper;

public class SelectionSort {
	
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
