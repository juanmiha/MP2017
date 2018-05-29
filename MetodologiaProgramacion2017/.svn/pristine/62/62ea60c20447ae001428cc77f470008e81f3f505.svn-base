package org.mp.tema07.xstream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Reader {

	public static void main(String[] args) {
		XStream xs = new XStream(new DomDriver());
		Employee e = new Employee();

		try {
			String directorioEntrada = System.getProperty("user.dir");
			String archivoDatos = directorioEntrada + File.separator +
					"src" + File.separator +
					"org" + File.separator +
					"mp"  + File.separator +
					"tema07" + File.separator +
					"xstream" + File.separator +
					"employeedata.xml";

			FileInputStream fis = new FileInputStream(archivoDatos);
			xs.fromXML(fis, e);

			//imprime los datos leidos
			System.out.println(e.toString());

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

	}
}