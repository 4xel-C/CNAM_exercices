package recursion;

public class SommeCarrés {
	
	public static int sommeCarrésRecursion(int n) {
		
		// gestion d'erreur
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative! Current value: " + n);
		}
		
		// cas de base
		if (n == 1) return 1;
		
		return (n * n) + sommeCarrésRecursion(n-1);
	}
	
	public static int sommeCarrésIteratif(int n) {
		
		// gestion d'erreur
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative! Current value: " + n);
		}
		
		// Initialiser la variable resultat
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += (i * i);
		}
		
		return result;
	}

}
