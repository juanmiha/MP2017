package org.mp.tema02;
import java.util.Date;

public abstract class ObjetoGeometrico {

	private String color = "blanco";
	private boolean relleno = false;
	private Date fechaCreado;
	/**Constructor por defecto*/
	protected ObjetoGeometrico() {
		super();
		fechaCreado = new Date();
	}
	/**Constructor especificando el color y el relleno */
	protected ObjetoGeometrico(String color, boolean relleno) {
		super();
		fechaCreado = new Date();
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
	public boolean isRelleno() {
		return relleno;
	}
	/** Pone un relleno nuevo*/
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	/** Devuelve la fecha en que fué creado*/
	public Date getFechaCreado() {
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

