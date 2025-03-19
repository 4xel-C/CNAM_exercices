package structures;

public interface File<T> {
	
	boolean estVide();
	void enfiler(T e);
	void defiler();
	T getPremier();
	void printFile();
	
}
