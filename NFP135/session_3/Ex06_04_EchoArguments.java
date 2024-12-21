/*
 * Ex06_04_EchoArguments.java
 * version v1.0.3
 *
 *
 * La classe Ex06_04_EchoArguments va nous permettre d'afficher les arguments passes en parametre du programme.
 *
 *  Pour compiler le programme :
 *  javac -cp . Ex06_04_EchoArguments.java
 *
 *  Pour ex�cuter le programme avec des arguments :
 *  java -cp . Ex06_04_EchoArguments argument1 param2 trois
 *
 */


public class Ex06_04_EchoArguments {


	/*
	 * La m�thode "main" est le "point d'entr�e" du programme.
	 *   args   est un tableau de chaines de caracteres contenant les  param�tres  passes � l'appel du programme.
	 *    par exemple si on appelle ainsi le programme     java  Ex06_04_EchoArguments UN 02 Trois bonsoir
	 *      alors  il affichera ceci :
	 *         Invocation du programme  Ex06_04_EchoArguments avec les arguments suivants :
     *          l'arguement n� 0 est un
	 *          l'arguement n� 1 est 02
	 *          l'arguement n� 2 est Trois
	 *          l'arguement n� 3 est bonsoir
	 */
	public static void main(String[] args) { // debut du main
		System.out.print( "Invocation du programme  Ex06_04_EchoArguments");
		if (args.length>0) {
			System.out.println( " avec les arguments suivants :" );
			for (int argX=0 ; argX < args.length ; argX++ ) {
				System.out.println( " l'argument n' "+ argX + " est " + args[argX] );
			}
		} else {
			System.out.println( " sans aucun parametre." );
		}
	} // fin du main

} // fin du programme


