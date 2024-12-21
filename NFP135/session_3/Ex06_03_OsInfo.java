/*
 * Ex06_03_OsInfo.java
 * version v1.0.3
 *
 *
 * La classe Ex06_03_OsInfo va nous permettre d'obtenir des infos sur notre Operating System.
 *
 *  Pour compiler le programme :
 *  javac -cp . Ex06_03_OsInfo.java
 *
 *  Pour ex�cuter le programme sans argument :
 *  java -cp . Ex06_03_OsInfo
 *
 */


public class Ex06_03_OsInfo {



	/*
	 * La m�thode "main" est le "point d'entr�e" du programme.
	 */
	public static void main(String[] args) {



		System.out.println("execute la ligne 31 de de la methode main() ");


		System.out.println("\n    Some information about the OS");
		System.out.println( "     -----------------------------\n");
		System.out.println("Name of the OS: " + System.getProperty("os.name"));
		System.out.println("Version of the OS: " + System.getProperty("os.version"));
		System.out.println("Architecture of The OS: " + System.getProperty("os.arch"));



		System.out.println("execute la ligne 42  ( dans la methode main() ) ");


		// depuis la methode main() on appelle la m�thode    displayOSInfo()
		displayOSInfo() ;
		// de retour dans la m�thode main()

		System.out.println("execute la ligne 49  ( dans la methode main() ) ");

		// depuis la methode main() on appelle la m�thode    displayJREInfo()
		displayJREInfo() ;
		// de retour dans la m�thode main()


		// depuis la methode main() on appelle la m�thode    displaySystemInfoAdvancedUsers()
		displaySystemInfoAdvancedUsers() ;
		// de retour dans la m�thode main()

    }





	// http://stackoverflow.com/questions/25552/using-java-to-get-os-level-system-information
	public static void displayOSInfo() {

		System.out.println("execute la ligne 69  ( entre dans la methode methode displayOSInfo() ) ");

	    /* Total number of processors or cores available to the JVM */
	    System.out.println("Available processors (cores): " +
	        Runtime.getRuntime().availableProcessors());

	    /* Total amount of free memory available to the JVM */
	    System.out.println("Free memory (bytes): " +
	        Runtime.getRuntime().freeMemory());

		/* Maximum amount of memory that the JVM may attempt to use. */
	    /* This will return Long.MAX_VALUE if there is no preset limit */
	    long maxMemory = Runtime.getRuntime().maxMemory();
	    System.out.println("Maximum memory (bytes): " +
	        (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

	    /* Total memory currently in use by the JVM */
	    System.out.println("Total memory (bytes): " +
	        Runtime.getRuntime().totalMemory());

	    /* Get a list of all filesystem roots on this system */
	    java.io.File[] roots = java.io.File.listRoots();

	    /* For each filesystem root, print some info */
	    for (java.io.File root : roots) {
	      System.out.println("File system root: " + root.getAbsolutePath());
	      System.out.println("Total space (bytes): " + root.getTotalSpace());
	      System.out.println("Free space (bytes): " + root.getFreeSpace());
	      System.out.println("Usable space (bytes): " + root.getUsableSpace());
	    }





		System.out.println("execute la ligne 100  ( sort de la methode methode displayOSInfo() ) ");

	}







	/*

	  // http://www.roseindia.net/java/beginners/OSInformation.shtml

	 No.  |	  Cle                         | Description
	 -----+-------------------------------+-----------------
	  1 	java.version                    The version of Java Runtime Environment.
	  2 	java.vendor                     The name of Java Runtime Environment vendor
	  3 	java.vendor.url                 The URL of Java vendor
	  4 	java.home                       The directory of Java installation
	  5 	java.vm.specification.version   The specification version of Java Virtual Machine
	  6 	java.vm.specification.vendor    The name of specification vendor of Java Virtual Machine
	  7 	java.vm.specification.name      Java Virtual Machine specification name
	  8 	java.vm.version                 JVM implementation version
	  9 	java.vm.vendor 	                JVM implementation vendor
	 10 	java.vm.name  	                JVM  implementation name
	 11 	java.specification.version      The name of specification version Java Runtime Environment
	 12 	java.specification.vendor       JRE specification vendor
	 13 	java.specification.name         JREspecification name
	 14 	java.class.version              Java class format version number
	 15 	ava.class.path 	                Path of java class
	 16 	java.library.path               List of paths to search when loading libraries
	 17 	java.io.tmpdir 	                The path of temp file
	 18 	java.compiler 	                The Name of JIT compiler to use
	 19 	java.ext.dirs 	                The path of extension directory or directories
	 20 	os.name  	                    The name of OS name
	 21 	os.arch  	                    The OS architecture
	 22 	os.version  	                The version of OS
	 23 	file.separator 	                The File separator
	 24 	path.separator  	            The path separator
	 25 	line.separator 	                The line separator
	 26 	user.name 	                    The name of account name user
	 27 	user.home 	                    The home directory of user
	 28 	user.dir  	                    The current working directory of the user

	*/
	public static void displayJREInfo() {

		System.out.println("\n    Some information about the JRE");
		System.out.println( "     ------------------------------\n");


		System.out.println("The version of Java Runtime Environment: " + System.getProperty("java.version"));
		System.out.println("The name of Java Runtime Environment vendor: " + System.getProperty("java.vendor"));
		System.out.println("The URL of Java vendor: " + System.getProperty("java.vendor.url"));

        /***********************************************************************************************/
		/*
		 *  Travaux Pratiques
		 *  -----------------
		 *  TP : completez le code de cette mehode displayJREInfo()
		 *        afin qu'elle affiche la valeur des 28 cles d�finies ci-dessus.
		 *
         */
        /***********************************************************************************************/

		System.out.println("The directory of Java installation: " + System.getProperty("java.home"));
		System.out.println("The specification version of Java Virtual Machine " + System.getProperty("java.specification.version"));
		System.out.println("The name of specification vendor of Java Virtual Machine " + System.getProperty("java.vm.specification.vendor"));
		System.out.println("Java Virtual Machine specification name " + System.getProperty("java.vm.specification.name"));
		System.out.println("JVM implementation version " + System.getProperty("java.vm.version"));
		System.out.println("JVM implementation vendor " + System.getProperty("java.vm.vendor"));
		System.out.println("JVM implementation name " + System.getProperty("java.vm.name"));
		System.out.println("The name of specification version Java Runtime Environment " + System.getProperty("java.specification.version"));
		System.out.println("JRE specification vendor " + System.getProperty("java.specification.vendor"));
		System.out.println("JRE specification name " + System.getProperty("java.specification.name"));
		System.out.println("Java class format version number " + System.getProperty("java.class.version"));
		System.out.println("Path of java class " + System.getProperty("java.class.path"));
		System.out.println("List of paths to search when loading libraries " + System.getProperty("java.library.path"));
		System.out.println("The path of temp files  " + System.getProperty("java.io.tmpdir"));
		System.out.println("The Name of JIT compiler to use " + System.getProperty("java.compiler"));
		System.out.println("The path of extension directory of directories " + System.getProperty("java.ext.dirs"));
		System.out.println("The name of OS name " + System.getProperty("os.name"));
		System.out.println("The OS architecture " + System.getProperty("os.arch"));
		System.out.println("The version of the OS " + System.getProperty("os.version"));
		System.out.println("The File separator " + System.getProperty("file.separator"));
		System.out.println("The path separator " + System.getProperty("path.separator"));
		System.out.println("The line separator " + System.getProperty("line.separator"));
		System.out.println("The name of account name user " + System.getProperty("user.name"));
		System.out.println("The home directory of user " + System.getProperty("user.home"));
		System.out.println("The current working directory of the user " + System.getProperty("user.dir"));
	}




	/*
	 * Java 1.5 SE a introduit la programmation generique.
	 *  Ne vous inquietez pas si vous ne comprenez pas le code suivant.
	 *   Admirez simplement sa compacite.
	 */
	// http://www.daniweb.com/forums/thread20292.html
	public static void displaySystemInfoAdvancedUsers() {

		java.util.Properties systemProps = System.getProperties();
		java.util.Set<java.util.Map.Entry<Object, Object>> sets = systemProps.entrySet();
		System.out.println("systems properties:");
		for(java.util.Map.Entry<Object,Object> entry : sets) {
			System.out.println("name: " + entry.getKey() + ", value: " + entry.getValue());

		}

	}


}


