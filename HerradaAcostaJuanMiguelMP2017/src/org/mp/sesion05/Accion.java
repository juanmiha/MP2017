package org.mp.sesion05;
/**
 * Accion
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
public class Accion implements Comparable{
	private String nombre;
	private long volumen;
	/**
	 * Constructor: Inicializa nombre y volumen
	 * @param nombre
	 * @param volumen
	 */
	public Accion(String nombre,long volumen){
		super();
		this.nombre = nombre;
		this.volumen = volumen;
	}
	/**
	 * Devuelve el valor de nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asigna el valor de nombre a la variable nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el valor de volumen
	 * @return
	 */
	public long getVolumen() {
		return volumen;
	}
	/**
	 * Asigna el valor de volumen a la variable volumen
	 * @param volumen
	 */
	public void setVolumen(long volumen) {
		this.volumen = volumen;
	}
	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accion other = (Accion) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (volumen != other.volumen)
			return false;
		return true;
	}
	/**
	 * Devuelve un String con los nombres y valores de las variables de la clase
	 *
	 */
	@Override
	public String toString() {
		return "Accion [nombre=" + nombre + ", volumen=" + volumen + "]";
	}
	/**
	 * Compara dos objetos de la clase Accion por su nombre
	 * 	 		Devuelve 1 si this.getNombre() es mayor que otra.getNombre()
	 * 			Devuelve -1 si this.getNombre() es menor que otra.getNombre()
	 * 			Devuelve 0 si this.getNombre() es igual que otra.getNombre()
	 *
	 * @param o
	 * @return 1,-1 or 0
	 */
	public int compareTo (Object o){
		Accion otra=(Accion) o;
		if (this.getNombre().compareTo(otra.getNombre())>0){
			return 1;
		}else if (this.getNombre().compareTo(otra.getNombre())<0){
			return -1;
		}else {
			return 0;
		}
	}

}
