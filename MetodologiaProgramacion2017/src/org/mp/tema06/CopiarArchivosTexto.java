package org.mp.tema06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopiarArchivosTexto {
	public static void main(String[] args) throws IOException {

		String directorioEntrada = System.getProperty("user.dir");
		System.out.println("user.dir: " + directorioEntrada);

		directorioEntrada = directorioEntrada + File.separator + "src"
				+ File.separator + "org" + File.separator + "mp"
				+ File.separator + "tema06" + File.separator;

		System.out.println(directorioEntrada);
		String archivoDondeEsta = directorioEntrada + File.separator
				+ "DondeEsta.txt";
		System.out.println(archivoDondeEsta);

		// Abre el archivo
		File file = new File(archivoDondeEsta);
		FileReader fr = new FileReader(file);
		// Abre un flujo de entrada
		BufferedReader br = new BufferedReader(fr);

		String archivoDondeSeCopia = directorioEntrada + File.separator
				+ "DondeEsta01.txt";

		PrintWriter pw = new PrintWriter(archivoDondeSeCopia);

		String linea;
		// Lee archivo linea a linea
		while ((linea = br.readLine()) != null) {
			pw.println(linea);
		}

		// Cierra el archivo. OBLIGATORIO
		br.close();
		// Cierra el archivo. OBLIGATORIO
		pw.close();
	}
}
