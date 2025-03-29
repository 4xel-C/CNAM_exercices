REM Nettoyage du dossier binaire
if exist bin rmdir /s / q bin
mkdir bin

REM Compilation des fichiers sources dans le dossier binaire
javac -d bin src/structures/*.java

REM Lancement de l'exercice sur les piles
cls
java -cp bin structures/ExercicesPiles
pause

REM Lancement dfe l'exercice sur les files
cls
java -cp bin structures/ExercicesFiles
pause

REM Lancement de l'exercice sur la Deque
cls
java -cp bin structures/ExerciceDeque
pause