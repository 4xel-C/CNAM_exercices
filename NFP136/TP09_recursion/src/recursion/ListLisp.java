package recursion;

public interface ListLisp<T extends Comparable<T>> {
	
	ListLisp<T> cons(T e);  // Add the element e to the list
	T head();				// Return the first element of the list
	ListLisp<T> tail();	    // Return the list without the first element
	int longueur();		    // Return the length of the list
	boolean member(T x);    // Check if object x is contained inside the list.
}
