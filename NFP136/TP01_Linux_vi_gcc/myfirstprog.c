#include <stdio.h>
#include "somme.h"  // fournit le prototype de additionner()

/* 
 * Pour compiler ce programme saisir la commande suivante : 
 *   gcc myfirstprog.c somme.c -o myfirstprog 
 */ 
int main(void)
{
		int a = 1 ;
		int b = 2 ;
		int somme = -1 ;
		printf("hello world\n");
		somme = additionner(a , b);
		printf("la somme de %d et %d vaut %d \n", a, b, somme);
		return 0;
}