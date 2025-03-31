
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

/**
 * Classe implémentant les tests pour la classe Sudoku.
 */
class SudokuTest {

	private Sudoku sudoku;
	
	/**
	 * Fonction pour préparer le sudoku test en fonction de la grille test voulue.
	 * @param grid Un attribut de la classe TestGrids contenant une grille de test.
	 * @return Un instance de Sudoku.
	 * @throws IOException Si une erreur survient lors de l'écriture du fichier.
	 */
	private Sudoku generateMockSudoku(String grid) throws IOException, IllegalArgumentException {
		String file = "testGrid.txt";
		Path filePath = Paths.get("data", file);
		Files.write(filePath, grid.getBytes());
		sudoku = new Sudoku(file);
		return sudoku;
	}
	

	/**
	 * Test du chargement d'un fichier valide.
	 * @throws IOException 
	 */
	@Test
	void testReadGridValidFile() {	
	    assertDoesNotThrow(() -> {
	        sudoku = generateMockSudoku(TestGrids.validText);
	        assertEquals(1, sudoku.grid[0][0]);
	        assertEquals(2, sudoku.grid[0][1]);
	        assertEquals(0, sudoku.grid[1][0]);
	        assertEquals(6, sudoku.grid[1][1]);
	        Files.delete(sudoku.getFilePath());
	    });
	}
	
	/**
	 * Verifie la génération d'une erreur si un fichier inconnu est passé comme argument.
	 * @throws IOException
	 */
	@Test
	void testSudokuUnexistantFile() {
		assertThrows(FileNotFoundException.class, () -> new Sudoku("invalidFileName"));
	}
	
	
	/**
	 * Vérifie que le programme renvoi bien l'erreur ciblé en cas de fichier au format incorrect.
	 * @throws IOException
	 */
	@Test
	void testInvalidGridFormat() throws IOException {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> generateMockSudoku(TestGrids.invalidTextLonger));
	    assertEquals("Trop de rangées dans le sudoku.", exception.getMessage());
	    
	    exception = assertThrows(IllegalArgumentException.class, () -> generateMockSudoku(TestGrids.invalidTextLongerRow));
	    assertEquals("La ligne 4 du sudoku est invalide!", exception.getMessage());
	    
		exception = assertThrows(IllegalArgumentException.class, () -> generateMockSudoku(TestGrids.invalidTextShorter));
		assertEquals("Format invalide, nombres de lignes détectées: 8/9", exception.getMessage());
		
		exception = assertThrows(IllegalArgumentException.class, () -> generateMockSudoku(TestGrids.invalidTextShorterRow));
		assertEquals("La ligne 6 du sudoku est invalide!", exception.getMessage());
		
		exception = assertThrows(IllegalArgumentException.class, () -> generateMockSudoku(TestGrids.invalidTextInvalidChar));
		assertEquals("Format invalide!", exception.getMessage());
	}
	
	
	/**
	 * Teste la fonction findEmpty pour trouver la première cellule vide.
	 */
	@Test
	void testFindEmpty() {
		assertDoesNotThrow(() -> {
			Sudoku sudoku = generateMockSudoku(TestGrids.validText);
	        Position empty = sudoku.findEmpty();
	        assertEquals(1, empty.row);
	        assertEquals(0, empty.col);
	        Files.delete(sudoku.getFilePath());
	    });
		
	}
	
	
	/**
	 * Vérifie que la fonction findEmpty retourne bien null si il n'y a pas de cases vides.
	 */
	@Test
	void testFindEmptyFull() {
		assertDoesNotThrow(() -> {
			Sudoku sudoku = generateMockSudoku(TestGrids.fullText);
	        assertEquals(null, sudoku.findEmpty());
	        Files.delete(sudoku.getFilePath());
	    });
		
	}

}
