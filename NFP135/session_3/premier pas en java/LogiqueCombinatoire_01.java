 /*
 * Commentaires du Fichier  LogiqueCombinatoire_01 java :
 *  ---------------------------------------------------
 *
 * Ce programme vous permettra de verifier que vous disposez d'un
 * environnement de developpement en Java qui est en etat de marche.
 *
 *   Pour compiler ce programme java vous devez tapper la commande suivante :
 * javac -cp . LogiqueCombinatoire_01.java
 *
 *   Pour executer ce programme java :
 * java -cp . LogiqueCombinatoire_01
 *
 * 
 *
 * Ce programme va nous servir de pretexte pour mettre en oeuvre
 *  nos connaissances sur la logique booleenne.
 * Afin de pouvoir manipuler des variables booleennes,
 *  Java definit le type booleen( boolean ) qui nous permet de definir des
 *     variables prenant soit la valeur vrai ( true ) soit la valeur faux ( false )
 *       ex1: boolean Y = true ; // declare la variable Y de type boolean et lui
 *                               // affecte la valeur Vrai.
 *       ex2: boolean maVariableBooleenne = false ; // autre variable  autre valeur
 *
 *  Java definit egalement des operateurs que l'on peut utiliser sur des
 *     expressions booleennes.
 *    Java definit l'operateur logique unaire "NON" par un point d'exclamation !
 *       (cet operateur est unaire puisqu'il agit sur un seul terme a la fois).
 *       ex1: boolean X = !true ; // declare la variable X qui vaut false.
 *       ex1: boolean Z = !X ; // declare la variable Z qui vaut true.
 *
 *    Java definit l'operateur logique binaire "ET" par deux ET commerciaux &&
 *       (cet operateur est binaire puisqu'il agit sur une paire de valeurs).
 *       ex:
 *            boolean A = true ; // declare la variable A qui vaut true.
 *            boolean B = true ; // declare la variable B qui vaut true.
 *            boolean C = A && B ; // C est true car (A ET B)est true.
 *
 *    Java definit l'operateur logique binaire "OU" par deux BARRES VERTICALES ||
 *       (cet operateur est binaire puisqu'il agit sur une paire de valeurs).
 *       ex:
 *            boolean E = true ; // declare la variable E qui vaut true.
 *            boolean F = !E ; // declare la variable F qui vaut false.
 *            boolean G = E || F ; //  G est true car (E OU F) vaux true.
 *
 *    Java definit l'operateur logique binaire "OU Exclusif" par l'accent circonflexe ^
 *       (cet operateur est binaire puisqu'il agit sur une paire de valeurs).
 *       ex:
 *            boolean e = true ; // declare la variable e qui vaut true.
 *            boolean v = !e ; // declare la variable v qui vaut false.
 *            boolean X = e ^ v ; //  X est vrai comme(vrai OU Exclusif faux)
 *
 *  Vous avez en tete la table de verite de l'operateur logique "Ou Exclusif"
 *
 * +---+---+----------+
 * | e | v | XOR(e,v) |
 * +---+---+----------+
 * | 0 | 0 |    0     |
 * +---+---+----------+
 * | 0 | 1 |    1     |       -> non e et v
 * +---+---+----------+
 * | 1 | 0 |    1     |       ->     e et non v
 * +---+---+----------+
 * | 1 | 1 |    0     |
 * +---+---+----------+
 *
 *  Et la lecture de cette table nous permet d'ecrire que
 *   XOR(e,v) = (!e && v) || (e && !v)
 *
 *
 * Le programme contenu dans ce fichier vous propose justement d'ecrire une fonction
 *  qui va calculer le XOR des 2 arguments passes a cette fonction que nous
 *  appellerons myXOR(). Par ailleurs comme on sait que Java fournit
 *  deja l'operateur ^ qui calcule le XOR nous allons pouvoir verifier
 *  que les deux implementations fournissent le meme resultat.
 *
 *   Ce programme doit afficher :
 *  e=false v=false X=false e^v=false
 *  e=false v=true  X=true  e^v=true
 *  e=true  v=false X=true  e^v=true
 *  e=true  v=true  X=false e^v=false
 *
 */




/*
 * Commentaires de la classe LogiqueCombinatoire_01 :
 *  Cette classe est rudimentaire puisqu'elle ne possede que deux methodes
 *   qui sont la methode myXOr() et la methode main().
 *  On a mis en gras les mots cles reserves (propres au langage Java).
 */
public class LogiqueCombinatoire_01 {

	/*
	 * Commentaires de la methode myXOR() :
	 *  Cette methode implemente le "ou exclusif" (connu egalement sous
	 *   le nom de "XOR").
	 *  Cette methode est une fonction qui prend en parametres deux variables
	 *   booleennes (que l'on a choisit d'appeler a et b).
	 *  Cette fonction
	 *    calcule le XOR(a,b)
	 *    stocke cette valeur dans une troisieme variable booleenne (que
	 *      l'on a choisi d'appeler c)
	 *    retourne la valeur calculee.
	 */
	public static boolean myXOR (boolean a , boolean b) {
		boolean c = ((!a && b) || (a && !b)) ;
		return (c) ;
	}


	/*
	 * Commentaires de la methode main() :
	 *  Cette methode est le point d'entree du programme : c'est elle qui va
	 *   etre appelee quand vous executerez java -cp . LogiqueCombinatoire_01
	 *  Cette methode est une fonction qui prend en argument une
	 *   variable    (String args[]).
	 *    (Ici la variable s'appelle args et elle est de type tableau de chaines de caracteres) dont nous
	 *    n'allons pas nous servir ici, mais que Java nous impose de declarer.
	 *  Cette fonction ne retourne pas de valeur : c'est une procedure
	 *   (ce qui est indique par le mot clef void)
	 *
	 *  Cette procedure va allouer deux variables booleennes (que l'on a
	 *   choisi d'appeler e et v) dont ont changera plusieurs fois la valeur.
	 *  Cette methode va egalement allouer une autre variable booleenne
	 *   (que l'on a choisi d'appeler X) et qui nous servira a stocker
	 *    le resultat de XOR(e,v)
	 *   Le Langage Java fournissant deja une implementation du XOR
	 *     sous la forme de l'operateur ^
	 *    nous allons pouvoir comparer le resultat de notre implementation
	 *       du XOR avec celle l'operateur ^
	 *    pour ce faire, nous allons utiliser la methode System.out.println()
	 *     afin d'afficher a l'ecran nos resultats.
	 */
	public static void main(String args[]) {

		boolean e ; // entree
		boolean v ; // entree
		boolean X ; // sortie

		e = false ;
		v = false ;
		X = myXOR (e,v) ;
		System.out.println( "e="+e  + " v="+v + " X="+X  +" e^v=" + (e^v) );

		v = true ;
		X = myXOR (e,v) ;
		System.out.println( "e="+e  + " v="+v + "  X="+X  +"  e^v=" + (e^v) );

		e = true ;
		v = false ;
		X = myXOR (e,v) ;
		System.out.println( "e="+e  + "  v="+v + " X="+X  +"  e^v=" + (e^v) );

		e = true ;
		v = true ;
		X = myXOR (e,v) ;
		System.out.println( "e="+e  + "  v="+v + "  X="+X  +" e^v=" + (e^v) );
	}//end of main()



}//end of class LogiqueCombinatoire_01