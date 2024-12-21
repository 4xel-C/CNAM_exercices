package org;

// implementation of the sequential sort algorithm
// Complexity O(n²) Omega(n²) => theta(n²)

public class sort {
    public static void main() {
        int array[] = {10, 50, 40, 5, 60, 80, 90, 100, 0};
        sort_array(array);
    }

    public static int[] sort_array(int array[]) {

        // declaration de la variable array à trier
        
        int len = array.length;

        for (int i = 0; i < len - 1; i++ ) {
            int temp = array[i];
            int min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[i]) {
                    array[i] = array[j];
                    min_index = j;
                }
            }
            array[min_index] = temp;
        }

        return array;
    }

    public static void print_array(int array[]) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}