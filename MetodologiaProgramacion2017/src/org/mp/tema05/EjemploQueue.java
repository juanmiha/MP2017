package org.mp.tema05;

import java.util.LinkedList;
import java.util.Queue;


public class EjemploQueue {
	public static void main(String args[]) {

		Queue queue = new LinkedList();
		for (int i = 1; i <= 20; i++) {
			queue.add(new Integer(i));
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.remove());
			System.out.print(',');
		}
		queue.add("Una cadena");
		System.out.print(queue.remove());
		System.out.println();
		
		// Con genericos
		Queue<Integer> queueG = new LinkedList<Integer>();
		for (int i = 1; i <= 20; i++) {
			queueG.offer(new Integer(i));
			//queueG.add(i);
		}
		while (!queueG.isEmpty()) {
			System.out.print(queueG.remove());
			System.out.print(',');
		}
		//queueG.add("Una cadena"); //error en compilaci�n
	}
}
