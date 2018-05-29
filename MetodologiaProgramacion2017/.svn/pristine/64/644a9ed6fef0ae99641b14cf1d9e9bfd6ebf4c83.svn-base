package org.mp.tema01;

public class Circulo extends ObjetoGeometrico {
	private double radio;

	public Circulo() {
	}
	public Circulo(double radius) {
		this.radio = radius;
	}
	/**
	 * @param radio
	 * @param color
	 * @param relleno
	 */
	public Circulo(double radio, String color, boolean relleno) {
		this.radio = radio;
		setColor(color);
		setRelleno(relleno);
	}
	/** Devuelve el radio */
	public double getRadio() {
		return radio;
	}
	/** Pone un nuevo radio */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/** Devuelve el area */
	/**
	 * @return
	 */
	public double getArea() {
		return radio * radio * Math.PI;
	}
	/** Devuelve el diámetro */
	public double getDiametro() {
		return 2 * radio;
	}
	/** Devuelve el perímetro */
	public double getPerimetro() {
		return 2 * radio * Math.PI;
	}
	/* Muestra información sobre el círculo */
	public void printCirculo() {
		System.out.println("El circulo fu� creado " + getFechaCreado()
				+ " y el radio es " + radio);
	}
}
