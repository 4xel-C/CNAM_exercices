REM -######################################################################################
REM -## LANCE01.BAT
REM -##  Ce fichier de commande pour MS-DOS et MS-Windows
REM -##  permet de compiler le source du programme LogiqueCombinatoire_01.java
REM -##  et permet d'executer le binaire obtenu par compilation LogiqueCombinatoire_01.class
REM -#####################################################################################

REM ---------------------------------------------------------------------------------
REM - Au cas o� la variable path ne serait pas � jour
REM -  en fonction de la version du JDK que vous avez install�e sur votre ordinateur
REM -   indique au systeme d'Exploitation  le chemin o� trouver "javac"  
REM ---------------------------------------------------------------------------------
::set path="C:\Program Files\Java\jdk-17.0.1\bin"
set path="C:\Program Files\Java\jdk-21\bin"



REM ---------------------------------------------
REM - Affiche le chemin que MS-Windows utilise
REM -   pour trouver "javac"  
REM ---------------------------------------------
echo %path%

REM ---------------------------------------------
REM - Affiche la version de javac qu'on utilise
REM ---------------------------------------------
javac -version

REM --------------------------------------------------------
REM - Compile le fichier source LogiqueCombinatoire_01.java
REM --------------------------------------------------------
javac LogiqueCombinatoire_01.java

REM -----------------------------------------------------------
REM - Execute le programme compil� LogiqueCombinatoire_01.class
REM -----------------------------------------------------------
java -cp . LogiqueCombinatoire_01
