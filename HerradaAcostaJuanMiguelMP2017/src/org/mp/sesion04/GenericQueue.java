package org.mp.sesion04;

import org.mp.sesion03.LinkedList;
/**
 * GenericQueue
 * @author Juan Miguel HA
 * @version 07/05/2017
 * @param <E>
 */
public class GenericQueue<E> {
  private LinkedList<E> lista = new LinkedList<E>();
  /**
   * Add an element to the end of the list
   * @param e
   */
  public void enqueue(E e) {
    lista.addLast(e);
  }
  /**
   * Remove the head node and return the object that is contained in the removed node.
   * @return
   */
  public E dequeue() {
    return lista.removeFirst();
  }
  /**
   * Devuelve el número de elementos de la lista
   * @return
   */
  public int getSize() {
    return lista.size();
  }
  /**
   * Devuelve en un String el nombre y los valores de Lista.
   */
  @Override
  public String toString() {
    return "Cola: " + lista.toString();
  }
}
