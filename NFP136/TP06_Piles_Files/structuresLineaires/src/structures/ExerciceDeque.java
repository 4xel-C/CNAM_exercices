package structures;

public class ExerciceDeque {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[10];
		
		Deque<Integer> deque = new DequeArray<>(array);
		
		System.out.println("Ajout de l'élément 1 puis 2 par la Queue:");
		deque.ajoutQueue(1);
		deque.ajoutQueue(2);
		deque.print();
		
		System.out.println("Ajout de l'élément 3 puis 4 par la Tete:");
		deque.ajoutTete(3);
		deque.ajoutTete(4);
		deque.print();
		
		System.out.println("Ajout de l'élément 5 par la Queue");
		deque.ajoutQueue(5);
		deque.print();
		
		System.out.println("Supression de 3 elements de la tete");
		deque.enleverTete();
		deque.enleverTete();
		deque.enleverTete();
		deque.print();
		
		System.out.println("Supression de 3 elements de la queue");
		deque.enleverQueue();
		deque.print();
		
		System.out.println("Ajout de 6 à la tete et de 7 à la queue");
		deque.ajoutTete(6);
		deque.ajoutQueue(7);
		deque.print();
	}

}
