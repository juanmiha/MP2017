package org.mp.sesion01;
/**
 * Carta
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public class Carta implements Comparable<Object> {

	private String palo;
	private int numero;
	private int valor;
	/**
	 * Constructor inicializacion a 0 de las variables
	 *
	 * @param palo
	 * @param numero
	 * @param valor
	 *
	 */
	public Carta(){
		super();
		this.palo= "";
		this.numero=0;
		this.valor=0;
	}
	/**
	 * Constructor
	 *
	 * @param palo
	 * @param numero
	 */
	public Carta(String palo,int numero){
		//String[] palos = { "O", "C", "E", "B" };
		super();
		this.palo = palo;
		this.numero = numero;
		if (palo == "O")
			this.valor = numero;
		else if (palo == "C")
			this.valor = 12 + numero;
		else if (palo == "E")
			this.valor = 24 + numero;
		else if (palo == "B")
			this.valor = 36 + numero;

	}
	/**
	 * Getter: Devuelve el valor de vale en este caso una cadena.
	 *
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}
	/**
	 * Set: Asgina un valor a la variable palo.
	 *
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}
	/**
	 * Getter: Devuelve el valor de numero.
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Set: Asigna el valor numero.
	 *
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Getter: Devuelve el valor de "valor".
	 *
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	/**
	 * Set: Asgina numero a valor.
	 *
	 * @param valor the valor to set
	 */
	public void setValor(int numero) {
		this.valor = numero;
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
		Carta other = (Carta) obj;
		if (numero != other.numero)
			return false;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		if (valor != other.valor)
			return false;
		return true;
	}
	/**
	 *
	 * CompareTo: Compara dos cartas y dependiendo del valor de cada una devuelve  0, 1 o -1.
	 * @param Object
	 *
	 * @return 0,-1 o 1.
	 */
	@Override
	public int compareTo(Object o) {
		Carta otro = (Carta) o;

		if (getValor() > otro.getValor())
			return 1;
		else if (getValor() < otro.getValor())
			return -1;
		else
			return 0;
	}

}
