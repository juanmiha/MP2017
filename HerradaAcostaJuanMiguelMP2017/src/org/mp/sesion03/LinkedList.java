package org.mp.sesion03;

import java.util.Iterator;
/**
 * LinkedList
 *
 * @author Juan Miguel Herrada Acosta
 * @version 02.04.2017
 * @param <E>
 */
public class LinkedList<E> extends AbstractList<E> {
	private Node<E> head;
	private Node<E> tail;
	/** Create a default list */
	public LinkedList() {
		head=null;
		tail=null;
	}
	/** Create a list from an array of objects */
	public LinkedList(E[] objects) {
		super(objects);
	}
	/** Return the head element in the list */
	public E getFirst() {
		if (head == null)
			return null;
		else
		return head.element;
	}
	/** Return the last element in the list */
	public E getLast() {
		if (tail == null)
			return null;
		else
			return tail.element;
	}
	/** Add an element to the beginning of the list */
	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e); // Create a new node
		newNode.next = head; // link the new node with the head
		head = newNode; // head points to the new node
		size++; // Increase list size

		if (tail == null) // the new node is the only node in list
			tail = head;
	}
	/** Add an element to the end of the list */
	public void addLast(E e) {
		Node<E> newNode = new Node<E>(e); // Create a new for element e
		if (tail == null) {
			head = tail = newNode; // The new node is the only node in list
		} else {
			tail.next = newNode; // Link the new with the last node
			tail = tail.next; // tail now points to the last node
		}
		size++; // Increase size
	}
	/**
	 * Add a new element at the specified index in this list The index of the
	 * head element is 0
	 */
	public void add(int index, E e) {
		if (index <= 0) addFirst(e);
		 else if (index >= size) addLast(e);
		 else {
			Node<E> current = head;
			for (int i = 1; i < index; i++) {
				current = current.next;
			}
			Node<E> temp = current.next;
			current.next = new Node<E>(e);
			(current.next).next = temp;
			size++;
		}
	}
	/**
	 * Remove the head node and return the object that is contained in the
	 * removed node.
	 */
	public E removeFirst() {
		if (size == 0)
			return null;
		else {
			Node<E> temp = head;
			head = head.next;
			size--;
			if (head == null) tail = null;
				return temp.element;
		}
	}
	/**
	 * Remove the last node and return the object that is contained in the
	 * removed node.
	 */
	public E removeLast() {
		if (size == 0)
			return null;
		else if (size == 1) {
			Node<E> temp = head;
			head = tail = null;
			size = 0;
			return temp.element;
		} else {
			Node<E> current = head;
			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}
			Node<E> temp = tail;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;
		}
	}
	/**
	 * Remove the element at the specified position in this list. Return the
	 * element that was removed from the list.
	 */
	public E remove(int index) {
		if (index < 0 || index >= size)
			return null;
		else if (index == 0)
			return removeFirst();
		else if (index == size - 1)
			return removeLast();
		else {
			Node<E> previous = head;
			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}
			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}
	/** Override toString() to return elements in the list */
	public String toString() {
		String cadena = "[";
		Iterator<E> iterator = iterator();
		while ( iterator.hasNext()){
			E e = iterator.next();
			if(iterator.hasNext()){
				cadena = cadena + e + ", ";
			}else {
		    cadena = cadena + e;
			}
		  }
		return cadena+"]";
	}
	/** Clear the list */
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	/** Return true if this list contains the element o */
	public boolean contains(E e) {
		Iterator<E> Iterator = iterator();
		while (Iterator.hasNext()){
			E otroe = Iterator.next();
			if (otroe.equals(e)){
				return true;
			}
		}
		return false;
	}
	/** Return the element from this list at the specified index */
	public E get(int index) {
		Iterator <E> iterator = iterator();
		for (int i=0;i<index;i++){
			iterator.next();
		}
		return iterator.next();
	}

	/**
	 * Return the index of the head matching element in this list. Return -1 if
	 * no match.
	 */
	public int indexOf(E e) {
		Iterator<E> Iterator=iterator();
		int cont=0;
		while(Iterator.hasNext()){
			E e2=Iterator.next();
			if (e2.equals(e)){
				return cont;
			}
			cont++;
		}
		return -1;
	}
	/**
	 * Return the index of the last matching element in this list Return -1 if
	 * no match.
	 */
	public int lastIndexOf(E e) {
		Iterator<E> Iterator=iterator();
		int contador = 0;
		int posición =-1;
		while(Iterator.hasNext()){
			E otroe=Iterator.next();
			if (otroe.equals(e)){
				posición = contador;
			}
			contador++;
		}
		return posición;
	}
	/**
	 * Replace the element at the specified position in this list with the
	 * specified element.
	 */
	public E set(int index, E e) {
		if (index<0 || index>=size)
			return null;
		Node<E> actual=head;
		for (int i=0;i<index;i++){
			actual=actual.next;
		}
		E temp=actual.element;
		actual.element=e;
		return temp;
	}
	/** Override iterator() defined in Iterable */
	public Iterator<E> iterator() {
		return new LinkedListIterator();
	}
	/**
  	 * LinkedListIterator
  	 *
  	 * @author Juan Miguel Herrada Acosta
  	 * @version 02.04.2017
  	 */
	private class LinkedListIterator implements Iterator<E> {
		private Node<E> current = head;
		/**
		 * Devuelve true si el iterador tiene más elementos que recorrer
		 */
		public boolean hasNext() {
			if (current != null){
				return true;
			}else {
				return false;
			}
		}
		/**
		 * Devuelve el siguiente elemento del iterador
		 */
		public E next() {
			E temp = current.element;
			current = current.next;
			return temp;

		}

		/**
		 * Elimina el último elemento obtenido usando el método next()
		 */
		public void remove() {
			if (current == null)
				return;
			else if (current == head){
				removeFirst();
				return;
			}else if (current==tail){
				removeLast();
				return;
			}
			Node<E> actual=head;
			while (actual.next!=current){
				actual=actual.next;
			}
			actual.next=current.next;
			size--;
		}
	}

	// This class is only used in LinkedList, so it is private.
	// This class does not need to access any
	// instance members of LinkedList, so it is defined static.
	private static class Node<E> {
		protected E element;
		protected Node<E> next;


		public Node(E element) {
			this.element  = element;
		}
	}
}