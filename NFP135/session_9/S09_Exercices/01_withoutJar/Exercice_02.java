/*
 * Exercice_02.java
 * version v1.0.4
 *
 *
 * Exercice 2 : Compte à rebours 
 * -----------------------------
 *
 * Énoncé :
 *
 *	Écrire l'algorithme de la fonction qui, à partir d'un nombre entier positif n, affiche tous les nombres
 *	par ordre décroissant jusqu'à 0.
 *	Exemple : pour n=5, le résultat sera 5 4 3 2 1 0.
 *
 *
 * Un algorithme solution :
 *
 *	Variables n, i en Entier positif
 *	Début
 *		Écrire "Entrez un nombre : "
 *		Lire n
 *		Pour i de n à 0
 *		Écrire i, " "
 *		i Suivant
 *	Fin
 *
*/


/*
 * La classe Exercice_02 va nous permette d'implémenter en JAVA l'algorithme ci-dessus.
 *
 *  Pour compiler le programme :
 *  javac -cp . Exercice_02.java
 *
 *  Pour exécuter le programme :
 *  java -cp . Exercice_02
 *
 *  le programme affichera ceci
 *
 *	Entrez un nombre : 3
 *	3
 *	2
 *	1
 *	0
 *
 *
 *  Test du comportement du programme en cas de saisie incorrecte :
 *	java -cp . Exercice_02
 *	Entrez un nombre : pipo     <-!!!!!!!!!!!!!!!!!!!!!!!!!!!! SAISIE INCORRECTE : ce n'est pas un entier !!!!!!!!!!!
 *	Exception in thread "main" java.util.InputMismatchException
 *	        at java.util.Scanner.throwFor(Scanner.java:840)
 *	        at java.util.Scanner.next(Scanner.java:1461)
 *	        at java.util.Scanner.nextInt(Scanner.java:2091)
 *	        at java.util.Scanner.nextInt(Scanner.java:2050)
 *	        at Exercice_02.compteARebours(Exercice_02.java:69)
 *	        at Exercice_02.main(Exercice_02.java:51)
 *
 */

import java.util.Scanner; //Ceci importe la classe "Scanner" qui se trouve dans le package java.util

public class Exercice_02 {


	/*
	 * La méthode "main" est le "point d'entrée" du programme.
	 *
	 */
	public static void main(String[] args) {
		compteARebours(); // appelle la fonction   compteARebours()
	}


	/*
	 * La fonction compteARebours() est une implémententation de l'algorithme qui nous interesse.
	 *
	 */
	public static void compteARebours() { // definition de la methode compteARebours()

		int n ;      // déclaration de la variable n qui sera le depart du compte a rebours

		int i ;      // déclaration de la variable i va nous servir à itérer de 0 à 10

		java.util.Scanner myScanner = new Scanner(System.in);

		System.out.print("Entrez un nombre : "); // affichage de l'invite de saisie

		n = myScanner.nextInt(); // lecture de l'entier saisi par l'utilisateur du programme

		for (i=n ; i>=0 ; i-- ) { // boucle d'iteration sur les differentes valeurs de i

			System.out.println( i ); // affichera par exemple  "3"

		}// Fin de la boucle d'iteration sur les differentes valeurs de i

	}// Fin de la definition de la methode compteARebours()

} // Fin de la classe "Exercice_02"

          // Ceci est un commentaire de fin de ligne : il commence par deux slashes '//'

/* Ceci est
    un autre commentaire
     mais qui tient sur plusieurs lignes : il doit donc etre entouré par slash /  étoile *  et étoile * slash /
  */


