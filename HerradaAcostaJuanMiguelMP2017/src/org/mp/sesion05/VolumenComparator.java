package org.mp.sesion05;

import java.util.Comparator;
/**
 * VolumenComparator
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
public class VolumenComparator implements Comparator {
	/**
	 * Compara dos objetos de la clase Accion por su nombre
	 * 			Devuelve 1 si o1 es mayor que o2
	 * 			Devuelve -1 si o1 es menor que o2
	 * 			Devuelve 0 si o1 es igual que o2
	 * @param o1
	 * @param o2
	 * @return 1,-1 or 0
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Accion aux1 = (Accion) o1;
		Accion aux2 = (Accion) o2;
		if (aux1.getVolumen()>aux2.getVolumen()){
			return 1;
		}else if (aux1.getVolumen()<aux2.getVolumen()){
			return -1;
		}else {
			return 0;
		}
	}
}
