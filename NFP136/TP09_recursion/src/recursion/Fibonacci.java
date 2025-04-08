package recursion;

public class Fibonacci {
	
	public static int fibonacciParRecursion(int n) {
		
		// gestion d'erreur
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative! Current value: " + n);
		}
		
		// Cas de base
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		
		// Appel recursif
		return fibonacciParRecursion(n - 1) + fibonacciParRecursion(n - 2);
	}
	

	public static int fibonacciParIteration(int n) {
		
		// gestion d'erreur
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative! Current value: " + n);
		}
		
		// Les deux premières valeurs pour n = 0 et n = 1
		int result = 0;
		int n0 = 0;
		int n1 = 1;
		
		// Cas de base
		if (n == 0) {
			return n0;
		} else if (n == 1) {
			return n1;
		}
		
		// Faire l'opération n - 2 fois car les deux premiers cas de base ont été calculés.
		for (int i = 0; i <= n-2; i++) {
			result = n0 + n1;
			n0 = n1;
			n1 = result;
		}
		
		return result;
	}
	

}
