/*
 * Ex06_02_StructuresDeControle.java
 * version v1.0.3
 *
 *
 * La classe Ex06_02_StructuresDeControle va nous permettre d'utiliser les structures de controle.
 *
 *  Pour compiler le programme :
 *  javac -cp . Ex06_02_StructuresDeControle.java
 *
 *  Pour ex�cuter le programme sans argument :
 *  java -cp . Ex06_02_StructuresDeControle
 *
 */


public class Ex06_02_StructuresDeControle {



	/*
	 * La m�thode "main" est le "point d'entr�e" du programme.
	 */
	public static void main(String[] args) {


		int entier01DePorteeLaMethodeMain = 1 ; // Declare et initialise la variable "entier01DePorteeLaMethodeMain"    de type primitif "int".
		                                        //  Cette variable est locale a la methode main()
		                                        //   Quel est le scope de cette variable  ? : cette variable n'est visible que de la methode main()
		                                        //                             mais elle est visible de n'importe quel endroit de la methode main()


		{ // Debut du bloc

			// demo de l'affectation
			int b ; // declare la variable b de type primitif "int". (on ne sait pas ce que vaut b)
			b = 2 ; // affecte la valeur 2 a la variable b

		// ici la variable b vaut 2

			b = 2 + 1 ;
		// ici la variable b vaut 3

			b = 2 - 1 ;
		// ici la variable b vaut 1


			b = 1 + 1 ;
		// ici la variable b vaut 2


		} // Fin du bloc

		 /* en dehors du bloc la variable b n'est plus d�finie
		  *  donc on n'a plus le droit de l'utiliser
		  *   decommenter la ligne suivante procoquerait un erreur a la compilation */
		// b = 2 ; // on ne peut referencer que les variables definies




		{ // Debut du bloc de demo de l'affectation
			int a ; // declare la variable a de type "int". (on ne sait pas ce que vaut a)
			int b ; // declare la variable b de type "int". (on ne sait pas ce que vaut b)
			a = 2 ; // affecte la valeur 2 a la variable a
			b = a ; // ici la variable b vaut 2
			b = a + 1 ; // ici la variable b vaut 3
			b = a - 1 ; // ici la variable b vaut 1
			b = b + 1 ; // ici la variable b vaut 2

		} // Fin du bloc de demo de l'affectation


		{ // Debut du bloc de demo addition, soustraction, multiplication, division
			int monEntierAMoi ;
			int unAutreEntierAMoiAussi ;
			int encoreUnAutreEntier ;

			monEntierAMoi = (1 + 2 ) *  5  - 14 / 2  ; // affecte la valeur 8 a la variable  monEntierAMoi
			unAutreEntierAMoiAussi = monEntierAMoi / 2 ; // affecte la valeur 4 a la variable  unAutreEntierAMoiAussi
			encoreUnAutreEntier =  2 * (monEntierAMoi / 2) - (unAutreEntierAMoiAussi + 1 ) ; //  encoreUnAutreEntier vaut (-1)
		} // Fin du bloc de calcul d'un produit de deux variables

		{ // Debut du bloc de calcul d'un produit de deux variables
			int unCompteur ;
			int unAutreEntierAMoiAussi ;
			int encoreUnAutreEntier ;

			unCompteur = 4 ;
			unAutreEntierAMoiAussi = 2 ;
			encoreUnAutreEntier = unCompteur *  unAutreEntierAMoiAussi ;
		} // Fin du bloc de calcul d'un produit de deux variables



		/****************************/
		/* La portee d'une variable */
		/****************************/

		{ // Debut de bloc de premier niveau

			/*
			 * Attention Java est sensible a la casse
			 *  les variables "b" et "B" sont deux variables differentes
			 */

			int b ; // declare la variable b de type "int".

			b = 3 ;

		// ici la variable b est definie et vaut 3
		//   ....

			entier01DePorteeLaMethodeMain = 2 ; // scope :la variable "entier01DePorteeLaMethodeMain" est visible dans toute la methode main()

			{ // Debut de bloc de second niveau

				int B ; // declare la variable B
				B=2;

				// ici B vaut 2

				b = 4 ; // ici la variable b est encore definie
				// b vaut 4

				B = b + 1 ;
				// ici B vaut 5

				entier01DePorteeLaMethodeMain = 3 ; // scope :la variable "entier01DePorteeLaMethodeMain" est visible dans toute la methode main()

			} // Fin de bloc de second niveau

			// ici la variable B n'est pas definie
			// ici la variable b est encore definie et b vaut 4

			/*
			 *  on ne peut referencer que les variables definies
			 *  en dehors du bloc la variable B n'est plus d�finie
			 *  donc on n'a plus le droit de l'utiliser
			 *   decommenter la ligne suivante procoquerait un erreur a la compilation */
			// B=2;   // erreur car ici B Majuscule n'est pas defini

			// (ici la variable B n'est pas definie)

		// (ici la variable b est encore definie et b vaut 4)


			b = 2 ;  //  OK car b minuscule est encore definie

		} // Fin du bloc de premier niveau








		/************************************/
		/* Incr�mentation et d�cr�mentation */
		/************************************/

		{ // Debut de bloc

			int i = 0 ; // declare la variable i de type "int" et lui affecte la valeur 0

			i = i + 1 ; // incrementation de la variable i
			// ici i vaut 1


			i = i + 1 ; // incrementation de la variable i
			// ici i vaut 2


			i = i + 1 ; // incrementation de la variable i
			// ici i vaut 3


			i = i - 1 ; // decrementation de la variable i
			// ici i vaut 2

			i = i - 1 ; // decrementation de la variable i
			// ici i vaut 1

			i = i - 1 ; // decrementation de la variable i
			// ici i vaut 0

			i = i - 1 ; // decrementation de la variable i
			// ici i vaut -1

			i = i - 1 ; // decrementation de la variable i
			// ici i vaut -2


		} // Fin du bloc


		/************************************************/
		/* Incr�mentation et d�cr�mentation automatique */
		/************************************************/

		{ // Debut de bloc

			int i = 0 ; // declare la variable i de type "int" et lui affecte la valeur 0

			i++ ; // incrementation de la variable i
			// ici i vaut 1


			i++ ; // incrementation de la variable i
			// ici i vaut 2


			i++ ; // incrementation de la variable i
			// ici i vaut 3


			i-- ; // decrementation de la variable i
			// ici i vaut 2

			i-- ; // decrementation de la variable i
			// ici i vaut 1

			i-- ; // decrementation de la variable i
			// ici i vaut 0

			i-- ; // decrementation de la variable i
			// ici i vaut -1

			i-- ; // decrementation de la variable i
			// ici i vaut -2


		} // Fin du bloc





		/******************************/
		/* Les Structures de controle */
		/******************************/

		/*
		 *  SI ( condition est vraie)
		 *  ALORS  faire ceci
		 *  SINON  faire cela
		 *  FIN_SI
		 */
		/*
		 *  IF ( condition is true)
		 *  THEN  do this
		 *  ELSE  do that
		 *  END_IF
		 */

		{ // Bloc de demo d'un test conditionnel
			int i = 1 ;
			int j = 2 ;

			if ( i > j ) { // SI ( i est strictement superieur a j )
				System.out.println("i est plus grand que j");   // ALORS afficher ce message ci
			} else {        // SINON
				System.out.println("j est sup�rieur ou �gal � i"); // afficher ce message la
			} // FIN_SI

		} // Bloc de demo d'un test conditionnel




		/*
		 *  SI ( ( condition1 est vraie) ET (( condition2 est vraie) OU ( condition3 est vraie) ) )
		 *  ALORS  faire ceci
		 *  SINON  faire cela
		 *  FIN_SI
		 */
		{ // Bloc de demo du test d'une expression booleenne plus complexe
			boolean condA = true ; // variable booleenne condition A est vraie
			boolean condB = false ; // variable booleenne condition B est fausse
			boolean condC = true ; //

			if ( ( condA && ( condB || condC ) ) ) { // SI  condA et au moins l'une des conditions condB ou condC
				System.out.println("CondA et au moins une des 2 autres conditions sont r�alis�es");   // ALORS afficher ce message ci
			} else {        // SINON
				System.out.println(" (!CondA || (!condB && !condC)) est vrai"); // afficher ce message la
			} // FIN_SI

		} // Bloc de demo du test d'une expression booleenne plus complexe





		/* Il est possible d'imbriquer des tests */

		/*
		 *  SI ( condition1 est vraie)
		 *  ALORS  faire action1
		 *  SINON SI ( condition2 est vraie)
		 *        ALORS  faire action2
		 *        SINON  faire action3
		 *        FIN_SI
		 *  FIN_SI
		 */
		/*
		 *  IF ( condition is true)
		 *  THEN  do this
		 *  ELSE  do that
		 *  END_IF
		 */

		{ // Bloc de demo d'un test conditionnel
			int nbBonbons = 1 ;
			int nbEnfants = 2 ;

			if ( nbEnfants != 0 ) { // SI ( nbEnfants est non nul )

				if ( nbBonbons / nbEnfants > 0 ) { // SI ( plus de bonbons que d'enfants )
					System.out.println("distribution de " + nbBonbons / nbEnfants + " bonbon(s) par enfant");   // ALORS afficher ce message ci
				} else {        // SINON
					System.out.println("Ne faisons pas de jaloux"); // afficher ce message la
				} // FIN_SI
			} else {        // SINON
				System.out.println("Pas d'enfant, pas de bonbon"); // afficher ce message la
			} // FIN_SI

		} // Bloc de demo d'un test conditionnel




		{ // Bloc de demo de la boucle Pour (en anglais : for )

			// calcul de la somme des N premiers entiers
			int n = 23 ;
			int somme = 0 ;

			for (int i=1 ; i < n ; i++ ) { // debut de boucle for
				somme = somme + i ;
				System.out.println("i = " + i ); // affiche la valeur de  i (cela ne change pas la valeur de i).
				System.out.println("somme = " + somme ); // affiche la valeur de  somme (cela ne change pas la valeur de somme).
			} // fin de la boucle for



		} // Bloc de demo de la boucle for



		entier01DePorteeLaMethodeMain = 4 ; // scope :la variable "entier01DePorteeLaMethodeMain" est visible dans toute la methode main()


        /***********************************************************************************************/
		/*
		 *  Travaux Pratiques
		 *  -----------------
		 *  TP :  en vous aidant du site http://www.commentcamarche.net/contents/552-java-les-structures-conditionelles
		 *          completez le code de cette mehode main()
		 *          1)  en creant un bloc supplementaire dans lequel vous utiliserez un for
		 *                imaginez un exemple qui utilise les mots cles suivants : ( for ,  if , continue ,   break )
		 *
		 *          2)  en creant un bloc supplementaire dans lequel vous utiliserez un while ( en francais "tant que" )
		 *                imaginez un exemple qui utilise les mots cles suivants : ( while ,  if , continue ,   break )
		 *
		 *          3)  en creant un bloc supplementaire dans lequel vous utiliserez un switch
		 *                imaginez un exemple qui utilise les mots cles suivants : ( switch ,  case , break , default )
		 *
         */
        /***********************************************************************************************/

		// TP 1: Création d'un bloc de code utilisant for, if, continue, break pour déterminer si un nombre est premier ou non
		{

			// initialisation d'un entier:
			int nbre = 17;

			// si i pair: le nombre n'est pas premier et ne pas lancer la boucle
			if (nbre % 2 == 0) {
				System.out.println("Le nombre " + nbre + " est divisible par 2 et n'est pas premier!");
			} 
			
			else {
				// debut de la boucle for itérant de 2 au nombre cible
				for (int i = 3; i <= nbre; i++) {
					
					// si i divise le nombre alors nbre n'est pas premier
					if (nbre % i == 0 && i != nbre) {
						System.out.println("Le nombre " + nbre + " n'est pas premier car il est divisible par " + i);
						break;
					}

					// si le nombre n'est pas divisible par i, continuer l'itération
					else if (nbre % i != 0 && i != nbre) {
						continue;
					}
					
					// si le nombre n'a jamais pu être divisé et i est arrivé au nbre: conclure
					else {
						System.out.println("Le nombre " + nbre + " est premier!");
					}
				}

			}
		}
		// TP 1: Fin du bloc de code utilisant for, if, continue, break pour déterminer si un nombre est premier ou non


		// TP2: utilisation de while , if , continue, break pour l'utilisation de While.
		{
			// initialisation de cookies
			int cookies = 4;

			// initialisation d'un counter à 0
			int count_cookies = 0;

			// debut de la boucle
			while (true) {
				// Si plus de cookies, sortir de la boucle
				if (cookies == 0){
					System.out.println("Il n'y a plus de cookies ! :(");
					break;
				}
				else if (count_cookies < 5) {
					cookies--;
					System.out.println("je mange un cookie!");
					count_cookies++;
					continue;
				}
				System.out.println("Trop de cookies, j'ai mal au ventre ! :(");
				break;
		}
	}
	// TP2: fin du bloc d'utilisation de while, if, continue, break pour l'utilisation de While.
	

	// TP3: Creation d'un bloc de code utilisaant switch, case, break, default
	{
		// initialization de la variable voiture
		String voiture = "rouge";

		switch (voiture) {
			case "rouge":
				System.out.println("Ma voiture est rouge!");
				break;

			case "bleu":
				System.out.println("Ma voiture est bleu!");
				break;

			case "verte":
				System.out.println("Ma voiture est verte!");
				break;

			case "jaune":
				System.out.println("Ma voiture est verte!");
				break;

			default:
				System.out.println("Ma voiture est noire!");
		}
	}
	// TP3: Fin du bloc creation d'un bloc de code utilisaant switch, case, break, default

	} // fin de la methode main()



} // fin de la classe


