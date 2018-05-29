package org.mp.tema06.math;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
public class SistemasEcuacionesLineales {

	public static void main(String[] args) {
		// Create a real matrix with two rows and three columns
		double[][] matrixData = { {1d,2d,3d}, {2d,5d,3d}};
		RealMatrix m = new Array2DRowRealMatrix(matrixData);
		// One more with three rows, two columns
		double[][] matrixData2 = { {1d,2d}, {2d,5d}, {1d, 7d}};
		RealMatrix n = new Array2DRowRealMatrix(matrixData2);
		// Now multiply m by n
		RealMatrix p = m.multiply(n);
		System.out.println(p.getRowDimension());    // 2
		System.out.println(p.getColumnDimension()); // 2
	    System.out.println(p);
		// Invert p, using LU decomposition
	    LUDecomposition solver0 = new LUDecomposition(p);
	    RealMatrix pInverse = solver0.getSolver().getInverse();
	    System.out.println(pInverse);
	    /*2x + 3y - 2z = 1
	     -x + 7y + 6x = -2
	      4x - 3y - 5z = 1*/
	    RealMatrix coefficients =
	    	    new Array2DRowRealMatrix(new double[][] { { 2, 3, -2 }, { -1, 7, 6 }, { 4, -3, -5 } },
	    	                       false);
	    RealVector constants = new ArrayRealVector(new double[] { 1, -2, 1 }, false);
	    LUDecomposition solver = new LUDecomposition(coefficients);
	    RealVector solucion = solver.getSolver().solve(constants);
	    System.out.println(solucion);
	    QRDecomposition solver3 = new QRDecomposition(coefficients);
	    RealVector solucion3 = solver3.getSolver().solve(constants);
	    System.out.println(solucion3);
	}
}
