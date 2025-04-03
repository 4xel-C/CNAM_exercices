

/**
 * Classe représentant une position d'une variable dans le Sudoku. 
 * Utilisé pour garder en mémoire la rangée et la colonne d'une cellule
 * ainsi que sa 'subRow' et 'subCol' qui représentent la position de la zone carré plus petite de taille 3x3
 */
public class Position {
	/**
	 * La rangée de la cellule considérée.
	 */
	public final int row;
	/**
	 * La colonne de la cellule considérée.
	 */
	public final int col;
	
	/**
	 * La rangée du carrée 3x3 dans lequel est présente la cellule.
	 */
	public final int subRow;
	
	/**
	 * La colonne du carrée 3x3 dans lequel est présente la cellule.
	 */
	public final int subCol;
	
	/**
	 * Méthode constructeur de la classe Position permettant d'initialiser les variables row, col et de calculer les variables subRow et subCol.
	 * @param row La rangée de la cellule
	 * @param col La colonne de la cellule 
	 */
	public Position(int row, int col) {
		this.row = row;
		this.col = col;
		this.subRow = row / Sudoku.subSquareSize;	// dividing by the size of the subsquare in an integer to round to the previous number (floor division)
		this.subCol = col / Sudoku.subSquareSize;
	}
}
