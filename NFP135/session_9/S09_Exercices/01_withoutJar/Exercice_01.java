/*
 * Exercice_01.java
 * version v1.0.4
 *
 *
 * Exercice 1 : Table de 9 
 * ------------------------
 *
 * Enoncé :
 *
 * Ecrire l'algorithme permettant d'afficher la table de multiplication par 9.
 * 	Exemple : 0 9 18 27 ... 81 90
 *
 *
 * Un algorithme solution :
 *
 * 	Variables N, i en Entier
 * 	Début
 * 		N <- 9
 * 		Ecrire "La table de multiplication de ce nombre est : "
 * 		Pour i de 0 à 10
 * 			écrire N, " x ", i, " = ", n*i
 * 		i Suivant
 * 	Fin
 *
*/



/*
 * La classe Exercice_01 va nous permette d'implémenter en JAVA l'algorithme ci-dessus.
 *
 *  Pour compiler le programme :
 *  javac Exercice_01.java
 *
 *  Pour exécuter le programme :
 *  java -cp . Exercice_01
 *
 *  le programme affichera ceci
 *  La table de multiplication de ce nombre est :
 *  9 x 0 = 0
 *  9 x 1 = 9
 *  9 x 2 = 18
 *  9 x 3 = 27
 *  9 x 4 = 36
 *  9 x 5 = 45
 *  9 x 6 = 54
 *  9 x 7 = 63
 *  9 x 8 = 72
 *  9 x 9 = 81
 *  9 x 10 = 90
 *
 */
public class Exercice_01 {


	/*
	 * La fonction "main" est le "point d'entrée" du programme.  (Le mot anglais "main" signifie principal).
	 * C'est cette fonction qu'appelle la machine virtuelle java (la "JRE: Java Runtime Environment") lorsqu'on invoque le programme par "java -cp . Exercice_01"
	 * Le "prototype" de cette fonction est "public static void main(String[] args)"
	 * Cette fonction est "public" : c'est_à dire qu'elle peut être appelée par n'importe quelle fonction de n'importe quelle "class" java.
	 * Cette fonction est "static" : c'est_à dire qu'il n'est pas nécessaire d'instancier la classe "Exercice_01" pour pouvoir l'appeler
	 * Cette fonction ne renvoie aucune valeur (ni un int, ni une String, ni...) :  "void" c'est à dire rien
	 * Cette fonction prend en argument un tableau de chaines de caractères ("String[]") ce tableau s'appelle "args".
	 *   Si on invoquait depuis DOS le programme par la commande "java -cp . Exercice_01 arg0 argument1 parametre2 valeur3"
	 *   alors  args[0] vaudrait "arg0" , args[1] vaudrait "argument1"  , args[2] vaudrait "parametre2"  , args[3] vaudrait "valeur3"
	 *   FinSi
	 *  -> On pourrait ainsi (dans une version future) généraliser ce programme afin qu'il affiche la table de notre choix : ex  "java -cp . Exercice_01 8"
	 *
	 */
	public static void main(String[] args) {
		afficheTableDu9(); // appelle la fonction   afficheTableDu9()
	}


	/*
	 * La fonction afficheTableDu9() est une implémententation de l'algorithme qui nous interesse.
	 *
	 * La "signature" de cette fonction est "public static void afficheTableDu9()"
	 * Cette fonction est "public" : c'est_à dire qu'elle peut être appelée par n'importe quelle fonction de n'importe quelle "class" java.
	 * Cette fonction est "static" : c'est_à dire qu'il n'est pas nécessaire d'instancier la classe "Exercice_01" pour pouvoir l'appeler
	 * Cette fonction ne renvoie aucune valeur (ni un int, ni une String, ni...) :  "void" c'est à dire rien
	 * Cette fonction ne prend aucun argument   ()
	 */
	public static void afficheTableDu9() {

		int N ;      // déclaration de la variable N qui contiendra le 'N' de la "table du 'N'"

		int i ;      // déclaration de la variable i va nous servir à itérer de 0 à 10

		N = 9 ;      // affectation de 'N' à la valeur 9 :

		System.out.println("La table de multiplication du neuf est : "); // affichage du nom de la "Table"

		for (i=0 ; i<=10 ; i++ ) { // boucle d'iteration sur les differentes valeurs de i

			System.out.println( N + " x " + i + " = " + N*i ); // affichera par exemple  "9 x 3 = 27"

		}// Fin de la boucle d'iteration sur les differentes valeurs de i

	}// Fin de la methode "afficheTableDu9()"

} // Fin de la classe "Exercice_01"

