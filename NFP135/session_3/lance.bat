REM -######################################################################################
REM -## ---------
REM -## LANCE01.BAT
REM -## ---------
REM -##  Ce fichier de commande pour MS-DOS et MS-Windows 
REM -##  permet de compiler le source du programme Ex06_01_TypesPrimitifs.java
REM -##  et permet d'executer le binaire obtenu par compilation Ex06_01_TypesPrimitifs.java.class
REM -##  De meme pour Ex06_02_StructuresDeControle.java et x06_03_OsInfo.java
REM -#####################################################################################


REM ---------------------------------------------------------------------------------
REM - Au cas où la variable path ne serait pas à jour
REM -  en fonction de la version du JDK que vous avez installée sur votre ordinateur
REM -   indique au systeme d'Exploitation  le chemin où trouver "javac"  
REM ---------------------------------------------------------------------------------
REM set path="C:\Program Files\Java\jdk-9.0.1\bin"
REM set path="C:\Program Files\Java\jdk-11.0.1\bin"
REM set path="C:\Program Files\Java\jdk-13.0.1\bin"
REM set path="C:\Program Files\Java\jdk-15.0.1\bin"
set "path=C:\Program Files\Java\jdk-17.0.1\bin"


REM ---------------------------------------------
REM - Affiche le chemin que MS-Windows utilise
REM -   pour trouver "javac"  
REM ---------------------------------------------
echo %path%


REM ---------------------------------------------
REM - Affiche la version de javac qu'on utilise
REM ---------------------------------------------
javac -version


goto EX01
goto EX02
goto EX03

:EX01
REM --------------------------------------------------------
REM - Compile le fichier source Ex06_01_TypesPrimitifs.java
REM --------------------------------------------------------
javac Ex06_01_TypesPrimitifs.java

REM -----------------------------------------------------------
REM - Execute le programme compilé Ex06_01_TypesPrimitifs.class
REM -----------------------------------------------------------
java -cp . Ex06_01_TypesPrimitifs

pause

:EX02
REM --------------------------------------------------------
REM - Compile le fichier source Ex06_02_StructuresDeControle.java
REM --------------------------------------------------------
javac Ex06_02_StructuresDeControle.java

REM -----------------------------------------------------------
REM - Execute le programme compilé Ex06_02_StructuresDeControle.class
REM -----------------------------------------------------------
java -cp . Ex06_02_StructuresDeControle

pause




:EX03
REM --------------------------------------------------------
REM - Compile le fichier source Ex06_03_OsInfo.java
REM --------------------------------------------------------
javac Ex06_03_OsInfo.java

REM -----------------------------------------------------------
REM - Execute le programme compilé Ex06_03_OsInfo.class
REM -----------------------------------------------------------
java -cp . Ex06_03_OsInfo



:EX04
REM --------------------------------------------------------
REM - Compile le fichier source Ex06_04_EchoArguments.java
REM --------------------------------------------------------
javac Ex06_04_EchoArguments.java

REM -----------------------------------------------------------
REM - Execute le programme compilé Ex06_04_EchoArguments.class
REM -----------------------------------------------------------
java -cp . Ex06_04_EchoArguments argument1 param2 fin des parametres
java Ex06_04_EchoArguments



:END