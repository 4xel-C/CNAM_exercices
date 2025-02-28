#include "somme.h" // fournit le prototype de additionner()

/*
    Le code ci-dessous implemente la fonction  additionner()
     qui calcule la somme de deux entiers passés en parametres.
 */
int additionner(int a, int b)
{
	int c ;  // declaration de la variable c qui est de type int
	         //  la variable c est allouée dans la pile.
			 // (A cet instant c n'est pas encore initialisée).
	c = a + b ;  // affecte à c la valeur de la somme de a et b 
	return(c);  // renvoie la valeur contenue dans c  
	            //   (en plaçant cette valeur à un endroit reservé dans la pile) 
}
