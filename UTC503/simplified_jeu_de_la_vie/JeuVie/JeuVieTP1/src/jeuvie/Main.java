package jeuvie;

import controleur.Controleur;

public class Main {
	
	private static void createShallowSquare(int x, int y, int size, Bestiole b, Controleur c) {
		
		for (int i = 0; i <= size; i++) {
			c.setBestiole(b, x + i, y);
			c.setBestiole(b, x, y + i);
			c.setBestiole(b, x + size, y + i);
			c.setBestiole(b, x + i, y + size);
		}
	}
	
	private static void createSquare(int x, int y, int size, Bestiole b, Controleur c) {
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				c.setBestiole(b, x + i, y + j);
			}
		}
	}
	
	private static void createPyramid(int x, int y, int size, Bestiole b, Controleur c) {
		
		// base case
		if (size == 1) {
			c.setBestiole(b, x, y);
			return;
		}
		
		// draw the line
		for (int i = 0; i < size; i++) {
			c.setBestiole(b, x + i, y);
		}
		
		// recursively call the upper pyramid
		createPyramid(x + 1, y - 1, size - 2, b, c);
		
	}
	
	

	public static void main(String[] args) {
		
		// instanciation de la classe bestiole
		Bestiole b1 = new Bestiole("noire");
		Bestiole b2 = new Bestiole("rouge");
		Bestiole b3 = new Bestiole("verte");
		
		Controleur c = new Controleur();
		

		int size = 20;
		int x = 50 - size / 2;
		int y = 50 - size / 2;
		

		createPyramid(x, y, size, b3, c);



		
		
		
	}
}
