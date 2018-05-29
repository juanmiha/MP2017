package org.mp.tema02;
public class RectanguloComparable extends Rectangulo implements Comparable <RectanguloComparable>{

	public RectanguloComparable (double anchura, double altura){
		super(anchura, altura);
	}

	/**
	 * Método que compara dos rectángulos devolviendo 0 si son iguales, -1 si el
	 * primero es menor y 1 si el primero es mayor
	 *
	 * @param obj
	 * @return un entero 0, -1, 1
	 */
	public int compareTo(RectanguloComparable o) {
		if (getArea() == o.getArea())
			return 0;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 1;

	}
	@Override
	public String toString() {
		return super.toString()+ " Área: " + getArea();
	}







}
