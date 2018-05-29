package org.mp.sesion02;
/**
 * Busqueda
 *
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 * @param <E>
 */
public class Busqueda<E extends Comparable<E>> {
	/**
	 * 	BusquedaBinaria:La búsquedabinaria comienza comparando el valor clave (el que buscamos) con el valor que
	 *	ocupa la posición central y pueden darse tres situaciones:
	 *
	 *		La clave es menor que el valor del elemento que ocupa la posición central,
	 *		podemos continuar la búsqueda en el subarray izquierdo.
	 *
	 *		La clave es mayor que el valor del elemento que ocupa la posición central,
	 *		podemos continuar la búsqueda en el subarray derecho.
	 *
	 *		La clave es igual que el valor del elemento que ocupa la posición central,
	 *		la búsqueda acaba.
	 *
	 * @param array
	 * @param valor
	 * @return indice del elemento que se busca.
	 * @throws ExcepcionArrayVacio
	 */
	public static <E extends Comparable<E>> int busquedaBinaria(E[] array,E valor)throws ExcepcionArrayVacio {
		if(array.length <= 0){
			throw new ExcepcionArrayVacio("Array vacío");
		}
		int primero = 0;
		int ultimo = array.length - 1;
		int central;

		if((valor.compareTo(array[0])<0) || (valor.compareTo(array[array.length-1])>0)){
			return -1;
		}else{
			while(ultimo>=primero) {
			central = (primero + ultimo) / 2;
			   if (array[central].compareTo(valor) > 0) {
			    	ultimo = central - 1;
			        central = (primero + ultimo) / 2;
			    } else if(array[central].compareTo(valor) < 0){
			    	primero = central + 1;
			        central = (primero + ultimo) / 2;
			    }else{
			    	return central;
			    }
			}
		}
			return -1;
	}
}


