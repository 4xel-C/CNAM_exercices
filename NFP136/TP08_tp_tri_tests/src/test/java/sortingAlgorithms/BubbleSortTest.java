package sortingAlgorithms;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

/**
 * Tests unitaires pour la classe BubbleSort. Hérite de la classe SetUpTests pour récupérer des arrays à tester.
 */
@DisplayName("test de la classe BubbleSort")
class BubbleSortTest extends SetUpTests {
	
	@Test
	@DisplayName("test du tri sur un tableau vide")
	void testTrierTableauVide() {
		BubbleSort.sort(tableauVide);
		assertArrayEquals(new int[]{}, tableauVide, "Le tableau vide doit rester vide");
	}
	
	@Test
	@DisplayName("test du tri sur un tableau à 1 élément")
	void testTrierTableauUnElement() {
		BubbleSort.sort(tableauUnElement);
		assertArrayEquals(new int[]{42}, tableauUnElement, "Le tableau doit contenir un élément");
	}
	
	@Test
	@DisplayName("test du tri sur un tableau ordonné")
	void testTrierTableauTableauOrdonne() {
		BubbleSort.sort(tableauOrdonne);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tableauOrdonne, "Le tableau vide ne doit pas être modifié");
	}
	
	@Test
	@DisplayName("test du tri sur un tableau inversé")
	void testTrierTableauInverse() {
		BubbleSort.sort(tableauInverse);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tableauInverse, "Le tableau doit s'ordonner");
	}
	
	@Test
	@DisplayName("test du tri sur un tableau aléatoire")
	void testTrierTableauAleatoire() {
		BubbleSort.sort(tableauAleatoire);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, tableauAleatoire, "Le tableau doit s'ordonner");
	}
	
	@Test
	@DisplayName("test du tri sur un tableau avec doublons")
	void testTrierTableauDoublons() {
		BubbleSort.sort(tableauDoublons);
		assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, tableauDoublons, "Le tableau doit s'ordonner malgrè les doublons");
	}

}
