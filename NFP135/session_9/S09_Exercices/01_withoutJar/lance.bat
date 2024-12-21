REM ------------------------------------------------------------------------
REM -  lance.bat
REM -   version 1.0.10
REM -    Batch qui montre la compilation et l'execution des programmes Java
REM ------------------------------------------------------------------------


REM -- chemin pour trouver les programmes javac.exe et jar.exe
REM --   (adaptez le a votre config)
::set path="c:\Program Files\Java\jdk1.6.0_16\bin"
::set path="C:\Program Files\Java\jdk1.7.0_45\bin"
REM set path="C:\Program Files\Java\jdk1.8.0_111\bin"
::set path="C:\Program Files\Java\jdk-9.0.1\bin"
REM set path="C:\Program Files\Java\jdk-11.0.1\bin"
::set path="C:\Program Files\Java\jdk-13.0.1\bin"
::set path="C:\Program Files\Java\jdk-15.0.1\bin"
REM set path="C:\Program Files\Java\jdk-17.0.1\bin"
set path="C:\Program Files\Java\jdk-21\bin"
          



REM --   affichage de la version du JDK
javac -version


::goto Exercice_05
::goto Exercice_03
::goto Exercice_02
::goto Exercice_01


:Exercice_01
REM -- Compilation de la classe Exercice_01.java
javac Exercice_01.java
REM -- Execution de la classe Exercice_01.java
java -cp . Exercice_01
::goto END

:Exercice_02
javac Exercice_02.java
java -cp . Exercice_02
::goto END

:Exercice_03
javac Exercice_03.java
java -cp . Exercice_03
::goto END

:Exercice_05
javac Exercice_05.java
java -cp . Exercice_05
goto END



:END
