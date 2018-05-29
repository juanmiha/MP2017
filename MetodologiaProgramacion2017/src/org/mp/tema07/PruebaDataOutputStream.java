package org.mp.tema07;
import java.io.*;
public class PruebaDataOutputStream {

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
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(987654321);
		dos.writeLong(11111111L);
		dos.writeFloat(22222222F);
		dos.writeDouble(3333333D);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.close();

		File f2 = new File(archivo);
		FileInputStream fis = new FileInputStream(f2);
		DataInputStream dis = new DataInputStream(fis);

		System.out.print(dis.readBoolean() + " ");
		System.out.print(dis.readInt() + " ");
		System.out.print(dis.readLong() + " ");
		System.out.print(dis.readFloat() + " ");
		System.out.print(dis.readDouble() + " ");
		System.out.print(dis.readChar() + " ");
		System.out.print(dis.readBoolean() + " ");
		dis.close();
	}
}


