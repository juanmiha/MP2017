package org.mp.tema05;

import java.util.*;

public class EjemploArrayLinkedList {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1); // 1 autobox con new Integer(1)
		arrayList.add(new Integer(2)); // sin autoboxing
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);
		System.out.println("Una lista de enteros:");
		System.out.println(arrayList);
		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		linkedList.add(1, "verde");
		linkedList.removeLast();
		linkedList.addFirst("rojo");
		System.out.println("Datos lista en orden natural:");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		System.out.println("Datos lista en orden inverso:");
		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}
}

