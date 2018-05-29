package org.mp.sesion05;

import java.util.Arrays;
/**
 * Accion
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
public class Busqueda {

	private int numElementos;
	private int[] datos;
	private int numBuscado;
	/**
	 * Constructor: Inicializa numElementos y datos.
	 * @param numElementos
	 */
	public Busqueda(int numElementos) {
		this.numElementos = numElementos;
		datos = new int[numElementos];
		inicializaDatos();
	}
	/**
	 * Inicialia el array datos con valores aleatorios y los ordena.
	 */
	private void inicializaDatos() {

		NumerosAleatorios aleatorio = new NumerosAleatorios();
		for (int i = 0; i < datos.length; i++) {
			datos[i] = aleatorio.randomInt(5 * i, (5 * i) + 4);
		}
		Arrays.sort(datos);
		numBuscado = datos[aleatorio.randomInt(0, (datos.length - 1))];
	}
	/**
	 * Devuelve el valor de numElementos
	 * @return	numElementos
	 */
	public int getNumElementos() {
		return numElementos;
	}
	/**
	 * Devuelve el valor de datos
	 * @return datos
	 */
	public int[] getDatos() {
		return datos;
	}
	/**
	 * Asgina el valor de datosmodelo a datos
	 * @param datosModelo
	 */
	public void setDatos(int[] datosModelo) {
		this.datos = (int[])datosModelo.clone();

	}
	/**
	 * Devuelve el valor de numBuscado
	 * @return numBuscado
	 */
	public int getNumBuscado() {
		return numBuscado;
	}
	/**
	 * Asgina el valor de buscar a numBuscado
	 * @param buscar
	 */
	public void setNumBuscado(int buscar) {
		this.numBuscado = buscar;
	}
	/**
	 * Devuelve en un String los nombres y valores de las variables de la clase
	 */
	public String toString() {
		if (datos == null) {
			return null;
		} else {
			String s = "Problema busqueda con " + numElementos +"\n" + "{";
			for (int i = 0; i < datos.length; i++) {
				s += datos[i];
				s += (i < datos.length - 1 ? ", " : "}");
			}
			return s;
		}
	}


}