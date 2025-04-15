package fileManipulator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MyTextFileWriter {
	File file;

	public MyTextFileWriter(String path) {
		file = new File(path);
	}

	/**
	 * Ecrit un String dans le fichier. Génère le flux binaire, permet le changement
	 * d'encodage, et prend en compte la bufferisation pour l'effcicacité.
	 * 
	 * @param content  Le contenu que l'on veut écrire dans le fichier.
	 * @param encoding L'encodage d'écriture.
	 */
	public void write(String content, String encoding) {

		try {
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter writer = new PrintWriter(bw);

			writer.write(content);
			writer.close();

		} catch (Exception e) {
			System.out.println(e.toString());
			System.exit(-1);
		}

	}

}
