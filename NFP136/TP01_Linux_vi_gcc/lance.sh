#!/bin/bash

#########################################
##    lance.sh  (en langage Shell bash)
##      Script qui utilise GCC
## saisir la commande
##  sh lance.sh    
##    pour compiler le programme myfirstprog.c
##
########################################

## le GNU C compiler  sait transformer le langage C en langage Assembleur
##  on va traduire le code C de  somme.c   en  assembleur somme.s
gcc -S somme.c
cat somme.s

## le GNU C compiler sait generer du code objet relogeable
##   a partir d'un module en code assemblage
gcc -c somme.s 
head 3 somme.o
gcc -c myfirstprog.c 
head 3 myfirstprog.o


## edition de liens entre modules generation du code objet relogeable
##   et generation du binaire executable
gcc myfirstprog.o somme.o -o myfirstprog
## execution du programme  myfirstprog
./myfirstprog



## en une seule commande 
##   compilation et edition de liens et generation du binaire executable
gcc myfirstprog.c somme.c -o a.out
## execution du programme  a.out
./a.out



