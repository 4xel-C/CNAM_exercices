package main;
import utils.Helper;
import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.InsertionSort;
import sortingAlgorithms.MergeSort;
import sortingAlgorithms.QuickSort;
import sortingAlgorithms.SelectionSort;
import sortingAlgorithms.ShellSort;

public class Main {

	public static void main(String[] args) {
		
		// declare an array
		int[] array = {5, 10, 1, 3, 7, 4, 2, 6, 9, 8};

		// Because the sorting method update the array in place
		// I copy the array each time I use a sorting procedure
		int[] array1 = array.clone();
		int[] array2 = array.clone();
		int[] array3 = array.clone();
		int[] array4 = array.clone();
		int[] array5 = array.clone();
		int[] array6 = array.clone();
		
		System.out.println("Unsorted array:");
		Helper.printArray(array1);
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation du Bubble Sort:");
		Helper.timer(() -> {
			BubbleSort.sort(array1);
			return null;
		});
		
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation du Selection Sort:");
		Helper.timer(() -> {
			SelectionSort.sort(array2);
			return null;
		});
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation de l'Insertion Sort:");
		Helper.timer(() -> {
			InsertionSort.sort(array3);
			return null;
		});
		
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation du Shell Sort:");
		Helper.timer(() -> {
			ShellSort.sort(array4);
			return null;
		});
		
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation du Merge Sort:");
		Helper.timer(() -> {
			MergeSort.sort(array5);
			return null;
		});
		
		System.out.println("\n------------------------\n");
		System.out.println("Utilisation du Quick Sort:");
		Helper.timer(() -> {
			QuickSort.sort(array6);
			return null;
		});
	}

}
