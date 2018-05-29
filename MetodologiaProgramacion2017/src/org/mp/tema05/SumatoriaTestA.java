package org.mp.tema05;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumatoriaTestA {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testSuma() {

		assertEquals(Sumatoria.sumaGauss(3), Sumatoria.sumaRec(3));
		assertEquals(Sumatoria.sumaGauss(100), Sumatoria.sumaRec(100));
		assertEquals(Sumatoria.sumaGauss(100), Sumatoria.sumaIter(100));
		assertEquals(Sumatoria.sumaRec(1000), Sumatoria.sumaIter(1000));
		assertEquals(Sumatoria.sumaGauss(1), Sumatoria.sumaRec(1));
	}

}
