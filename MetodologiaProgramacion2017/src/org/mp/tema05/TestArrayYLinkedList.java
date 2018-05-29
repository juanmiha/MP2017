package org.mp.tema05;
import java.util.*;

public class TestArrayYLinkedList {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(1); // autoboxing
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(1);
    arrayList.add(4);
    arrayList.add(0, 10);
    arrayList.add(3, 30);

    System.out.println("Lista de enteros con ArrayList:");
    System.out.println(arrayList);

    LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
    linkedList.add(1, "rojo");
    linkedList.removeLast();
    linkedList.addFirst("verde");

	System.out.println("Muestra la lista hacia delante:");
	ListIterator<Object> listIterator = linkedList.listIterator();
	while (listIterator.hasNext()) {
		System.out.print(listIterator.next() + " ");
	}
	System.out.println();

	System.out.println("Muestra la lista hacia atrás:");
	listIterator = linkedList.listIterator(linkedList.size());
	while (listIterator.hasPrevious()) {
		System.out.print(listIterator.previous() + " ");
	}
	}
}


