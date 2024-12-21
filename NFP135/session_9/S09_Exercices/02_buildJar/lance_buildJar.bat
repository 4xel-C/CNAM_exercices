REM ----------------------------------------------
REM -  lance_buildJar.bat 
REM -   version 1.0.5
REM -    Batch qui montre la fabrication d'un JAR
REM ----------------------------------------------


REM -- chemin pour trouver les programmes javac.exe et jar.exe
REM --   (adaptez le a votre config)
REM set path="C:\Program Files\Java\jdk-17.0.1\bin"
set path="C:\Program Files\Java\jdk-21\bin
          


REM --   affichage de la version du JDK
javac -version


REM -- Compilation de toutes les classes Java du projet
javac -classpath src\org\cnam\nfp135\s09 -d . src\org\cnam\nfp135\s09\*.java


REM -- Creation d'un JAR contenant toutes les classes Java du projet
REM --                et contenant un manifest qui indique quelle classe utiliser par defaut
jar cvmf src\META-INF\MANIFEST.MF org.cnam.nfp135.s09__v_0_1_0.jar org\cnam\nfp135\s09\*.class



:END
