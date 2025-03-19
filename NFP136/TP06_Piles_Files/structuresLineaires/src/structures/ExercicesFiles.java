package structures;

public class ExercicesFiles {

	public static void main(String[] args) {
		
		System.out.println("Exercice 4: ");
		System.out.println();
		
		// Instanciation de l'array pour la file à 10 éléments
		Character[] arrayFile = new Character[10];
		
		// instanciation de la file
		File<Character> file = new FileArray<Character>(arrayFile);
		
		file.printFile();
		
		System.out.println("Ajout de l'élément A:");
		file.enfiler('A');
		file.printFile();
		
		System.out.println("Ajout de l'élément B puis C:");
		file.enfiler('B');
		file.enfiler('C');
		file.printFile();
		
		System.out.println("Sortie de l'élément A:");
		file.defiler();
		file.printFile();
		
		System.out.println("Ajout de l'élément D:");
		file.enfiler('D');
		file.printFile();
		
		System.out.println("Sorite de 3 éléments:");
		file.defiler();
		file.defiler();
		file.defiler();
		file.printFile();
		
		System.out.println("Ajout de l'élément E puis F, G, H, I, J, K, I");
		file.enfiler('E');
		file.enfiler('G');
		file.enfiler('H');
		file.enfiler('I');
		file.enfiler('J');
		file.enfiler('K');
		file.enfiler('I');
		file.printFile();
		
		System.out.println();
		System.out.println("==================");
		System.out.println("Exercice 5: ");
		
		// Instanciation de la nouvelle file
		Integer[] array2 = new Integer[10];
		FileArray<Integer> fileAleatoire = new FileArray<Integer>(array2);

		int nombreDeTirages = 10;
		
		for (int i = 0; i < nombreDeTirages; i++) {
			
			int nb = (int) (10 * Math.random());
			System.out.println("Nombre tiré: " + nb);
			
			if (nb % 2 == 0) {
				System.out.println("Nombre pair, ajout à la file.");
				fileAleatoire.enfiler(nb);
			} else {
				System.out.println("Nombre impair, défiler un élément de la liste.");
				fileAleatoire.defiler();
			}
			fileAleatoire.printFile();
			
		}

	}

}
