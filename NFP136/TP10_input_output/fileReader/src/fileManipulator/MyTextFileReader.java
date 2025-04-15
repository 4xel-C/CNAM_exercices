package fileManipulator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTextFileReader {

	File file;
	StringBuffer content;

	/**
	 * Constructor Initialise le fichier.
	 * 
	 * @param path Le chemin vers le fichier à lire.
	 * @throws FileNotFoundException Retourne une erreur si le fichier n'existe pas.
	 */
	public MyTextFileReader(String path) throws FileNotFoundException {
		this.file = new File(path);
		if (!file.exists())
			throw new FileNotFoundException("Le fichier n'a pas été trouvé.");
	}

	/**
	 * Permet de lire la totalité du fichier texte.
	 * 
	 * @param encoding Spécifier l'encodage.
	 * @return String Le contenu du fichier.
	 * @throws IOException
	 */
	public String read(String encoding) throws IOException {
		if (content != null)
			return content.toString();

		try {
			content = new StringBuffer();
			FileInputStream inputStream = new FileInputStream(file);
			InputStreamReader dataStream = new InputStreamReader(inputStream, encoding);
			BufferedReader reader = new BufferedReader(dataStream);
			String line;

			while ((line = reader.readLine()) != null) {
				content.append(line);
				content.append("\n");
			}
			reader.close();

		} catch (Exception e) {
			System.out.println(e.toString());
			System.exit(-1);
		}

		return content.toString();
	}
}
