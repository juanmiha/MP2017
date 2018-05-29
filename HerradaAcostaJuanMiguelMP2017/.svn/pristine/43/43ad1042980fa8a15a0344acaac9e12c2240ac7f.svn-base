package org.mp.sesion01;
/**
 * Fraccion
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public class Fraccion implements Comparable<Object> {

	private int numerador;
	private int denominador;
	/**
	 * Constructor sin parametros
	 *
	 * @param numerador
	 * @param denominador
	 *
	 */
	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}
	/**
	 * Constructor con parametros
	 *
	 * @param numerador
	 * 					numerodor = numerador.
	 * @param denominador
	 * 					denominador = denominador.
	 *
	 */
	public Fraccion(int numerador, int denominador) {

		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;
		this.denominador = Math.abs(denominador);

	}
	/**
	 * Equals
	 *
	 * Indica si algún otro objeto es "igual a" este.
	 *
	 * @param Object
	 * @return true or False.
	 */
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) obj;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}
	/**
	 * Getter
	 *
	 * Devuelvo el valor del numerador
	 *
	 * @return numerador
	 *
	 */
	public int getNumerador() {
		return numerador;
	}
	/**
	 *Getter
	 *
	 *Devuelve el valor del denominador
	 *
	 * @return denominador
	 *
	 */
	public int getDenominador() {
		return denominador;
	}
	/**
	 *toString: Devuevle en una cadena el valor del numerador y denominador.
	 *
	 */
	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}
	/**
	 *	Sumar: Suma la fraccion A y B. Siendo A la que llama al metodo sumar fraccion1.sumar(fraccion2).
	 *
	 * @param b
	 * @return
	 */
	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}
	/**
	 *	Restar: Resta la fraccion A y B. Siendo A la que llama al metodo sumar fraccion1.restar(fraccion2).
	 * @param b
	 * @return Fraccion
	 */
	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}
	/**
	 * Multiplicar: Multiplica la fraccion A y B. Siendo A la que llama al metodo sumar fraccion1.multiplicar(fraccion2).
	 * @param b
	 * @return Fraccion
	 */
	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}
	/**
	 * Dividir: Dividi la fraccion A y B. Siendo A la que llama al metodo sumar fraccion1.Dividir(fraccion2).
	 * @param b
	 * @return Fraccion
	 */
	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}
	/**
	 * MCD: realiza el máximo común divisor de dos numeros.
	 * @param u
	 * @param v
	 * @return u
	 */
	private static int mcd(int u, int v) {
		u = Math.abs(u);
		v = Math.abs(v);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	/**
	 * Simplificar : Simplifica una fraccion.La llamada seria fraccion.simplificar();
	 * @return Fraccion
	 */
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}
	/**
	 *
	 * CompareTo: Compara dos fracciones y si es mayor la que llamada al metodo devuelve 1 , si es menor devuelve -1 y son iguales devuelve 0.
	 * @param Object
	 *
	 * @return 0,-1 o 1.
	 */
	public int compareTo(Object o) {

		Fraccion otro = (Fraccion) o;

		double valorFraccion = (double) numerador / denominador;
		double valorOtro = (double) otro.getNumerador() / otro.getDenominador();

		if (valorFraccion > valorOtro)
			return 1;
		else if (valorFraccion < valorOtro)
			return -1;
		else
			return 0;

	}

}