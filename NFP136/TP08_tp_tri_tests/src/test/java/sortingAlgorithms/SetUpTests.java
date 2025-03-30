package sortingAlgorithms;

import org.junit.jupiter.api.BeforeEach;

/**
 * Ste up class pour hériter de divers tableau à tester dans les classes de tests.
 */
public class SetUpTests {
	
    protected int[] tableauVide;
    protected int[] tableauUnElement;
    protected int[] tableauOrdonne;
    protected int[] tableauInverse;
    protected int[] tableauAleatoire;
    protected int[] tableauDoublons;
	
    /**
     * Regénère les tableaux par défaut à chaque exécution d'un test.
     */
	@BeforeEach 
	public void setUp() {
        // Initialisation des tableaux de test
        tableauVide = new int[]{};
        tableauUnElement = new int[]{42};
        tableauOrdonne = new int[]{1, 2, 3, 4, 5};
        tableauInverse = new int[]{5, 4, 3, 2, 1};
        tableauAleatoire = new int[]{3, 7, 1, 9, 2, 5, 8, 4, 6};
        tableauDoublons = new int[]{3, 1, 3, 2, 1, 2};
		
	}

}
