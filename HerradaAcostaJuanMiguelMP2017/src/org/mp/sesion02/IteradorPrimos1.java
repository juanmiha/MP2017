package org.mp.sesion02;
import java.util.Iterator;
public class IteradorPrimos1 implements Iterator<Integer> {
	private int limite;
	private int actual;
	/**
	 * Constructor
	 *
	 * @param limit
	 */
	public IteradorPrimos1(int limit){
		this.limite = limit;
		this.actual= 1;
	}
	/**
	 * Getter: Devuelve el valor de limite.
	 *
	 * @return limite
	 */
	public int getLimite(){
		return limite;
	}

	/**
	 * Devuelve el siguiente elemento del iterador
	 *
	 * @retun actual
	 */
	public  Integer next() {
		 actual++;
		 return actual;
	}

	/**
	 * Devuelve true si el iterador tiene más elementos que recorrer
	 *
	 */
	public boolean hasNext() {
		boolean hasnext = false;

		if(actual<limite){

			hasnext = true;
		}

		actual++;

		return hasnext;
	}
	/**
	 * Elimina el último elemento obtenido usando el método next()
	 */
	public void remove() {
		throw new UnsupportedOperationException("Método no soportado");
	}
	/**
	 * Comrueba si el número introducido es primo
	 * @param numero
	 * @return True or False
	 */
	public static boolean esPrimo(int numero){
		int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;

	}
	/**
	 * Devuelve en una cadena todos los numeros primos dentro del limite.
	 *
	 * @return cadena
	 */
	public String mostrarPrimos(){
		String r="";
		int cont=0;
		int temp;
		for (int i=actual;i<limite;i++){
			temp = next();
			if (esPrimo(temp)){
				r+="\t"+temp;
				cont++;
				if (cont==10){
					r+="\n";
					cont=0;
				}
			}
		}
		return r;
	}
}
