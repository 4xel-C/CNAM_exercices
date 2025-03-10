package main;
import utils.Helper;
import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.InsertionSort;
import sortingAlgorithms.SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		// declare an array
		int[] array = {4, 8, 1, 3, 11, 10};

		// Because the sorting method update the array in place
		// I copy the array each time I use a sorting procedure
		int[] array1 = array.clone();
		int[] array2 = array.clone();
		int[] array3 = array.clone();
		
		System.out.println("Unsorted array:");
		Helper.printArray(array1);
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation du Bubble Sort:");
		BubbleSort.sort(array1);
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation de l'Insertion Sort:");
		InsertionSort.sort(array2);
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation dU Selection Sort:");
		SelectionSort.sort(array3);

	}

}
