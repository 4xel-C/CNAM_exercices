package sortingAlgorithms;

import utils.Helper;

public class InsertionSort {

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

