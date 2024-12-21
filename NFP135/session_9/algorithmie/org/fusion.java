package org;

// proposition d'algorithme permettant la fusion de deux tableaux triés

public class fusion {
    public static void main() {
        int[] a = {1,6,45,57,102};
        int[] b = {3,4,5,8,11,12,13,20,22,23,25};

        int fusionned_array[] = fus(a, b);
        
        for (int i = 0; i < fusionned_array.length; i++){
            System.out.print(fusionned_array[i] + " ");
        }

    }

    public static int[] fus(int[] a, int[] b) {
        int len_a = a.length;
        int len_b = b.length;
        int[] result = new int[len_a + len_b];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < len_a || j < len_b) {

            // if one of the pointer reach the end of its array
            if (i == len_a){
                result[k] = b[j];
                k++;
                j++;
            }
            else if ( j == len_b){
                result[k] = a[i];
                k++;
                i++;
            }

            // If none of the two pointers reached the end of its array
            else {
                if (a[i] <= b[j]){
                    result[k] = a[i];
                    i++;
                    k++;
                }
                else {
                    result[k] = b[j];
                    j++;
                    k++;
                }
            }

        }
        return result;
    }
}