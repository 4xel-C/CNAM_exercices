package jeuDeCartes;
import jeuDeCartes.paquet.Paquet32;
import jeuDeCartes.paquet.Paquet52;
import jeuDeCartes.Couleur;
import jeuDeCartes.Valeur;


public class Main {
	
//	Paquet32 paquet = new Paquet32();
	
	public static void main(String[] args) {
		
		Paquet32 paquet32 = Paquet32.getInstance();
		Paquet52 paquet52 = Paquet52.getInstance();
		
		System.out.println("Impression du paquet 32");
		System.out.println("=======================");
		System.out.println(paquet32);
		System.out.println("=======================");
		System.out.println("\n");
		
		System.out.println("Impression du paquet 52");
		System.out.println("=======================");
		System.out.println(paquet52);
		System.out.println("=======================");
		System.out.println("\n");
	}
	

	
	

}
