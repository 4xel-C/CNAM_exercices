package sudoku;

public class Position {
	public final int row;
	public final int col;
	public final int subRow;  // the subrow represent the position of the smaller subsquare of the sudoku
	public final int subCol;
	
	public Position(int row, int col) {
		this.row = row;
		this.col = col;
		this.subRow = row / Sudoku.subSquareSize;	// dividing by the size of the subsquare in an integer to round to the previous number (floor division)
		this.subCol = col / Sudoku.subSquareSize;
	}
}
