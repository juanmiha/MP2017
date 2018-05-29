package org.mp.tema05;

import java.util.Stack;

public class EjemploStack {
	public static void main(String args[]) {
		
		Stack lifo = new Stack();
		for (int i = 1; i <= 20; i++) {
			lifo.push(new Integer(i));
		}
		while (!lifo.empty()) {
			System.out.print(lifo.pop());
			System.out.print(',');
		}
		lifo.push("Una cadena");
		System.out.print(lifo.pop());
		System.out.println();
		
		// Con genericos
		Stack<Integer> lifoG = new Stack<Integer>();
		for (int i = 1; i <= 20; i++) {
			lifoG.push(new Integer(i));
			//lifo.push(i);
			
		}
		while (!lifoG.empty()) {
			System.out.print(lifoG.pop());
			System.out.print(',');
		}
		//lifoG.push("Una cadena"); //error en compilación
	}
}

