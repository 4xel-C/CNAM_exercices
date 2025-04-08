package recursion;

public class App {
	
	public static void main(String[] agrs) {
		
		System.out.println("Test de l'algorithme Fibonacci:");
		System.out.println();
		System.out.println("Test méthode recursive: ");
		System.out.println("n = 4 : " + Fibonacci.fibonacciParRecursion(4));
		System.out.println("n = 6 : " + Fibonacci.fibonacciParRecursion(6));
		
		System.out.println();
		System.out.println("Test méthode itérative: ");
		System.out.println("n = 4 : " + Fibonacci.fibonacciParIteration(4));
		System.out.println("n = 6 : " + Fibonacci.fibonacciParIteration(6));
		System.out.println();
		System.out.println();
		
		System.out.println("Test de l'algorithme SomeCarrés: ");
		System.out.println();
		System.out.println("Test méthode recursive: ");
		System.out.println("n = 3 : " + SommeCarrés.sommeCarrésRecursion(3));
		System.out.println("n = 4 : " + SommeCarrés.sommeCarrésRecursion(4));
		System.out.println("n = 5 : " + SommeCarrés.sommeCarrésRecursion(5));
		
		System.out.println();
		System.out.println("Test méthode itérative: ");
		System.out.println("n = 3 : " + SommeCarrés.sommeCarrésIteratif(3));
		System.out.println("n = 4 : " + SommeCarrés.sommeCarrésIteratif(4));
		System.out.println("n = 5 : " + SommeCarrés.sommeCarrésIteratif(5));
		System.out.println();
		System.out.println();
		
		
		System.out.println("Création de 3 personnes...");
		Personne Marc = new Personne("Marc", 1000);
		System.out.println(Marc.nom);
		
		Personne Lucienne = new Personne("Lucienne", 1500);
		System.out.println(Lucienne.nom);
		
		Personne Bruno = new Personne("Bruno", 2300);
		System.out.println(Bruno.nom);
		
		
		System.out.println("Test de compareTo basé sur le salaire:");
		System.out.println("Lucienne gagne : " + Lucienne.salaire);
		System.out.println("Bruno gagne : " + Bruno.salaire);
		
		if (Lucienne.compareTo(Bruno) < 0) {
			System.out.println("Bruno gagne plus que Lucienne.");
		} else if (Lucienne.compareTo(Bruno) > 0) {
			System.out.println("Lucienne gagne plus que Bruno.");
		} else {
			System.out.println("Bruno et Lucienne ont le même salaire.");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Création d'une fille d'attente basé une ListLisp.");
		FileParListLisp<Personne> file = new FileParListLisp<>();
		
		System.out.println("Ajout de Bruno, puis Lucienne, puis, Marc.");
		file.enfile(Bruno);
		file.enfile(Lucienne);
		file.enfile(Marc);
		
		System.out.println("Première personne à sortir de la file: " + file.head().nom);
		file.defiler();
		
		System.out.println("Seconde personne à sortir de la file: " + file.defiler());
		
		System.out.println("Troisième personne à sortir de la file: " + file.defiler());
		
		System.out.println();
		System.out.println("La file est elle vide ? ");
		
		if (file.estVide()) {
			System.out.println("oui");
		} else {
			System.out.println("Non");
		}
		
		
		
		
	}

}
