package org.mp.tema07.xstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Writer {

	public static void main(String[] args) {
		Employee e = new Employee();

		e.setName("Jack");
		e.setDesignation("Manager");
		e.setDepartment("Finance");

		//Serializa el objeto
		XStream xs = new XStream(new DomDriver());

		//escribe archivo en el disco
		try {
			String directorioEntrada = System.getProperty("user.dir");
			String archivoDatos = directorioEntrada + File.separator +
					"src" + File.separator +
					"org" + File.separator +
					"mp"  + File.separator +
					"tema07" + File.separator +
					"xstream" + File.separator +
					"employeedata.xml";
			FileOutputStream fs = new FileOutputStream(archivoDatos);
			xs.toXML(e, fs);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}