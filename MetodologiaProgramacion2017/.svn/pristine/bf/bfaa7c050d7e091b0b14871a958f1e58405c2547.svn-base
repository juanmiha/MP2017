package org.mp.tema06.math;

import java.text.NumberFormat;
import java.util.Locale;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionFormat;

public class Fracciones {
	// ver http://commons.apache.org/math/userguide/fraction.html

	public static void main(String[] args) {
		// Constructores
		Fraction f = new Fraction(1, 3); // 1 / 3
		Fraction g = new Fraction(0.25); // 1 / 4

		System.out.println("Valor");// Valor
		System.out.println("toString f: " + f);
		System.out.println("double de f: " + f.doubleValue());
		System.out.println("porcentaje de f: " + f.percentageValue());

		Fraction lhs = new Fraction(1, 3);
		Fraction rhs = new Fraction(2, 5);

		System.out.println("Operaciones");
		Fraction answer = lhs.add(rhs); // suma dos fracciones
		System.out.println(lhs + " + " + rhs + " = " + answer);
		System.out.println(lhs + " - " + rhs + " = " + lhs.subtract(rhs));
		System.out.println("abs de lhs: " + lhs.abs());
		System.out.println("reciproca de lhs: " + lhs.reciprocal());

		System.out.println("Equals");// Equals
		Fraction lhs1 = new Fraction(1, 2);
		Fraction lhs2 = new Fraction(2, 4);
		System.out.println("1/2 equals 2/4: " + lhs1.equals(lhs2));

		// formateado con FractionFormat
		NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
		FractionFormat format = new FractionFormat(nf);
		Fraction f1 = new Fraction(2000, 3333);
		String s = format.format(f1); // s contiene "2.000 / 3.333"
		System.out.println("Formateado igual numerador denominador: " + s);

		NumberFormat nf2 = NumberFormat.getInstance(Locale.US);
		format = new FractionFormat(nf, nf2);
		s = format.format(f1); // s contiene "2.000 / 3,333"
		System.out.println("Formateado distinto numerador denominador: " + s);

		// parseado con FractionFormat
		FractionFormat ff = new FractionFormat();
		Fraction f2 = ff.parse("-10 / 21");
		System.out.println("Parseado: " + f2);
	}
}
