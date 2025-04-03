import java.io.FileNotFoundException;

/**
 * Classe principale du projet Sudoku. Appelle les classes et les méthodes nécessaires au fonctionnement du programme et à la résolution du Sudoku.
 */
public class MonSudoku {
	
	/**
	 * Méthode main, point d'entrée du programme pour la résolution d'un Sudoku.
	 * @param args Les arguments passés au programme. Le programme est censé recevoir le nom du fichier texte contenant la grille de sudoku.
	 * Une grille d'exemple est proposé sous le nom  "grille1.txt".
	 * @throws FileNotFoundException Si le fichier spécifié n'est pas trouvé.
	 * @author Axel Cano
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		if (args.length != 1) {
			System.out.println("Wrong usage. Usage: java MonSudoku fileName.txt");
			System.exit(0);
		}
		String file = args[0];
		
		// creation of the Sudoku object		
		Sudoku sudoku = new Sudoku(file);
		
		System.out.println();
		System.out.println("Lecture de la grille d'entrée:");
		sudoku.printGrid();
		
		System.out.println();
		sudoku.solve();
	}
}