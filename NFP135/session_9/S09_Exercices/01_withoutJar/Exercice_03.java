/*
 * Exercice_03.java
 * version v1.0.4
 *
 *
 * Exercice 3 : Calcul du maximum dans l'immédiat 
 * ----------------------------------------------
 *
 * Enoncé :
 *
 *	Ecrire l'algorithme qui permet d'imprimer le maximum de n entiers positifs donnés au fur et à
 *	mesure. A chaque saisie utilisateur d'un nombre, le programme retourne le maximum.
 *	Le programme s'arrête automatiquement au bout des n saisies.
 *
 *
 * Un algorithme solution :
 *
 *	Variables N, PG, saisie en Entier
 *	Début
 *		N <- n
 *		PG <- 0
 *		TantQue N > 0
 *			Ecrire "Entrez un nombre : "
 *			Lire saisie
 *			Si saisie > PG Alors
 *				PG <- saisie
 *			FinSi
 *			N <- N-1
 *		FinTantQue
 *		Ecrire "Le nombre le plus grand est : ", PG
 *	Fin
 *
*/


/*
 * La classe Exercice_03 va nous permettre d'implémenter en JAVA l'algorithme ci-dessus.
 *
 *  Pour compiler le programme :
 *  javac -cp . Exercice_03.java
 *
 *  Pour exécuter le programme sans argument :
 *  java -cp . Exercice_03
 *
 *  le programme affichera ceci
 *
 *	Entrez un nombre : 3
 *	Entrez un nombre : 5
 *	Le nombre le plus grand est : 5
 *
 *
 *  Pour exécuter le programme avec un argument :
 *  java -cp . Exercice_03 3
 *
 *	Entrez un nombre entier : 4
 *	Entrez un nombre entier : 1
 *	Entrez un nombre entier : 6
 *	Le nombre le plus grand est : 6
 *
 *
 *
 *  Test du comportement du programme en cas d'argument incorrect :
 *	java -cp . Exercice_03 un deux trois
 *	un
 *	deux
 *	trois
 *	Erreur fatale : L'argument doit etre un entier
 *	Usage : Exercice_03 [<nombre d'entiers a tester>]
 *
 *
 *
 */

import java.util.Scanner; //Ceci importe la classe "Scanner" qui se trouve dans le package java.util

public class Exercice_03 {


	static final int N_DEFAULT_VALUE = 2 ; // on dit que par defaut on veut examiner 2 valeurs

	/*
	 * La fonction "main" est le "point d'entrée" du programme.  (Le mot anglais "main" signifie principal).
	 * On va l'utiliser pour determiner le nombre d'entiers que l'on veut examiner
	 *
	 * C'est cette fonction qu'appelle la machine virtuelle java (la "JRE: Java Runtime Environment") lorsqu'on invoque le programme par "java -cp . Exercice_03"
	 * Le "prototype" de cette fonction est "public static void main(String[] args)"
	 * Cette fonction est "public" : c'est_à dire qu'elle peut être appelée par n'importe quelle fonction de n'importe quelle "class" java.
	 * Cette fonction est "static" : c'est_à dire qu'il n'est pas nécessaire d'instancier la classe "Exercice_03" pour pouvoir l'appeler
	 * Cette fonction ne renvoie aucune valeur (ni un int, ni une String, ni...) :  "void" c'est à dire rien
	 * Cette fonction prend en argument un tableau de chaines de caractères ("String[]") ce tableau s'appelle "args".
	 *   Si on invoquait depuis DOS le programme par la commande "java -cp . Exercice_03 arg0 argument1 parametre2 valeur3"
	 *   alors  args[0] vaudrait "arg0" , args[1] vaudrait "argument1"  , args[2] vaudrait "parametre2"  , args[3] vaudrait "valeur3"
	 *   FinSi
	 *
	 *  En l'ocurrence, nous souhaitons que l'utilisateur puisse (eventuellement) fournir un seul argument : le nombre de valeurs à comparer qu'il va saisir.
	 *
	 */
	public static void main(String[] args) {


		int N = N_DEFAULT_VALUE ; // valeur par defaut // le nb de valeurs qu'on doit examiner

		if (args.length > 0) { // l'utilisateur a-t-il fourni le nombre N en argument ?

			for (String s: args) { // boucle : Pour le fun : on affiche les arguments de la ligne de commande
				System.out.println(s);
			} // fin boucle : Pour le fun : on affiche les arguments de la ligne de commande


			try { // on va essayer d'interpreter comme un nombre la chaine passee en argument de la ligne de commande

				N = Integer.parseInt(args[0]); // affecte a N le nb passé au programme

			} catch (NumberFormatException e) { // on n'a pas reussi !
				System.err.println("Erreur fatale : L'argument doit etre un entier"); // message d'erreur
				System.err.println("Usage : Exercice_03 [<nombre d'entiers a tester>]"); // affiche l'aide en ligne
				System.exit(1); // arrete l'execution du programme !!!!
			}


		} // fin du test: l'utilisateur a-t-il fournit le nombre N en argument ?

		int max = maximumDansLImmediat(N); // appelle la fonction   maximumDansLImmediat()

	} // fin du main()


	/*
	 * La fonction maximumDansLImmediat() est une implémententation de l'algorithme qui nous interesse.
	 *
	 *  admet en parametre n : entier : nombre de valeurs a examiner
	 *  retourne un entier : le maximum des nombres examines
	 *
	 */
	public static int maximumDansLImmediat(int n) { // definition de la methode maximumDansLImmediat()

		int i ;      // déclaration de la variable i va nous servir à itérer de n a 0

		int PG ;      // déclaration de la variable PG qui contiendra le maximum des valeurs examinees

		java.util.Scanner myScanner = new Scanner(System.in); // cree une "nouvelle" instance de la classe Scanner


		PG = 0 ; // on initialise avec le plus petit des maximum possibles : 0   (car les entiers naturels sont >= 0 )

		for (i=n ; i>0 ; i-- ) { // boucle d'iteration sur les differentes valeurs de i de n a 1

			System.out.print("Entrez un nombre entier : "); // affichage de l'invite de saisie

			int saisie = myScanner.nextInt(); // lecture de l'entier saisi par l'utilisateur du programme

			if ( saisie > PG ) { // tout le monde veut prendre sa place

				// System.out.println( saisie + " > " + PG ); // affichage pour la mise au point programme

				PG = saisie ;   // on change de champion

			}

		}// Fin de la boucle d'iteration sur les differentes valeurs de i


		System.out.println( "Le nombre le plus grand est : " + PG );


		return(PG) ; // la fonction retourne le PlusGrand

	}// Fin de la definition de la methode maximumDansLImmediat()

} // Fin de la classe "Exercice_03

          // Ceci est un commentaire de fin de ligne : il commence par deux slashes '//'

/* Ceci est
    un autre commentaire
     mais qui tient sur plusieurs lignes : il doit donc etre entouré par slash /  étoile *  et étoile * slash /
  */


