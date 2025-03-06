package sudoku;

import java.nio.file.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {
	
	static int size = 9;								// size of the grid.
	static int subSquareSize = 3;						// size of the subsquare inside the sudoku grid.
	private int[][] grid = new int[size][size]; 		// declares the grid as an array of array (for rows and cols).
	private Path filePath;								// contains path to the txt file to read.
	private int solutionCounter;						// Keep track of the number of solution found by the solve method.
	
	/**
	 * Use a .txt file to update the grid variable. If the file is not found, the program is exited.
	 * @param file Path object containing the path to the grid file
	 */
	public void readGrid(Path filePath) {

		File sudokuFile = filePath.toFile();
		
		try {
			// scan each line of the file until no "#", then iterate through each character of the line to update the grid matrix.
			Scanner scanner = new Scanner(sudokuFile);
			char cell; 					// This char will store the value of each cell in the sudoku.
			int lineCounter = 0;		// Count the line of the sudoku.
			
			while (scanner.hasNextLine()) {
				
				// get the row line by line
				String line = scanner.nextLine();
				
				// Check if the line is not a comment
				if (!line.startsWith("#")) {
					
					int length = line.length();
					
					// iterate on all the character of the line and update the grid
					for (int col = 0; col < length; col++ ) {
						cell = line.charAt(col);

						
						if (cell == '.') {
							grid[lineCounter][col] = 0;
						} else if (Character.isDigit(cell)) {
							int num = cell - '0';					// conversion of ASCII numerical value of "num" by substracting the ASCII value of '0' (48).

							grid[lineCounter][col] = num;    
						}
					}
					lineCounter++;
				}
				
			}
			scanner.close();
			
		} catch (FileNotFoundException e){
			System.err.println("Le fichier contenant la grille n'a pas été trouvé.");
			System.err.println("Fermeture du programme.");
			Scanner pause = new Scanner(System.in);
			pause.nextLine();
			pause.close();
			System.exit(0);
		}
	}
	
	
	/**
	 * Constructor method
	 * @param file receive the name of the file containing the grid to read 
	 */
	public Sudoku(String file) {
		this.filePath = Paths.get("data", file);
		
		// initialize the grid
		this.readGrid(this.filePath);
	}
	
	
	/**
	 * Display the grid in the terminal
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
	
	
	/*
	 * Find an empty cell in the grid and return a Position object storing the coordinates in the matrix (row, col)
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
	
	
	/*
	 * Method to check if a specific number is valid on a given position
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
	
	/*
	 * Solve the sudoku grid and print the solutions up to 2 is available.
	 */
	public void solve() {
		
		// Find an empty cell
		Position emptyCell = findEmpty();
		
		// If not empty cell is found, the puzzle is over. If 2 solution have been found, stop the function.
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
}
