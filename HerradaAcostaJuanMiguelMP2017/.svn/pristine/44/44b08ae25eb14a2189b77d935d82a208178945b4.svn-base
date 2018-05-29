package org.mp.sesion07;

import java.io.Serializable;
/**
 * Claes habitacion. Representa la habitacion de un hotel
 */
@SuppressWarnings("serial")
public class Habitacion implements Serializable {

	private String numero;

	/**
	 * Instancia una nueva habitacion
	 *
	 * @param num
	 *            numero de la habitacion
	 */
	public Habitacion(String numero) {
		this.numero = numero;
	}

	/**
	 * Metodo getter del numero de habitacion
	 *
	 * @return numero de habitacion
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Metodo setter del numero de habitacion
	 *
	 * @param numero
	 *            numero habitacion
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Devuelve una habitacion igual a la que llama al metodo
	 *
	 * @see java.lang.Object#clone()
	 */
	public Habitacion clone() {
		return new Habitacion(this.getNumero());
	}

	/**
	 * Compara la habitacion que llama al metodo con otra pasada por parametro
	 *
	 * @param habitacion
	 *            habitacion para comprarar con la que llama al metodo
	 *
	 * @return true si son iguales, false en caso contrario
	 */
	public boolean equals(Habitacion habitacion) {
		return (numero.equals(habitacion.numero)) ? true : false;
	}

}