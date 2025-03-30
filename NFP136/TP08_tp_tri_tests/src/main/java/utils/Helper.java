package utils;
import java.util.function.Supplier;

/*
 * This package is an helper package to help implementing and studying sorting algorithms.
 */

public class Helper {
	
	/**Methode "wrapper" permettant de mesurer le temps d'exécution d'une autre fonction
	 * @param function Fonction dont on veut mesurer le temps d'exécution 
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
     * Méthode permettant de faciliter l'impression d'un array.
     * @param array Array à imprimer
     */
    public static void printArray(int array[]) {
        int len = array.length;

        for (int i = 0; i < len; i ++){
            System.out.print(array [i] + " ");
        }
        System.out.println();
    }

    
    /**
     * Méthode permettant la permutation de deux éléments dans un array.
     * @param array L'array contenant les éléments à permuter.
     * @param index1 L'index du premier élément à permuter
     * @param index2 L'index du deuxième élément à permuter.
     */
    public static void permute(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return;
    }

}
