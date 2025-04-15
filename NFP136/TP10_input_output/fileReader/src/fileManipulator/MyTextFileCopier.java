package fileManipulator;

import java.io.IOException;

public class MyTextFileCopier {
	
	public static void main(String[] args) throws IOException {
		
		// cls terminal
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
		
		
		String file = "data/exemple.txt";
		String originalEncoding = "UTF-8";
		String targetEncording = "ISO-8859-1";
		
		MyTextFileReader reader = new MyTextFileReader(file);
		MyTextFileWriter writer = new MyTextFileWriter("data/copy.txt");
		
		String content = reader.read(originalEncoding);
		
		System.out.println("Impression du contenu du fichier à copier (UTF-8): ");
		System.out.println();
		System.out.println(content);
		
		System.out.println();
		System.out.println("Copie du fichier en cours...");
		
		writer.write(content, targetEncording);
		System.out.println("Copie terminée!");
	}
}
