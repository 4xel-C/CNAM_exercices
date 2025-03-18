package structures;
import java.util.ArrayList;

public class PileArrayList<T> implements Pile<T> {
		
		// Declaration et creation de la liste pile dans la classe
		private ArrayList<T> pile = new ArrayList<>();
		
		public boolean estVide() {
			return pile.isEmpty();
		}
		
		public void push(T e) {
			pile.add(e);
		}
		
		public T getTop() {
			return pile.get(pile.size() - 1);
		}
		
		public T pop() {
			if (pile.size() == 0)throw new IllegalArgumentException("Pile vide!");
			return pile.remove(pile.size() - 1);
		}
		
		public int hauteur() {
			return pile.size();
		}
		
		public void renverse() {
			
			// temp to store the reversed array
			ArrayList<T> temp = new ArrayList<>();
			
			while (pile.size() > 0) {
				temp.add(pop());
			}
			
			pile = temp;
		}
	
		public void printPile() {
			for (int i = 0; i < pile.size(); i++) {
				System.out.println(pile.get(i));
			}
		}
	
}
