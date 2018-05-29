package org.mp.tema06.math;

import org.apache.commons.math3.random.RandomData;
import org.apache.commons.math3.random.RandomDataImpl;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
//import org.pc.utilidades.NumerosAleatorios;

public class EstadisticaDescriptiva {
	// http://commons.apache.org/math/userguide/stat.html#a1.2_Descriptive_statistics
	public static void descriptiveStatisticsInstance(double[] datos) {
		// Crea una instacia DescriptiveStatistics
		DescriptiveStatistics stats = new DescriptiveStatistics();
		// A�ade los datos al array
		for (int i = 0; i < datos.length; i++) {
			stats.addValue(datos[i]);
		}
		// Algunos valores estadisticos
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		double median = stats.getPercentile(50);
		System.out.println("Media = " + mean +" Desviaci�n estandar =  "+ std + " Mediana =  "+ median);
	}
	public static void summaryStatisticsInstance(double[] datos) {
		SummaryStatistics stats = new SummaryStatistics();
		for (int i = 0; i < datos.length; i++) {
			stats.addValue(datos[i]);
		}
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		// double median = stats.getMedian(); <-- NOT AVAILABLE
		System.out.println("Media = " + mean +" Desviaci�n estandar =  "+ std);
	}
	public static void statUtils(double[] datos) {
		// Calcula estadisticas desde una double[] array
		double mean = StatUtils.mean(datos);
		double std = StatUtils.variance(datos);
		double median = StatUtils.percentile(datos, 50);
		System.out.println("Media = " + mean +" Desviaci�n estandar =  "+ std + " Mediana =  "+ median);
		// Media de los tres primeros
		//mean = StatUtils.mean(datos, 0, 3);
		System.out.println("media de los tres primeros = " + StatUtils.mean(datos, 0, 3));
		System.out.println( "min: " + StatUtils.min( datos ) );
		System.out.println( "max: " + StatUtils.max( datos ) );
		System.out.println( "media: " + StatUtils.mean( datos ) );
		System.out.println( "producto: " + StatUtils.product( datos ) );
		System.out.println( "suma: " + StatUtils.sum( datos ) );
		System.out.println( "varianza: " + StatUtils.variance( datos ) );
	}

	public static void main(String[] args) {	
		/*NumerosAleatorios na = new NumerosAleatorios();
		double[] datos = new double[100];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = na.randomReal();
		}*/
		
		RandomData randomData = new RandomDataImpl(); 
		double[] datos = new double[100];
		for (int i = 0; i < 100; i++) {
			datos[i] = randomData.nextInt(1, 100);
		}

		EstadisticaDescriptiva.descriptiveStatisticsInstance(datos);
		EstadisticaDescriptiva.summaryStatisticsInstance(datos);
		EstadisticaDescriptiva.statUtils(datos);
	}
}
