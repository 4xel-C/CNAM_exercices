REM ----------------------------------------------
REM -  lance_useJar.bat 
REM -   version 1.0.4 
REM -    Batch qui montre l'utilisation du JAR
REM ----------------------------------------------


REM -- chemin pour trouver les programmes javac.exe et jar.exe
REM --   (adaptez le a votre config)
REM set path="C:\Program Files\Java\jdk-17.0.1\bin"
set path="C:\Program Files\Java\jdk-21\bin


REM --   affichage de la version du JDK
javac -version



:: ------------  les :: peuvent servir pour transformer  une commande en commentaires

::goto LABEL_LABEL_EXERCICE_01
goto LABEL_SHOW_JAR_CONTENT



:LABEL_SHOW_JAR_CONTENT
REM ---------------------------------
REM - Pour voir le contenu d'un JAR
REM -
jar tvf  org.cnam.nfp135.s09__v_0_1_0.jar 
::goto END



:LABEL_EXERCICE_01
:: Dans le class Path  on indique a   java  tous les .jar qui contiennent toutes les classes utiles à notre programme
::    suivis du nom de la classe qui contient le main qu'on veut lancer 
::       exemple:             java -cp  m1.jar:m2.jar:m3.jar   main.jar 
::  (ici un seul jar suffit   org.cnam.nfp135.s09__v_0_1_0.jar )
::    il contient le main qu'on veut lancer (prefixee par son package) ici   org.cnam.nfp135.s09.Exercice_01
java -cp org.cnam.nfp135.s09__v_0_1_0.jar  org.cnam.nfp135.s09.Exercice_01

pause


:LABEL_EXERCICE_02
echo "lancement de la classe org.cnam.nfp135.s09.Exercice_02"
java -cp org.cnam.nfp135.s09__v_0_1_0.jar  org.cnam.nfp135.s09.Exercice_02
pause
echo "lancement de la classe par defaut"
java -jar org.cnam.nfp135.s09__v_0_1_0.jar




pause

:LABEL_EXERCICE_03
java -cp org.cnam.nfp135.s09__v_0_1_0.jar  org.cnam.nfp135.s09.Exercice_03

pause

:LABEL_EXERCICE_05
java -cp org.cnam.nfp135.s09__v_0_1_0.jar  org.cnam.nfp135.s09.Exercice_05

pause

goto END






:END
