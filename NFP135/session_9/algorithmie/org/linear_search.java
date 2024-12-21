package org;
// Implementation of linear serach algorithm.
// Complexity O(n) Omega(1) (if target the first item)



public class linear_search {
    public static void main() {
        int array[] = {10, 50, 40, 5, 60, 80, 90, 100, 0};
        int len = array.length;

        int target = 60;

        for (int i = 0; i < len; i++) {
            if (array[i] == target) {
                System.out.println(i);
            }
        }
    }
}