package org;

// implementation of binary search using the sort algorithm

public class binary_search {
    public static void main() {
        int array[] = {3, 45, 0, 10, 9, 8, 7, 76, 234, 200, 4};

        array = sort.sort_array(array);
        sort.print_array(array);
    
        int target = 45;
        int start = 0;
        int end = array.length - 1;
        int middle = array.length / 2;

        while(start <= end) {
            middle = (start + end) /2;

            if (target == array[middle]){
                System.out.println(middle);
                return;
            }
            else if (target < array[middle]){
                end = middle-1;
            }
            else if (target > array[middle]){
                start = middle+1;
            }
        }
    }
}