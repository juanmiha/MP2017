package org.mp.tema06;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTexto {
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
		
		//File file = new File(archivoDondeEsta);
		
		//FileReader fr = new FileReader(new File(archivoDondeEsta));
		
		BufferedReader br = new BufferedReader(new FileReader(new File(archivoDondeEsta)));
		
		//BufferedReader br = new BufferedReader(new FileReader(new File(archivoDondeEsta)));
		//BufferedReader br = new BufferedReader(new FileReader(archivoDondeEsta));
		
		String linea;
		// Lee archivo linea a linea
		while ((linea = br.readLine()) != null) {
			
			System.out.println(linea);
		}
		// Cierra el archivo. OBLIGATORIO
		br.close();
	}
}

