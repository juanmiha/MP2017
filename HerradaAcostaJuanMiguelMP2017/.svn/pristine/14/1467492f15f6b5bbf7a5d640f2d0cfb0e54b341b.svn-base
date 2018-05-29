package org.mp.sesion01;

import java.util.Arrays;

/**
 * Baraja
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 *
 */
public class Baraja {

	private String nombreBaraja;
	private Carta[] cartas;
	/**
	 * Constructor inicializacion a 0 de las variables
	 *
	 * @param nombreBaraja
	 * @param cartas[]
	 *
	 */
	public Baraja(){
		super();
		this.nombreBaraja = "";
		this.cartas = new Carta[0];
	}
	/**
	 * Constructor
	 *
	 * @param nombreBaraja
	 * @param cartas
	 */
	public Baraja(String nombreBaraja,Carta[] cartas){
		super();
		this.nombreBaraja = nombreBaraja;
		this.cartas = cartas;
	}
	/**
	 * Getter: Devuelve el valor de nombreBaraja
	 *
	 * @return nombreBaraja
	 */
	public String getNombreBaraja() {
		return nombreBaraja;
	}
	/**
	 * Set: Asgina un valor a la variable nombreBaraja
	 * @param nombreBaraja
	 */
	public void setNombreBaraja(String nombreBaraja) {
		this.nombreBaraja = nombreBaraja;
	}
	/**
	 * Getter: Devuelve el valor o los valores de cartas.
	 *
	 * @return cartas[]
	 */
	public Carta[] getCartas() {
		return cartas;
	}
	/**
	 * Set: Asgina valores al array cartas.
	 * @param cartas
	 */
	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	/**
	 * Equals
	 *
	 * Indica si algún otro objeto es "igual a" este.
	 *
	 * @param Object
	 * @return true or False.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baraja other = (Baraja) obj;
		if (!Arrays.equals(cartas, other.cartas))
			return false;
		if (nombreBaraja == null) {
			if (other.nombreBaraja != null)
				return false;
		} else if (!nombreBaraja.equals(other.nombreBaraja))
			return false;
		return true;
	}
	/**
	 * Insercion: Ordena una española de 40 cartas en el orden natural: primero palo y en el
	 * mismo palo en orden ascendente numérico. Oros > Copas > Espadas > Bastos.
	 *
	 * @param o
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insercion(Comparable[] o){
		for (int  i = 1; i < o.length;i++){
			Comparable aux = o[i];
			int j;
			for(j = i-1;j >= 0 && aux.compareTo(o[j]) < 0;j--){
				o[j+1] = o[j];
			}
			o[j+1] = aux;
		}
	}
}
