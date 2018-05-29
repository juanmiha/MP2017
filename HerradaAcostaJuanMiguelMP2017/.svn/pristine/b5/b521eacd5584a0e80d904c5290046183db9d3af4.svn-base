package org.mp.sesion06;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
/**
 * Estadistica
 * @author Juan Miguel Herrada Acosta
 * @version 07/05/2017
 */
public class Estadistica {

	private ConjuntoDatos cd;
	/**
	 * Constructor inicializa cd  a un conjuntosDatos cd
	 * @param cd
	 */
	public Estadistica(ConjuntoDatos cd) {
		super();
		this.cd = cd;
	}
	/**
	 * Devuelve la media de un array de doubles correspondiente  al parametro columna pasado al metodo
	 * @param columna
	 * @return
	 * @throws Exception
	 */
    public double media(String columna) throws Exception{
    	double[] datos = cd.getColumna(columna);
    	DescriptiveStatistics stats = new DescriptiveStatistics();
    	for(int i=0; i<datos.length; i++){
    		stats.addValue(datos[i]);
    	}
    	return stats.getMean();
    }
    /**
     * Devuelve el maximo de un array de doubles correspondiente  al parametro columna pasado al metodo
     * @param columna
     * @return
     * @throws Exception
     */
    public double max(String columna) throws Exception{
    	double[] datos = cd.getColumna(columna);
    	DescriptiveStatistics stats = new DescriptiveStatistics();
    	for(int i=0; i<datos.length; i++){
    		stats.addValue(datos[i]);
    	}
    	return stats.getMax();
    }
    /**
     * Devuelve el minimo de un array de doubles correspondiente  al parametro columna pasado al metodo
     * @param columna
     * @return
     * @throws Exception
     */
    public double min(String columna) throws Exception{
    	double[] datos = cd.getColumna(columna);
    	DescriptiveStatistics stats = new DescriptiveStatistics();
    	for(int i=0; i<datos.length; i++){
    		stats.addValue(datos[i]);
    	}
    	return stats.getMin();
    }
    /**
     * Devuelve la suma de un array de doubles correspondiente  al parametro columna pasado al metodo
     * @param columna
     * @return
     * @throws Exception
     */
    public double suma(String columna) throws Exception{
    	double[] datos = cd.getColumna(columna);
    	DescriptiveStatistics stats = new DescriptiveStatistics();
    	for(int i=0; i<datos.length; i++){
    		stats.addValue(datos[i]);
    	}
    	return stats.getSum();
    }
}
