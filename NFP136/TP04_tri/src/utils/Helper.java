package utils;
import java.util.function.Supplier;

/*
 * This package is an helper package to help implementing and studying sorting algorithms.
 */

public class Helper {
	
	/**
	 * @param function to measure the time
	 * @return the return value of the wrapped function
	 */
    public static <T> T timer(Supplier<T> function){
        long startTime = System.currentTimeMillis();
        T returnValue = function.get();
        long endTime = System.currentTimeMillis();
        System.out.print("Time to run (ms): ");
        System.out.println((endTime-startTime));

        return returnValue;
    }
    
    
    /**
     * Function to facilitate the array printing
     * @param array array to print
     */
    public static void printArray(int array[]) {
        int len = array.length;

        for (int i = 0; i < len; i ++){
            System.out.print(array [i] + " ");
        }
        System.out.println();
    }

    
    /**
     * Function to permute two elements of an array
     * @param array The array to work on
     * @param index1 One of the two index to permute
     * @param index2 the other index
     */
    public static void permute(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return;
    }

}
