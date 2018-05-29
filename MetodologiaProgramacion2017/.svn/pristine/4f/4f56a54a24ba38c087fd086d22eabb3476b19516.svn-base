package org.mp.tema02;

import java.util.Iterator;

public class TestIteradorFibonacci {
	public static void main(String[] args) {
		
		int contador = 1;
		int limite = 1000000;
		Iterator<Integer> iterator = new IteradorFibonacci(limite);
		
		System.out.println("SERIE DE FIBONACCI HASTA "+limite);
		System.out.println();
		while (iterator.hasNext()) {
			if (contador % 10 == 0) {
				System.out.printf("%8d\n",iterator.next());
			} else {
				System.out.printf("%8d",iterator.next());
			}
			contador++;
		}
	}
}
