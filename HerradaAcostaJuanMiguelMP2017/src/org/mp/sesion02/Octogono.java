package org.mp.sesion02;

import java.util.GregorianCalendar;

@SuppressWarnings("rawtypes")
/**
 * Octogono
 *
 * @author Juan Miguel Herrada Acosta
 * @version 01.04.2017
 */
public class Octogono extends ObjetoGeometrico implements Comparable,Cloneable,DeColor{

	protected double lado;

	/**Constructor por defecto*/
	protected Octogono() {
		super();
		fechaCreado = new GregorianCalendar();
	}
	/**Constructor especificando el color , el relleno y el lado */
	protected Octogono(String color, boolean relleno,double lado) {
		super();
		fechaCreado = new GregorianCalendar();
		this.color = color;
		this.relleno = relleno;
		this.lado = lado;
	}
	/**
	 * Getter: Devuelve el valor de  lado
	 * @return lado
	 */
	public double getLado(){
		return lado;
	}
	/**
	 * Set: Asigna el valor lado a lado
	 * @param lado
	 */
	public void setLado(double lado){
		this.lado = lado;
	}
	@Override
	/**
	 * Calcula el area del Octogono
	 */
	public double getArea() {
		// TODO Auto-generated method stub
		return (2 + (4/Math.sqrt(2)))*lado*lado;
	}

	@Override
	/**
	 * Calcula el perimetro del Octogono
	 */
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 8 * lado;
	}

	@Override
	/**
	 * Compara los lados de dos Octogonos y dice cual es el mayor
	 */
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Octogono otro = (Octogono) o;

		if (lado > otro.getLado())
			return 1;
		else if (lado < otro.getLado())
			return -1;
		else
			return 0;
	}
	/**
	 * Clona un octogono
	 */
	public Object clone(){
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException ex){
			return null;
		}

	}
	@Override
	/**
	 *	Devuvle una cadena de como colorear
	 */
	public String comoColorear() {
		// TODO Auto-generated method stub
		return "Colorear los 8 lados de " + getColor();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	/**
	 * Devuelve una cadena con el nombre de las propiedades y sus valores añadiendo las heredadas de ObjetoGeometrico
	 */
	public String toString() {
		return super.toString();
	}

}
