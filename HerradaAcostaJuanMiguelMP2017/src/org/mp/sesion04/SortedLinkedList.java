package org.mp.sesion04;
/**
 * SortedLinkedList
 * @author Juan Miguel HA
 * @version 07/05/2017
 * @param <E>
 */
public class SortedLinkedList<E extends Comparable<E>> extends org.mp.sesion03.LinkedList<E> {
	/**
	 * Constuctor por defecto llama al constructor de LinkedList sesion03
	 */
	public SortedLinkedList() {
		super();
	}
	/**
	 * Contructor: Inicializa apartir de un objeto
	 * @param objects
	 */
	public SortedLinkedList(Comparable<E>[] objects){
		for (int i = 0; i < objects.length; i++)
		  	addSorted(objects[i]);
	}
	/**
	 * Añade el elemento e como el head de la LinkedList.
	 */
	public void addFirst(E e)  {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	/**
	 * Añade el elemento e como el tail de la LinkedList.
	 */
	public void addLast(E e) {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	/**
	 * Añade el elemento o en la posicion index de la LinkedList
	 */
	public E set(int index,E o){
		throw new UnsupportedOperationException("No garantiza orden");
	}
	/**
	 * Añade el elemento o a la LinkedList;
	 */
	public void add(E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	/**
	 * Añade el elemento e de forma ordenada a la LinkedList
	 * @param e
	 */
	@SuppressWarnings("unchecked")
	public void addSorted(Comparable<E> e) {
		if (getFirst() == null || e.compareTo(getFirst()) < 0 ) {
			super.addFirst((E) e);
		}else if (e.compareTo(getLast()) > 0) {
			super.addLast((E) e);
		} else {
			int posicionMI = 0;
			int elementoComparado = 0;
			for(int i = 0; i < size; i++) {
				elementoComparado = e.compareTo(super.get(i));
				posicionMI++;
				if (elementoComparado < 0)
					break;
			}
			super.add(posicionMI - 1, (E) e);
		}
	}
	/**
	 * Devuelve en un String el nombre y los valores de la LinkedList
	 */
	public String toString() {
		return "Lista ordenada: " + super.toString();
	}
}
