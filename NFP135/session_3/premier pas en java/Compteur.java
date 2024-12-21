/*
 * Commentaires du Fichier  Compteur java :
 *  -------------------------------------
 *
 * Ce programme vous permettra de verifier que vous disposez d'un
 * environnement de developpement en Java qui est en etat de marche.
 *
 *   Pour compiler ce programme java vous devez tapper la commande suivante :
 * javac -cp . Compteur.java
 *
 *   Pour executer ce programme java :
 * java -cp .  Compteur
 *
 *
 * Ce programme va nous servir de pretexte pour mettre en oeuvre
 *  nos connaissances sur la representation en complement a deux
 *   des entiers relatifs.
 *
 * Afin de pouvoir manipuler des entiers,
 *  Java definit le type entier( int ) qui nous permet de stocker
 *   entiers relatifs sur 32 bits
 *    entiers qui ont donc une valeur qui peut varier
 *     de -2 147 483 648       a    +2 147 483 647 inclus
 *
 *       ex: int i = 0 ; // declare la variable i de type entier signe et lui
 *                       //  affecte la valeur zero.
 *
 *  Java definit le type octet( byte ) qui nous permet de representer des
 *   entiers relatifs sur 8 bits
 *    entiers qui ont donc une valeur qui peut varier
 *     de -128       a    +127 inclus
 *       ex: byte monOctet = -12 ; // declare la variable monOctet de type octet
 *                                  //  et lui affecte la valeur moins douze
 *
 *
 *  Java definit le type caractere( char ) qui nous permet de representer des
 *   entiers relatifs sur 16 bits
 *    entiers qui ont donc une valeur qui peut varier
 *     de -32768       a    +32767 inclus
 *       ex: char monChar = 'A' ; // declare la variable monChar de type caractere
 *                                //  et lui affecte la valeur soixante-cinq
 *                                //   ce qui est le code ASCII du 'A' majuscule
 * 
 */







/*
 * Commentaires de la classe Compteur :
 *  Cette classe est rudimentaire puisqu'elle ne possede que trois methodes
 *   qui sont les methodes main()    compteurByte()   et  compteurChar()
 *  On a mis en gras les mots cles reserves (propres au langage Java).
 */
public class Compteur {




	/*
	 * Commentaires de la methode main() :
	 *  Cette methode est le point d'entree du programme : c'est elle qui va
	 *    etre appelee quand vous executerez java -cp . Compteur
	 *  Cette methode est une fonction qui prend en argument une
	 *   variable    (String args[]).
	 *    (qui est un tableau de chaines de caracteres) dont nous
	 *    n'allons pas nous servir ici, mais que Java nous impose de declarer.
	 *  Cette fonction ne retourne pas de valeur : c'est une procedure
	 *   (ce qui est indique par le mot clef void)
	 *
	 *  Cette methode ne fait qu'appeler deux autres methodes :
	 *	compteurByte();
	 *	compteurChar();
	 */
	public static void main ( String[] args ) {
		compteurByte();
		compteurChar();
	} 




	/* Commentaires de la methode compteurByte() :
	  La procedure compteurByte() affiche ceci :
	iteration 0 compteur vaut 0 en binaire 0
	iteration 1 compteur vaut 1 en binaire 1
	iteration 2 compteur vaut 2 en binaire 10
	iteration 3 compteur vaut 3 en binaire 11
	...
	iteration 33 compteur vaut 33 en binaire 100001
	iteration 34 compteur vaut 34 en binaire 100010
	...
	iteration 127 compteur vaut 127 en binaire 1111111
	iteration 128 compteur vaut -128 en binaire 11111111111111111111111110000000
	iteration 129 compteur vaut -127 en binaire 11111111111111111111111110000001
	...
	iteration 254 compteur vaut -2 en binaire 11111111111111111111111111111110
	iteration 255 compteur vaut -1 en binaire 11111111111111111111111111111111
	iteration 256 compteur vaut 0 en binaire 0
	iteration 257 compteur vaut 1 en binaire 1
	...
	*/
	public static void compteurByte() {
		byte compteur = 0 ;	// declaration et initialisation
						// de la variable compteur
						// qui est de type byte
		for (int i=0 ; i< 550 ; i++) {
			System.out.println("iteration " + i + " compteur vaut " + compteur + " en binaire " + Integer.toBinaryString(compteur)  );
			compteur++;
		}
	}




	/* Commentaires de la methode compteurChar() :
	 *
	 *  La fonction compteurChar() affiche ceci :
		...
		iteration 33 compteur vaut ! en binaire 100001
		iteration 34 compteur vaut " en binaire 100010
		iteration 35 compteur vaut # en binaire 100011
		iteration 36 compteur vaut $ en binaire 100100
		...
	*/
	public static void compteurChar() {
		char compteur = 0 ;
		for (int i=0 ; i< 550 ; i++) {
			System.out.println("iteration " + i + " compteur vaut " + compteur + " en binaire " + Integer.toBinaryString(compteur)  );
			compteur++;
		}

	}

}
