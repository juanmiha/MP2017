package org.mp.tema06.math;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;

public class Complejos {
	// ver http://commons.apache.org/math/userguide/complex.html
	public static void main(String[] args) {
		//Constructor
		Complex c1 = new Complex(1.0, 3.0); // 1 + 3i
		System.out.println("toString f: " + c1);
		
		Complex lhs = new Complex(1.0, 3.0);
		Complex rhs = new Complex(2.0, 5.0);
		
		System.out.println("Operaciones");
		System.out.println(lhs + " + "+ rhs + " = " + lhs.add(rhs));
		System.out.println(lhs + " - "+ rhs + " = " + lhs.subtract(rhs));	
		System.out.println("abs de lhs: " + lhs.abs());
		System.out.println("conjugado de lhs: " + lhs.conjugate());
		
		System.out.println("Otras Operaciones");
		System.out.println("Coseno de "+ lhs + " = " + lhs.cos());
		System.out.println("Exponencial de "+ lhs + " = " + lhs.exp());
		System.out.println("Logaritmo de "+ lhs + " = " + lhs.log());
		
		//formateado con ComplexFormat
		ComplexFormat format = new ComplexFormat(); // default format
		Complex c = new Complex(1.1111, 2.2222);
		String s = format.format(c); // s contains "1.11 + 2.22i"
		System.out.println("Formateado: " + s);
		//parseado con ComplexFormat
		ComplexFormat cf = new ComplexFormat();
		Complex c2 = cf.parse("1.110 + 2.222i");
		System.out.println("Parseado: " + c2);
	}
}
