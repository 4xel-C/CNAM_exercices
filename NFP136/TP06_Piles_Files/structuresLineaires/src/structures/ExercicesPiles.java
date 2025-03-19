package structures;

public class ExercicesPiles {
	
	/**
	 * Fonction Exercice 3.1. Vérifie si une chaîne de caractère est corectement parenthésé
	 * @param texte
	 * @return
	 */
	public static boolean estCorrectementParenthese(String texte) {
		
		// Instanciation de la pile pour traquer les parenthèses
		PileArrayList<Integer> pile = new PileArrayList<>();
		int len = texte.length();
		
		// Iteration sur chacun des caratères
		for (int i = 0; i < len; i++) {
			try {
				if (texte.charAt(i) == '(') {
					pile.push(1);
				} else if (texte.charAt(i) == ')') {
					pile.pop();
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Parenthèse fermante en trop");
				return false;
			}
		}
		
		if (pile.estVide()) {
			System.out.println("La chaîne de caratère est correctement parenthésée");
			return true;
		} else  {
			System.out.println("Il manque des parenthèses fermantes!");
			return false;
		}
	}
	
	/**
	 * Fonction pour calculer une expression RP ne contenant que des nombres positifs avec des additions ou des soustractions.
	 * @param expression
	 * @return Retourne le resultat sous forme d'entier, retourne 0 si l'expression est erroné.
	 */
	public static int calculerRPN(String expression) {
		
		// Instanciation de la pile pour traquer les nombres
		PileArrayList<Integer> pile = new PileArrayList<>();
		int len = expression.length();
		
		// Iteration sur chacun des caratères
		for (int i = 0; i < len; i++) {
			char car = expression.charAt(i);
			
			try {
				if (Character.isDigit(car)) {
					int chiffre = Character.getNumericValue(car);
					pile.push(chiffre);
					
				} else if (car == '+') {
					int result = pile.pop() + pile.pop();	
					pile.push(result);
					
				} else if (car == '-') {
					int num1 = pile.pop();
					int num2 = pile.pop();
					int result = num2 - num1;
					pile.push(result);
				}
				
			} catch (IllegalArgumentException e) {
				System.out.println("Expression invalide !");
				return 0;
			}
		}
		
		// Verifie si la pile contient 1 élément:
		if (pile.hauteur() == 1) {
			return pile.getTop();
			
		} else {
			System.out.println("Expression invalide !");
			return 0;
		}
	}
		
	

	public static void main(String[] args) {
		
		System.out.println("Test des fonctionnalités Exercice s1 et 2: ");
		
		// Instanciation de la pile 
		PileArrayList<Integer> pile = new PileArrayList<>();
		
		// Ajout de quelques éléments
		pile.push(1);
		pile.push(2);
		pile.push(3);
		pile.push(4);
		
		System.out.println("Taille de la pile: " + pile.hauteur());
		System.out.println("Impression de la pile: ");
		pile.printPile();
		
		System.out.println();
		System.out.println("Inversion de la pile");
		pile.renverse();
		System.out.println("Impression de la pile renversée");
		pile.printPile();
		
		System.out.println();
		System.out.println("Pop l'élément: " + pile.pop());
		System.out.println("Inversion de la pile");
		pile.printPile();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		System.out.println("Exercice 3.1");
		
		String texte1 = "(5 + 3)";
		System.out.println("Verification des parenthèses de: " + texte1);
		estCorrectementParenthese(texte1);
		System.out.println();
		
		String texte2 = "((5 + (3)))";
		System.out.println("Verification des parenthèses de: " + texte2);
		estCorrectementParenthese(texte2);
		System.out.println();
		
		String texte3 = "5 + 3)";
		System.out.println("Verification des parenthèses de: " + texte3);
		estCorrectementParenthese(texte3);
		System.out.println();
		
		String texte4 = "((5 + 3)";
		System.out.println("Verification des parenthèses de: " + texte4);
		estCorrectementParenthese(texte4);
		System.out.println();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		System.out.println("Exercice 3.2");
		String expression1 = "4 7 + 5 6 - -";
		System.out.println("Resolution de l'expression: " + expression1);
		System.out.println(calculerRPN(expression1));
		System.out.println();
		
		String expression2 = "3 4 7 + 5 6 - -";
		System.out.println("Resolution de l'expression: " + expression2);
		System.out.println(calculerRPN(expression2));
	}

}
