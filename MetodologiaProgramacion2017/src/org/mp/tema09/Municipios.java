package org.mp.tema09;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Municipios {

	List<Municipio> municipios;
	List<String> cabecera;

	public Municipios(File municipios) {
		super();
		this.municipios = new ArrayList<Municipio>(); 
		this.cabecera = new ArrayList<String>();
		
		try {
			leerCabecera(municipios);
			leerMunicipios(municipios);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Municipio> getMunicipios() {
		return  municipios;
	}

	public List<String> getCabecera() {
		return cabecera;
	}

	private void leerCabecera(File municipios) throws Exception {
		FileReader datos = new FileReader(municipios);
		BufferedReader br = new BufferedReader(datos);

		String linea = br.readLine();

		Scanner sc = new Scanner(linea);
		sc.useDelimiter(";");
		sc.useLocale(Locale.US);

		String comunidad = sc.next();
		String provincia = sc.next();
		String municipio = sc.next();
		String poblacion = sc.next();

		this.cabecera.add(comunidad);
		this.cabecera.add(provincia);
		this.cabecera.add(municipio);
		this.cabecera.add(poblacion);

		br.close();
	}

	private void leerMunicipios(File municipios) throws Exception {
		// TODO Auto-generated method stub
		FileReader datos = new FileReader(municipios);
		BufferedReader br = new BufferedReader(datos);
		String linea;
		br.readLine();
		while ((linea = br.readLine()) != null) {
			Scanner sc = new Scanner(linea);
			sc.useDelimiter(";");
			sc.useLocale(Locale.US);
			
			String comunidad = sc.next();
			String provincia = sc.next();
			String municipio = sc.next();
			long poblacion = sc.nextLong();
			
			Municipio mun = new Municipio(comunidad,provincia,municipio,poblacion);
			this.municipios.add(mun);
		}
		br.close();
	}
	@Override
	public String toString() {
		return "Municipios [municipios=" + municipios + "]";
	}
	
}
