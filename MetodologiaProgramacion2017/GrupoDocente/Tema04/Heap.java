package org.mp.tema04;
public class Heap<E extends Comparable<E>> {
  private org.mp.sesion03.ArrayList<E> lista = new org.mp.sesion03.ArrayList<E>();

  /** Create a default heap */
  public Heap() {
  }

  /** Create a heap from an array of objects */
  public Heap(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  /** Add a new object into the heap */
  public void add(E newObject) {
    lista.add(newObject); // Append to the heap
    int currentIndex = lista.size() - 1; // The index of the last node

    while (currentIndex > 0) {
      int parentIndex = (currentIndex - 1) / 2;
      // Swap if the current object is greater than its parent
      if (lista.get(currentIndex).compareTo(
          lista.get(parentIndex)) > 0) {
        E temp = lista.get(currentIndex);
        lista.set(currentIndex, lista.get(parentIndex));
        lista.set(parentIndex, temp);
      }
      else
        break; // the tree is a heap now

      currentIndex = parentIndex;
    }
  }

  /** Remove the root from the heap */
  public E remove() {
    if (lista.size() == 0) return null;

    E removedObject = lista.get(0);
    lista.set(0, lista.get(lista.size() - 1));
    lista.remove(lista.size() - 1);

    int currentIndex = 0;
    while (currentIndex < lista.size()) {
      int leftChildIndex = 2 * currentIndex + 1;
      int rightChildIndex = 2 * currentIndex + 2;

      // Find the maximum between two children
      if (leftChildIndex >= lista.size()) break; // The tree is a heap
      int maxIndex = leftChildIndex;
      if (rightChildIndex < lista.size()) {
        if (lista.get(maxIndex).compareTo(
            lista.get(rightChildIndex)) < 0) {
          maxIndex = rightChildIndex;
        }
      }

      // Swap if the current node is less than the maximum
      if (lista.get(currentIndex).compareTo(
          lista.get(maxIndex)) < 0) {
        E temp = lista.get(maxIndex);
        lista.set(maxIndex, lista.get(currentIndex));
        lista.set(currentIndex, temp);
        currentIndex = maxIndex;
      }
      else
        break; // The tree is a heap
    }

    return removedObject;
  }

  /** Get the number of nodes in the tree */
  public int getSize() {
    return lista.size();
  }
}
