package main;

import sudoku.Sudoku;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sudoku test = new Sudoku("grid.txt");
		test.printGrid();
		
		System.out.println();
		test.solve();

		

	}
}