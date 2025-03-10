package sortingAlgorithms;
import utils.Helper;


public class BubbleSort {

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
