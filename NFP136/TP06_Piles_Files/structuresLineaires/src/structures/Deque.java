package structures;

public interface Deque<T> {
	
	boolean estVide();
	int getLongueur();
	
	void ajoutTete(T e);
	void ajoutQueue(T e);
	
	void enleverTete();
	void enleverQueue();
	
	T getTete();
	T getQueue();
	
	void print();
}
