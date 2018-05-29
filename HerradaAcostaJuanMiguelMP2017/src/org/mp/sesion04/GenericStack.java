package org.mp.sesion04;

import org.mp.sesion03.ArrayList;
/**
 * GenericStack
 * @author Juan Miguel HA
 * @version 07/05/2017
 * @param <E>
 */
public class GenericStack<E> {
  private ArrayList<E> lista = new ArrayList<E>();
  /**
   * Devuelve el tamaño de la Lista
   * @return
   */
  public int getSize() {
    return lista.size();
  }
  /**
   * Devuelve el elemento de la lista que esta en la posición especificada por index
   * @return
   */
  public E peek() {
    return lista.get(getSize() - 1);
  }
  /**
   * Añade un nuevo elemento al final de la lista
   * @param o
   */
  public void push(E o) {
    lista.add(o);
  }
  /**
   * Borra el elemento de la posición especificada por index de la lista.
   * Desplaza la subsecuencia de elementos a la izquierda.
   * Devuelve el elemento que ha sido borrado de la lista.
   *
   * @return o
   */
  public E pop() {
    E o = lista.get(getSize() - 1);
    lista.remove(getSize() - 1);
    return o;
  }
  /**
   * Devuelve true si la lista no contiene ningún elemento
   * @return
   */
  public boolean isEmpty() {
    return lista.isEmpty();
  }
  /**
   * Devuelve en un String el nombre y los valores de Lista.
   */
  @Override
  public String toString() {
	return "Pila: " + lista.toString();
  }
}
