package org.mp.tema06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EscribirArchivoTexto {

	public static void main(String[] args) throws IOException {

		String directorioEntrada = System.getProperty("user.dir");

		System.out.println("user.dir: " + directorioEntrada);

		directorioEntrada = directorioEntrada
				+ File.separator + "src"
				+ File.separator + "org"
				+ File.separator + "mp"
				+ File.separator + "tema06"
				+ File.separator;

		System.out.println(directorioEntrada);

		String archivoDondeEsta = directorioEntrada
				+ File.separator + "DondeEsta.txt";

		System.out.println(archivoDondeEsta);

		File file = new File(archivoDondeEsta);

		//Borra lo que hubiera en el archivo existente
		FileWriter fw = new FileWriter(file);

		//Añade a lo que hubiera en el archivo existente
		//FileWriter fw = new FileWriter(file,true);

		// Escribe cadena al archivo
	    for (int i = 0; i < 6; i++) {
	      fw.write("Linea " + i + "\n");
	    }

	    // cerrar
	    fw.close();

/*
	    //Lo mismo utilizando PrintWriter

	    //Borra lo que hubiera en el archivo existente
		PrintWriter pw = new PrintWriter(file);

		//Tambien es valido
		//PrintWriter pw = new PrintWriter(archivoDondeEsta);


		// Añade a lo que hubiera en el archivo existente
	    // es necesario un FileWriter
	    //FileWriter fw1 = new FileWriter(file,true);
	    //PrintWriter pw = new PrintWriter(fw1);

		//PrintWriter pw = new PrintWriter(file);

		// Escribe cadena al archivo
		for (int i = 0; i < 12; i++) {
			pw.println("Linea " + i );
		}

		// el mismo metodo para todos los tipos basicos
		int numero = 50;
		pw.println(numero);
		pw.println("Utilizando PrintWriter");

		// cerrar
		pw.close();
*/
	}
}
