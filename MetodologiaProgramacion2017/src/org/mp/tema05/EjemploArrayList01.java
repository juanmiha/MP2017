package org.mp.tema05;

public class EjemploArrayList01 {
	public static void main(String[] args) {
		java.util.ArrayList listaCiudades = new java.util.ArrayList();
		listaCiudades.add("Almeria");
		listaCiudades.add("Granada");
		listaCiudades.add("Sevilla");
		listaCiudades.add("Murcia");
		listaCiudades.add("Valencia");
		listaCiudades.add("Cuenca");

		System.out.println("Tamaño de la lista " + listaCiudades.size());
		System.out.println("Esta Granada en la lista? "
				+ listaCiudades.contains("Granada"));
		System.out.println("Posicion de Valencia en la lista? "
				+ listaCiudades.indexOf("Valencia"));
		System.out.println("Esta vacia la lista? " + listaCiudades.isEmpty());
		System.out.println(listaCiudades.toString());
		// Operaciones
		listaCiudades.add(2, "Badajoz");
		listaCiudades.remove("Murcia");
		listaCiudades.remove(1);
		System.out.println(listaCiudades.toString());
		// Visualizar en orden inverso
		for (int i = listaCiudades.size() - 1; i >= 0; i--) {
			System.out.print(listaCiudades.get(i) + " ");
		}
		System.out.println();
	}
}

