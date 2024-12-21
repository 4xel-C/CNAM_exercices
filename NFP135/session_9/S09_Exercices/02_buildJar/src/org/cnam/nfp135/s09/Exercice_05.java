package org.cnam.nfp135.s09 ;


/*
 * Exercice_05.java
 * version v1.2.6
 *
 *
 * Exercice 5 : Pesée de marchandise 
 * ---------------------------------
 *
 * Enoncé :
 *
 * 	Un épicier sert un client qui a demandé 1kg de pommes de terre. Il pèse successivement différentes
 * 	pommes de terre (une saisie utilisateur donne le poids en grammes de chaque pomme de terre
 * 	ajoutée) et s'arrête dès que le poids total égale ou dépasse 1kg. Donner le nombre de pommes de
 * 	terre dans le sac.
 *
 *
 * Un algorithme solution :
 *
 *	Variables N, i, PG, en Entier
 *	Début
 *		N <- 0
 *		PTG <- 0
 *		i <- 0
 *		TantQue PTG < 1000
 *			écrire "Entrez le poids de la pomme de terre ajoutee : "
 *			Lire N
 *			PTG <- PTG + N
 *			i <- i + 1
 *		FinTantQue
 *		écrire "Le nombre de patate(s) est : ", i
 *	Fin
 *
 */


/*
 * La classe Exercice_05 va nous permette d'implémenter en JAVA l'algorithme ci-dessus.
 *
 *  Pour compiler le programme :
 *  javac -cp . Exercice_05.java
 *
 *  Pour exécuter le programme sans argument :
 *  java -cp . Exercice_05
 *
 *  le programme affichera ceci
 *
 *	Entrez le poids de la pomme de terre ajoutee : 500
 *	Entrez le poids de la pomme de terre ajoutee : 432
 *	Entrez le poids de la pomme de terre ajoutee : 322
 *	Le nombre de patate(s) est : 3
 *
 *
 */

import java.util.Scanner; //Ceci importe la classe "Scanner" qui permet de lire les caracteres tappes au clavier

public class Exercice_05 {


	static final int MAX_PTG_DEMANDE = 1000 ; // le client veut 1000 grammes de Pommes de terre


	/*
	 * La méthode "main" est le "point d'entrée" du programme.
	 */
	public static void main(String[] args) {

		accumulePommesDeTerre();

	}


	/*
	 * La fonction accumulePommesDeTerre() est une implémententation de l'algorithme qui nous interesse.
	 */
	public static void accumulePommesDeTerre() {

		int i ;      // indice de la pomme de terre en cours de pesee

		int N ;      // Masse de la pomme de terre en cours de pesee

		int PTG  = 0 ;      // Poids Total en Grammes : 0 grammes pour l'instant

		java.util.Scanner myScanner = new Scanner(System.in); // cree une "nouvelle" instance de la classe Scanner qui va lire ce que tappe l'utilisateur au clavier


		for (i=0 ; PTG < MAX_PTG_DEMANDE ; i++ ) { // boucle d'iteration sur les pommes de terre

			System.out.print("Entrez le poids (en grammes) de la pomme de terre ajoutee : "); // affichage de l'invite de saisie

			N = myScanner.nextInt(); // lecture de l'entier saisi par l'utilisateur du programme

			PTG += N ; // ajoute a la somme PTG la masse N de la pomme de terre en cours

		}// Fin de la boucle d'iteration sur les differentes valeurs de i


		System.out.println( "Le nombre de patate(s) est : " + i );

	}

}


