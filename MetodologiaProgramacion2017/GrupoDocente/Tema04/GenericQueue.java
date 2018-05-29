package org.mp.tema04;

import org.mp.sesion03.LinkedList<E>;

public class GenericQueue<E> {
  private  lista
    = new LinkedList<E>();

  public void enqueue(E e) {
    lista.addLast(e);
  }

  public E dequeue() {
    return lista.removeFirst();
  }

  public int getSize() {
    return lista.size();
  }

  @Override
  public String toString() {
    return "Cola: " + lista.toString();
  }
}