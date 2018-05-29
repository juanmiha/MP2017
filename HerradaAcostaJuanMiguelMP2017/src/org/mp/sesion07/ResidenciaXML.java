package org.mp.sesion07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ResidenciaXML extends ResidenciaDAOFactory implements DataAccessObject{

	private XStream xstream;

	public ResidenciaXML(String nombreArchivo){
		super();

		this.nombreArchivo = nombreArchivo;
		this.xstream = new XStream(new DomDriver());
	}

	public void escribir(Object residencia) throws IOException {

		Residencia res = (Residencia) residencia;
		this.xstream.toXML(res, new PrintWriter(nombreArchivo));
	}
	public Residencia leer() throws FileNotFoundException {

		Residencia res = (Residencia)	xstream.fromXML(new FileReader(nombreArchivo));
		return res;
	}
}