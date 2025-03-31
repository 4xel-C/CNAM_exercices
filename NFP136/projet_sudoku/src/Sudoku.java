import java.nio.file.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Classe Sudoku contenant toute la logique du code permettant la lecture du fichier texte, et les méthodes permettant la résolution du problème.
 */
public class Sudoku {
	
	/**
	 * La taille de la grille de Sudoku (9).
	 */
	static int size = 9;
	
	/**
	 * La taille des sous-divisions du Sudoku (carré 3x3)
	 */
	static int subSquareSize = 3;
	
	/**
	 * Initialisation de la variable grid qui contiendra la grille de Sudoku sous la forme d'un tableau de tableau (matrice) de la taille adéquate.
	 */
	int[][] grid = new int[size][size];
	
	/**
	 * Le chemin permettant d'accéder au fichier texte.
	 */
	private Path filePath;	
	
	/**
	 * Variable permettant de compter le nombre de solutions trouvées.
	 */
	private int solutionCounter;					
	
	
	/**
	 * Constructeur permettant de générer le chemin d'accès à partir du nom de fichier et de charger la grille de Sudoku dans la variable 
	 * @param file Nom du fichier à lire pour générer le Sudoku.
	 * @throws FileNotFoundException Si le fichier n'est pas n'existe pas.
	 */
	public Sudoku(String file) throws FileNotFoundException {
		this.filePath = Paths.get("data", file);
		
		// initialize the grid
		this.readGrid(this.filePath);
	}
	
	
	/**
	 * Permet de lire un fichier .txt présent dans le dossier 'data' afin de générer la grille de sudoku dans la variable 'grid'.
	 * Si le fichier n'est pas trouvé, le programme est fermé.
	 * @param filePath Le chemin d'accès au fichier.
	 * @throws FileNotFoundException Si le fichier n'est pas trouvé.
	 */
	public void readGrid(Path filePath) throws FileNotFoundException {

		File sudokuFile = filePath.toFile();
		
		if (!sudokuFile.exists()) throw new FileNotFoundException("Le fichier contenant la grille n'a pas été trouvé: " + filePath);
		
		try (Scanner scanner = new Scanner(sudokuFile)){

			char cell; 					// This char will store the value of each cell in the sudoku.
			int lineCounter = 0;		// Count the line of the sudoku.
			
			// scan each line of the file until no "#", then iterate through each character of the line to update the grid matrix.
			while (scanner.hasNextLine()) {
				
				// get the row line by line
				String line = scanner.nextLine();
				
				// Check if the line is not a comment
				if (!line.startsWith("#")) {
					
					if (lineCounter + 1 > size) throw new IllegalArgumentException("Trop de rangées dans le sudoku.");
					
					int length = line.length();
					
					if (length != size) {
						lineCounter++;
						throw new IllegalArgumentException("La ligne " + lineCounter + " du sudoku est invalide!");
					}
					
					// iterate on all the character of the line and update the grid
					for (int col = 0; col < length; col++ ) {
						cell = line.charAt(col);

						
						if (cell == '.') {
							grid[lineCounter][col] = 0;
						} else if (Character.isDigit(cell)) {
							int num = cell - '0';					// conversion of ASCII numerical value of "num" by substracting the ASCII value of '0' (48).

							if (!(num <= size )) throw new IllegalArgumentException("Un Nombre de la grille est hors de portée du Sudoku: " + cell);
							
							grid[lineCounter][col] = num;    
						} else {
							throw new IllegalArgumentException("Format invalide!");
						}
					}
					lineCounter++;
				}
			}
			
			if (lineCounter != size) throw new IllegalArgumentException("Format invalide, nombres de lignes détectées: " + lineCounter + "/" + size);	 
			
			scanner.close();
		}
			
	}
	
	
	
	/**
	 * Permet d'afficher la grille de Sudoku dans le terminal.
	 */
	public void printGrid() {
		
		for (int row = 0; row < size; row++) {
			if (row % subSquareSize == 0 && row != 0) {
				System.out.println("------+------+------");
			}
			for (int col = 0; col < size; col++) {
				if (col % subSquareSize == 0 && col != 0) {
					System.out.print("|");
				}
				System.out.print(" " + grid[row][col]);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * Permet de parcourir la grille de Sudoku et de trouver la position d'une cellule vide.
	 * @return Un object 'Position' qui contient les détails de l'emplacement de la cellule vide. Return null si aucune position vide n'est trouvée.
	 */
	public Position findEmpty() {
	
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (grid[row][col] == 0) {
					Position position = new Position(row, col);
					return position;
				}
			}
		}
		return null;
	}
	
	
	/**
	 * Permet de valider un nombre dans un certaine position en y appliquant les règles du Sudoku.
	 * @param position Un objet 'Position' qui contient la position de la cellule qui recoit un entier.
	 * @param num L'entier à tester.
	 * @return Une valeur booléenne confirmant la validité du nombre dans une certaine position.
	 */
	public boolean isValid(Position position, int num) {
		
		// Check the row
		for (int col = 0; col < size; col++) {
			if (grid[position.row][col] == num && position.col != col) {
				return false;
			}
		}
		
		// check the column
		for (int row = 0; row < size; row++) {
			if (grid[row][position.col] == num && position.row != row) {
				return false;
			}
		}
		
		// check the subSquare
		for (int row = position.subRow * subSquareSize; row < position.subRow * subSquareSize + subSquareSize; row++) {
			for (int col = position.subCol * subSquareSize; col < position.subCol * subSquareSize + subSquareSize; col++) {
				if (grid[row][col] == num && row != position.row && col != position.col) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Permet de résoudre et d'afficher la solution du Sudoku en utilisant de la récursion et du backtracking. 
	 * Permet l'impression de 2 solutions maximum si plusieurs sont possibles.
	 */
	public void solve() {
		
		// Find an empty cell
		Position emptyCell = findEmpty();
		
		// If not empty cell is found, the puzzle is over. If 2 solutions have been found, stop the function.
		if (emptyCell == null) {
			solutionCounter++;
			System.out.println("Solution " + solutionCounter);
			this.printGrid();
			System.out.println();
			return;
			
		}
		
		// Try the number from 1 to 9
		for (int num = 1; num < 10; num++) {
			
			// if there is 2 solutions found, stop all the iterations.
			if (solutionCounter == 2) {
				return;
			}
			
			
			// if we find a valid number to store in the empty cell, update the grid
			if (isValid(emptyCell, num)) {
				grid[emptyCell.row][emptyCell.col] = num;
				
				// Recursively call the solve function to fill the next empty cell
				solve();
				
				// If the next recursive solve function does not find any possibilities, this is a dead end, re-update the cell to 0
				grid[emptyCell.row][emptyCell.col] = 0;
			}
			
		}
		return;
		
	}
	
	/**
	 * Getter pour récupérer le filePath (utilisé ans les tests)
	 * @return filePath du fichier utilisé.
	 */
	public Path getFilePath() {
		return filePath;
	}
}
