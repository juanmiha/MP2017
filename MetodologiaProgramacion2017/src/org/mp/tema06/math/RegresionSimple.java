package org.mp.tema06.math;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.math3.stat.regression.SimpleRegression;

public class RegresionSimple {
		// ver http://commons.apache.org/math/userguide/stat.html#a1.4_Simple_regression
	public static void main(String[] args) {
		SimpleRegression sr = new SimpleRegression();

		sr.addData(0, 0);
		sr.addData(1, 1.2);
		sr.addData(2, 2.6);
		sr.addData(3, 3.2);
		sr.addData(4, 4);
		sr.addData(5, 5);
		NumberFormat format = NumberFormat.getInstance();
		System.out.println( "Corte: " + format.format( sr.getIntercept() ) );
		System.out.println( "N: " + sr.getN() );
		System.out.println( "Pendiente: " + format.format( sr.getSlope() ) );
		System.out.println( "Confidencia pendiente: " + format.format( sr.getSlopeConfidenceInterval() ) );
		System.out.println( "R cuadrado: " + format.format( sr.getRSquare() ) );
	
		sr.addData( 400, 100 );
		sr.addData( 300, 105 );
		sr.addData( 350, 70 );
		sr.addData( 200, 50 );
		sr.addData( 150, 300 );
		sr.addData( 50, 500 );
		format = NumberFormat.getInstance(Locale.getDefault());		
		System.out.println( "Corte: " + format.format( sr.getIntercept() ) );
		System.out.println( "N: " + sr.getN() );
		System.out.println( "Pendiente: " + format.format( sr.getSlope() ) );
		System.out.println( "Confidencia pendiente: " + format.format( sr.getSlopeConfidenceInterval() ) );
		System.out.println( "R cuadrado: " + format.format( sr.getRSquare() ) );
	}
}
