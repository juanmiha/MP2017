package org.mp.sesion02;

import java.util.GregorianCalendar;
/**
 * ObjetoGemotrico
 *
 * @author Juan Miguel Herrada Acosta
 * @version 1.04.2017
 */
public abstract class ObjetoGeometrico {

	protected String color = "blanco";
	protected boolean relleno = false;
	protected GregorianCalendar fechaCreado;
	/**Constructor por defecto*/
	protected ObjetoGeometrico() {
		super();
		fechaCreado = new GregorianCalendar();
	}
	/**Constructor especificando el color y el relleno */
	protected ObjetoGeometrico(String color, boolean relleno) {
		super();
		fechaCreado = new GregorianCalendar();
		this.color = color;
		this.relleno = relleno;
	}
	/** Devuelve el color*/
	public String getColor() {
		return color;
	}
	/** Pone un color nuevo*/
	public void setColor(String color) {
		this.color = color;
	}
	/** Devuelve el relleno*/
	public boolean esRelleno() {
		return relleno;
	}
	/** Pone un relleno nuevo*/
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	/** Devuelve la fecha en que fué creado*/
	public GregorianCalendar getFechaCreado() {
		return fechaCreado;
	}
	/** Devuelve un string que representa ese objeto */
	public String toString() {
		return "Creado el " + fechaCreado + "\ncolor: " + color
				+ " y relleno: " + relleno;
	}
	/** Método abstracto getArea*/
	public abstract double getArea();
	/** Método abstracto getPerimetro*/
	public abstract double getPerimetro();

}

