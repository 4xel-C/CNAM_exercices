@REM This script will successivly compile and run 3 java scripts from the third session of NFP135.
@REM This was written for the completion of the Practical work exercies.
@REM This script will only work this actual .bat file is stored in the same woring directory as the scripts to compile.

@REM Compile the 3 java scripts
javac .\BonjourMonde.java  
javac .\Compteur.java  
javac .\LogiqueCombinatoire_01.java  

@REM Write the name of the script in a text file
echo Exécution de BonjourMonde... > Resultat01.txt 

@REM Adding a new line
echo. >> Resultat01.txt

@REM Run the scripts and redirect the StdOut into a text file
java -cp . BonjourMonde >> Resultat01.txt

@REM Run the Compteur script
echo. >> Resultat01.txt
echo Exécution de Compteur... >> Resultat01.txt
echo. >> Resultat01.txt
java -cp . Compteur >> Resultat01.txt

@REM Run the LogiqueCombinatoire_01 script
echo. >> Resultat01.txt
echo Exécution de LogiqueCombinatoire_01... >> Resultat01.txt
echo. >> Resultat01.txt
java -cp . LogiqueCombinatoire_01 >> Resultat01.txt