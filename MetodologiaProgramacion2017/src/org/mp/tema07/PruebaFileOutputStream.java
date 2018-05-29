package org.mp.tema07;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PruebaFileOutputStream {
	public static void main(String[] args) throws IOException {

		String directorioEntrada = System.getProperty("user.dir");
		System.out.println("user.dir: " + directorioEntrada);
		directorioEntrada = directorioEntrada + File.separator + "src"
				+ File.separator + "org" + File.separator + "mp"
				+ File.separator + "tema07" + File.separator;
		String archivo = directorioEntrada + File.separator + "ejemplo.dat";
		System.out.println(archivo);

		File f1 = new File(archivo);
		FileOutputStream fos = new FileOutputStream(f1);
		// FileOutputStream fos = new FileOutputStream(f1, true);

		byte vectorBytes1[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		fos.write(vectorBytes1);
		fos.close();

		File f2 = new File(archivo);
		FileInputStream fis = new FileInputStream(f2);

		int tamano = (int) f2.length();
		byte vectorBytes2[] = new byte[tamano];
		fis.read(vectorBytes2);

		for (int i = 0; i < vectorBytes2.length; i++) {
			System.out.print(vectorBytes2[i] + " ");
		}
		fis.close();
	}
}


