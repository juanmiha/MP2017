package org.mp.tema05;

import java.util.*;

public class EjemploArrayList02 {
	public static void main(String[] args) {
		java.util.ArrayList<String> listaCiudades = new java.util.ArrayList<String>();
		listaCiudades.add("Almeria");
		listaCiudades.add("Granada");
		listaCiudades.add("Sevilla");
		listaCiudades.add("Murcia");
		listaCiudades.add("Valencia");
		listaCiudades.add("Cuenca");

		System.out.println("Tamaño de la lista " + listaCiudades.size());
		System.out.println("¿Esta Granada en la lista? "
				+ listaCiudades.contains("Granada"));
		System.out.println("¿Posición de Valencia en la lista? "
				+ listaCiudades.indexOf("Valencia"));
		System.out.println("¿Está vacia la lista? " + listaCiudades.isEmpty());
		System.out.println(listaCiudades.toString());
		// Operaciones
		listaCiudades.add(2, "Badajoz");
		listaCiudades.remove("Murcia");
		listaCiudades.remove(1);
		System.out.println(listaCiudades.toString());
		// Visualizar en orden natural
		for (int i = 0; i < listaCiudades.size(); i++) {
			System.out.print(listaCiudades.get(i) + " ");
		}
		System.out.println();
	}
}
