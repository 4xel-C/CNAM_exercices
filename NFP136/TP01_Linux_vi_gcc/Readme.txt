Readme.txt
----------

### Utilisez votre explorateur Internet (Firefox, Chrome, Edge, ...)
###  pour explorer sur le site https://bellard.org/jslinux/
###   et choisisez un OS linux (comme Alpine par exemple)
##      et cliquez sur le lien de démarrage  (https://bellard.org/jslinux/vm.html?url=alpine-x86.cfg&mem=192)


### Saisissez dans le terminal Linux 
###   les commandes suivantes
###      En cas de doute  utiliser l'aide en ligne de  lacommande --help
###       Exemple            ls --help
###       Exemple            cd --help
###       Exemple            gcc --help
#### ou bien allez sur   http://jplu.developpez.com/tutoriels/systeme/presentation-linux/


## Dans une console Linux  saisissez les commandes suivantes:
pwd
cd
pwd
cd /
pwd
cd ~
pwd
whoami
ls
ls -al

echo "Bonjour le Monde" > myBjrMonde.txt
echo "Au revoir le Monde" >> myBjrMonde.txt
cat myBjrMonde.txt
ls -al myBjrMonde.txt
head -N 1 myBjrMonde.txt
head --help

## Java est-il installe sur cette machine ?
which javac
which java


## GNU C Compiler est-il installe sur cette machine ?
which gcc

gcc hello.c -o hello
./hello
cp hello.c myfirstprog.c

##  utilisez le programme d'edition vi
##    pour creer ou modifier vos fichiers
###    voir une documentation vi
##      https://docs.oracle.com/cd/E19620-01/805-1608/6j1io9lha/index.html   ***
##  qui vous indiquera que "ESC+w" vous permet de quitter en sauvegardant vos modifications
##  qui vous indiquera que "ESC+q!" vous permet de  quitter sans sauvegarder vos modifications
vi myfirstprog.c
vi somme.c
vi somme.h
sh lance.sh

## compilation par gcc 
gcc myfirstprog.c somme.c -o myfirstprog
./myfirstprog



