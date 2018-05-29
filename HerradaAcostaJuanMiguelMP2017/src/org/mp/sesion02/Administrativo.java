package org.mp.sesion02;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Administrativo
 *
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public class Administrativo extends Empleado {
	protected String destino;
	/**
	 * Constructor por defecto
	 */
	public Administrativo(){
		super();
	}
	/**
	 * Constructor
	 *
	 * @param nombre
	 * @param dirección
	 * @param teléfono
	 * @param email
	 * @param despacho
	 * @param salario
	 * @param fechaContratación
	 * @param destino
	 */
	public Administrativo(String nombre,String dirección,String teléfono,String email,String despacho,int salario,GregorianCalendar fechaContratación,String destino){
		super(nombre,dirección,teléfono,email,despacho,salario,fechaContratación);
		this.destino = destino;
	}
	/**
	 * Getter: Devuelve el valor de destino.
	 *
	 * @return destino
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * Set: Asigna el valor de destino a destino.
	 *
	 * @return destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * Equals
	 *
	 * Indica si algún otro objeto es "igual a" este.
	 *
	 * @param Object
	 * @return true or False.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrativo other = (Administrativo) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		return true;
	}

	@Override
	/**
	 *toString: Devuevle en una cadena los valores de todas sus propiedades añadiendo las heredadas de Empleado.
	 *
	 */
	public String toString() {
		return "Administrativo\n"+  "Nombre = "+ super.nombre +", Dirección = " + super.dirección +", Teléfono = "+ super.teléfono + ", email = " + super.email +"\n"
				+ "Despacho = " + super.despacho + ", salario = " + super.salario + ", Fecha de contratación = " + super.fechaContratación.get(Calendar.DAY_OF_MONTH) +"/" + (super.fechaContratación.get(Calendar.MONTH)+1)+ "/"
				+ super.fechaContratación.get(Calendar.YEAR) + "\n"+ "Destinado en la unidad " + destino;
	}

}
