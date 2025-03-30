REM Exécute la commande Maven pour construire le JAR
mvn clean package

REM lance le jar
java -jar target/testAndLogs-0.0.1-SNAPSHOT.jar
pause