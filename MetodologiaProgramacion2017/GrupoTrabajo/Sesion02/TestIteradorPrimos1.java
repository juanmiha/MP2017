package org.mp.sesion02;

import static org.junit.Assert.*;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;


public class TestIteradorPrimos1 {
	private Iterator<Integer> iteradorPrimos1;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPropiedades() {

		iteradorPrimos1 = new IteradorPrimos1(10);
		assertEquals(10, ((IteradorPrimos1) iteradorPrimos1).getLimite());

	}

	@Test
	public void testNext() {

		iteradorPrimos1 = new IteradorPrimos1(10);
		Integer actual = iteradorPrimos1.next();
		assertEquals(new Integer(2), actual);
		actual = iteradorPrimos1.next();
		assertEquals(new Integer(3), actual);

	}

	@Test (timeout = 200) //limita la ejecución a 200 milisegundos
	public void testEsPrimo() {
		assertEquals(true,IteradorPrimos1.esPrimo(2));
		assertEquals(true,IteradorPrimos1.esPrimo(5));
		assertEquals(false,IteradorPrimos1.esPrimo(9));
		assertEquals(false,IteradorPrimos1.esPrimo(4));

	}

	@Test
	public void testHasNext() {
		iteradorPrimos1 = new IteradorPrimos1(10);
		assertEquals(true,iteradorPrimos1.hasNext());
		for(int i = 1 ; i <= 4; i++){
			iteradorPrimos1.next();
			assertEquals(true,iteradorPrimos1.hasNext());
		}
		iteradorPrimos1.next();
		assertEquals(false,iteradorPrimos1.hasNext());
	}

	@Test
	public void testRemove() {
		iteradorPrimos1 = new IteradorPrimos1(10);

		try {
			iteradorPrimos1.remove();
			fail("Debería haber lanzado una excepción");
		} catch (UnsupportedOperationException e) {
			assertEquals(e.getMessage(), "Método no soportado");

		}

	}

	@Test (timeout = 200) //limita la ejecución a 200 milisegundos
	public void testMostrarPrimos() {
		String cadenaGenerada, cadena;

		iteradorPrimos1 = new IteradorPrimos1(1);
		cadenaGenerada = ((IteradorPrimos1) iteradorPrimos1).mostrarPrimos();
		cadena = "";
		assertEquals(cadenaGenerada, cadena);

		iteradorPrimos1 = new IteradorPrimos1(17);
		cadenaGenerada = ((IteradorPrimos1) iteradorPrimos1).mostrarPrimos();
		cadena = "\t" + 2 + "\t" + 3 + "\t" + 5 + "\t" + 7 + "\t" + +11 + "\t"
				+ 13 + "\t" + 17 ;
		assertEquals(cadenaGenerada, cadena);

		iteradorPrimos1 = new IteradorPrimos1(20);
		cadenaGenerada = ((IteradorPrimos1) iteradorPrimos1).mostrarPrimos();
		cadena = "\t" + 2 + "\t" + 3 + "\t" + 5 + "\t" + 7 + "\t" + +11 + "\t"
				+ 13 + "\t" + 17 + "\t" + 19;
		assertEquals(cadenaGenerada, cadena);


		iteradorPrimos1 = new IteradorPrimos1(70);
		cadenaGenerada = ((IteradorPrimos1) iteradorPrimos1).mostrarPrimos();
		cadena = "\t" + 2 + "\t" + 3 + "\t" + 5 + "\t" + 7 + "\t" + 11 + "\t"
				+ 13 + "\t" + 17 + "\t" + 19 + "\t" + 23 + "\t" + 29 + "\n"
				+ "\t" + 31 + "\t" + 37 + "\t" + 41 + "\t" + 43 + "\t" + 47
				+ "\t" + 53 + "\t" + 59 + "\t" + 61 + "\t" + 67;
		assertEquals(cadenaGenerada, cadena);

	}


}
