/*
 * Ex06_01_TypesPrimitifs.java
 * version v1.0.3
 *
 *
 * La classe Ex06_01_TypesPrimitifs va nous permettre d'utiliser les types primitifs.
 *
 *  Pour compiler le programme :
 *  javac -cp . Ex06_01_TypesPrimitifs.java
 *
 *  Pour ex�cuter le programme sans argument :
 *  java -cp . Ex06_01_TypesPrimitifs
 *
 */


public class Ex06_01_TypesPrimitifs {



	/*
	 * La m�thode "main" est le "point d'entr�e" du programme.
	 */
	public static void main(String[] args) {


		//////////////////////////////////////////////////////////
		// Le type  boolean  true ou false  (classe wrapper Boolean)
		//////////////////////////////////////////////////////////



		boolean unHexagoneASixCotes = true ;
		boolean unTriangleAQuatreCotes = false ;
		boolean reponseJuste =  unHexagoneASixCotes && !unTriangleAQuatreCotes ;

		System.out.println( " Les r�ponses sont-elles bonnes  ?  : " + reponseJuste );



		// http://download.oracle.com/javase/1.4.2/docs/api/java/lang/Boolean.html
		boolean jAiDixAns = Boolean.valueOf("true") ; // pour parser la chaine "true" on utilise la methode valueOf()  de la classe wrapper Boolean
		System.out.println( " jAiDixAns : " + jAiDixAns );

		boolean sensibleALaCasse = Boolean.valueOf("False") ; // valueOf()  reconnait "true" ou "True" et  "false" ou "False"
		boolean insensibleALaCasse = Boolean.valueOf("True") ; // valueOf()  reconnait "true" ou "True" et  "false" ou "False"
		System.out.println( " Boolean.valueOf(\"[une chaine]\")  reconnait \"true\" ou \"True\" et  \"false\" ou \"False\" " + insensibleALaCasse );

		Boolean YADesLimites = Boolean.valueOf("yes") ; //  returns false. : valueOf()  ne reconnait pas "yes"
		System.out.println( " YADesLimites : " + YADesLimites.toString() );


		////////////////
		// Le type char
		////////////////

		char caractere01 = 'J' ;
		char caractere02 = 'a' ;
		char caractere03 = 'v' ;
		char caractere04 = caractere02 ;

		System.out.println( " Langage  : " + caractere01 + caractere02 + caractere03 + caractere04 );



		//////////////////////////////////////////////////////////////////
		// Le type byte  8-bit   de -128 � 127   (classe wrapper : Byte )
		//////////////////////////////////////////////////////////////////

		byte  unPetitCompteur = 126 + 1 ; //
		System.out.println( " unPetitCompteur  : " + unPetitCompteur );

		unPetitCompteur =  -128 ; //
		System.out.println( " unPetitCompteur  : " + unPetitCompteur );

		byte  b01 = 0x01 ;
		System.out.println( " b01  : " + b01 );
		byte  b02 = 0x03 << 1 ; // 0000 0110  //  left shift : d�calage � gauche de 1 bit == multiplication par 2
		System.out.println( " b02  : " + b02 );
		byte  b03 = 0x01 << 2 ; // 0000 0100  //  left shift : d�calage � gauche de 2 bit == multiplication par 4
		System.out.println( " b03  : " + b03 );
		byte  b04 = 0x7F >> 1 ; // 0011 1111  //  right shift : d�calage � droite de 1 bit == division par 2
		System.out.println( "0x7F = " + 0x7F  + " apres d�calage  b04  = " + b04 );



  		// http://www.jguru.com/faq/view.jsp?EID=13647
		byte  unOctet = 0x7F ; // 7 F = 0111 1111
		System.out.println( " unOctet  : " + unOctet );
		unOctet = (byte)0x80 & (byte)0xFF ;
		System.out.println( " unOctet  : " + unOctet );




		//////////////////////////////////////////////////////////////////////////
		// Le type   short    16-bit  de  -32 768 � 32 767  (classe wrapper : Short )
		//////////////////////////////////////////////////////////////////////////

		// http://download.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

		short courteVal01 = 26;   // Le nombre 26, (en decimal)
		short courteVal02 = 032;  // Le nombre 26, (soit 032 en octal)
		short courteVal03 = 0x1a; // Le nombre 26, (soit 0x1A en hexadecimal)

		System.out.println( "\n courteVal01 = " + courteVal01  + "\n courteVal02 = " + courteVal02  +"\n courteVal03 = " + courteVal03   );






		/////////////////////////////////////////////////////////////////////////////////////
		// Le type int 32-bit de -2 147 483 648 � 2 147 483 647   (classe wrapper : Integer )
		/////////////////////////////////////////////////////////////////////////////////////

		int unEntier = -12 ; //

		int troisAuCarre = 3*3 ; //

		// http://download.oracle.com/javase/1.4.2/docs/api/java/lang/Integer.html
		int i = Integer.parseInt("473", 10) ; // 473
		int j = Integer.parseInt("-FF", 16) ; //  -255

		System.out.println( "\n unEntier = " + unEntier  + "\n troisAuCarre = " + troisAuCarre  + "\n i = " + i  +"\n j = " + j   );



		/////////////////////////////////////////////////////////////////////////////////////
		// Le type long 64-bit -2^63 � (2^63)-1    (classe wrapper :  Long )
		/////////////////////////////////////////////////////////////////////////////////////

		long unLong = -12L ; //


		long taille = Long.SIZE ; // 64 (bits)  // http://download.oracle.com/javase/6/docs/api/java/lang/Long.html
		System.out.println( "\n unLong = " + unLong  + " est cod� sur " + taille + " bits.");
		System.out.println( "\n unLong = " + Long.toBinaryString(unLong)  );


		System.out.println( "Le plus grand nombre qui tient dans un \"Long\"  est " + Long.MAX_VALUE );





		/////////////////////////////////////////////////////////////////////////////////////
		// Le type  float  32-bit IEEE754    (classe wrapper :  Float )
		/////////////////////////////////////////////////////////////////////////////////////

		{ // ouverture d'un bloc d'instructions


			// Le fait d'ouvrir un sous-bloc d'instructions permet
			//   de d�clarer des variables dont la portee  (en anglais : scope)
			//    est limitee � ce sous-bloc
			//     cela permet de r�utiliser les m�mes noms pour d�clarer d'autres variables.


			float pi = 3.14159f ;

			System.out.println( " pi vaut environ " + pi );


			float infini = 1.0f / 0.0f ;

			System.out.println( " infini " + infini );

			infini *= -1.0f  ;  //  (+Infini) * (-1) = (-Infini)

			System.out.println( " infini " + infini );

			float notANumber = infini / infini ;

			System.out.println( " notANumber " + notANumber );


		} // fermeture du bloc





		/////////////////////////////////////////////////////////////////////////////////////
		// Le type  double 64-bit IEEE754    (classe wrapper :  Double )
		/////////////////////////////////////////////////////////////////////////////////////

		{ // ouverture d'un bloc d'instructions


			// Le fait d'ouvrir un sous-bloc d'instructions permet
			//   de d�clarer des variables dont la portee  (en anglais : scope)
			//    est limitee � ce sous-bloc
			//     cela permet de r�utiliser les m�mes noms pour d�clarer d'autres variables.



			// http://download.oracle.com/javase/1.5.0/docs/api/java/lang/Double.html
			//  The float  literal 0.1f is equal to the double  value 0.10000000149011612;
			//   the float  literal 0.1f represents a different numerical value than the double literal 0.1.
			//    (The numerical value 0.1 cannot be exactly represented in a binary floating-point number.)

			double diziemeEnDouble = 0.1d ;
			float diziemeEnFloat = 0.1f ;
			System.out.println( " diziemeEnDouble = " + diziemeEnDouble +  " diziemeEnFloat = " + diziemeEnFloat  );
			if ( diziemeEnDouble == diziemeEnFloat ) {
				System.out.println( " egal" );
			} else {
				System.out.println( " different" );
			}


			double infini = 1.0d / 0.0d ;

			System.out.println( " infini " + infini );

			infini *= -1.0d  ;  //  (+Infini) * (-1) = (-Infini)

			System.out.println( " infini " + infini );

			double notANumber = infini / infini ;

			System.out.println( " notANumber " + notANumber );





		} // fermeture du bloc



	}



}


