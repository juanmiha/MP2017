package org.mp.tema02;

/*(Iterador números Fibonacci) Define una clase iterador llamada IteradorFibonacci
 para iterar números de Fibonacci. El constructor recibe un argumento que
 especifica el limite del máximo número de Fibonacci. Por ejemplo, new
 IteradorFibonacci(23302) crea un iterador que itera números de Fibonacci
 menores o iguales que 23302. Escribe un programa test que use este iterador para
 mostrar todos los números de Fibonacci menores o iguales que 100000.
 *
 */

import java.util.Iterator;

public class IteradorFibonacci implements Iterator<Integer> {
	private int limit;
	private int f0 = 0;
	private int f1 = 1;

	public IteradorFibonacci(int limit) {
		this.limit = limit;
	}

	@Override
	public Integer next() {
		int temp = f0;
		f0 = f1;
		f1 = temp + f1;
		return temp;
	}

	@Override
	public boolean hasNext() {
		if (f0 > limit)
			return false;
		else
			return true;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Método no soportado");
	}
}
