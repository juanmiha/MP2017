package org.mp.sesion02;

import java.util.Iterator;

/**
 * Iterador de numros Primos
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public  class IteradorPrimos implements Iterator<Integer> {
	private int limite;
	private int actual;
	/**
	 * Constructor
	 *
	 * @param limit
	 */
	public IteradorPrimos(int limit){
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
	@Override
	/**
	 * Devuelve el siguiente elemento del iterador
	 *
	 * @retun actual
	 */
	public  Integer next() {
		// TODO Auto-generated method stub
		return actual;
	}
	@Override
	/**
	 * Devuelve true si el iterador tiene más elementos que recorrer
	 *
	 */
	public boolean hasNext() {
		while(actual<limite){
			actual++;
			if(esPrimo(actual)){
				return true;
		    }
		}
		return false;
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
		 int cont = 0;
	     String cadena = "";
	        while (hasNext()) {
	            cadena += "\t" + next();
	            cont ++;
	            if(cont % 10 == 0){
	                cadena += "\n";
	            }
	        }
	        return cadena;
	}
}
