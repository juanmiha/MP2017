package org.mp.tema06;
import java.io.File;
public class LocalizarArchivo {

	public static void main(String[] args) {

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
				+  "DondeEsta.txt";

		System.out.println(archivoDondeEsta);

		File file = new File(archivoDondeEsta);

		System.out.println("Nombre: "+ file.getName());

		System.out.println("Tamaño: "+ file.length());
	}
}


