package org.mp.sesion05;

import java.util.LinkedList;
import java.util.List;
/**
 * Acciones
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
public class Acciones {
	private List<Accion> acciones;
	/**
	 * Constructor: Inicializa acciones
	 */
	public Acciones(){
		this.acciones = new LinkedList();
	}
	/**
	 * Añade una accion a la lista acciones
	 * @param accion
	 */
	public void add(Accion accion){
		acciones.add(accion);
	}
	/**
	 * Devuelve la lista acciones
	 * @return acciones
	 */
	public List getAcciones(){
		return acciones;

	}
}
