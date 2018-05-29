package org.mp.sesion01;
/**
 * EnteroMayor
 * @author Juan Miguel Herrada Acosta
 * @version 30.03.2017
 */
public class Mayor {
	/**
	 * Devuelve el mayor entero de una lista que se le pasa como parámetro.
	 *
	 * @param array
	 * @return max
	 * @throws RuntimeException
	 */

	public static int elEnteroMayor(int[] array) throws RuntimeException {


		if(array.length == 0){
			throw new RuntimeException("Array vacio");
		};

		int max = array[0];
		for (int indice = 0; indice < array.length; indice++) {
			if (array[indice] >= max) {
				max = array[indice];
			}
		}

		return max;
	}


}
