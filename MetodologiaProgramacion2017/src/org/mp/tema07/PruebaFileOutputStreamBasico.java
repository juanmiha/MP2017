package org.mp.tema07;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PruebaFileOutputStreamBasico {
	public static void main(String[] args) throws IOException {

		String directorioEntrada = System.getProperty("user.dir");
		System.out.println("user.dir: " + directorioEntrada);
		directorioEntrada = directorioEntrada + File.separator + "src"
				+ File.separator + "org" + File.separator + "mp"
				+ File.separator + "tema07" + File.separator;

		System.out.println(directorioEntrada);
		String archivo = directorioEntrada + File.separator + "ejemplo.dat";
		File f0 = new File(archivo);
		//FileOutputStream fos = new FileOutputStream(f0);
		FileOutputStream fos = new FileOutputStream(f0,true);// para anadir
		for (int i = 256; i < 266; i++) {
			fos.write(i);
		}
		for (byte i = 0; i < 10; i++) {
			fos.write(i);
		}
		fos.close();
		File f1 = new File(archivo);
		FileInputStream fis1 = new FileInputStream(f1);
		int tamano = (int) f1.length();
		System.out.println("\n Disponible: " + fis1.available());
		for (int i = 0; i < tamano; i++) {
			System.out.print(fis1.read() + " ");
		}
		System.out.println("\n Disponible: " + fis1.available());
		fis1.close();
		File f2 = new File(archivo);
		FileInputStream fis2 = new FileInputStream(f2);
		System.out.println("\n Disponible: " + fis2.available());
		System.out.print(fis2.read() + " ");
		System.out.println("\n Disponible: " + fis2.available());
		while (fis2.available() > 0) {
			System.out.print(fis2.read() + " ");
		}
		fis2.close();
	}
}


