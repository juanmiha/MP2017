package org.mp.sesion02;
import java.util.GregorianCalendar;
/**
 * Empleado
 *
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public class Empleado extends Persona {

	protected String despacho;
	protected int salario;
	protected GregorianCalendar fechaContratación;
	/**
	 * Constructor por defecto
	 */
	public Empleado(){
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
	 */
	public Empleado(String nombre, String dirección, String teléfono, String email,String despacho,int salario,GregorianCalendar fechaContratación){
		super(nombre,dirección,teléfono,email);
		this.despacho = despacho;
		this.salario = salario;
		this.fechaContratación = fechaContratación;
	}
	/**
	 * Getter: Devuelve el valor de despacho.
	 *
	 * @return despacho
	 */
	public String getDespacho() {
		return despacho;
	}
	/**
	 * Set: Asigna el valor de despacho a despacho.
	 *
	 * @param despacho
	 */
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	/**
	 * Getter: Devuelve el valor de salario.
	 * @return salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * Set: Asigna el valor de salario a salario.
	 *
	 * @param salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	/**
	 * Getter: Devuelve el valor de fechaContratación.
	 * @return fechaContratación
	 */
	public GregorianCalendar getFechaContratación() {
		return fechaContratación;
	}
	/**
	 * Set: Asigna el valor de fechaContratación a fechaContratación.
	 *
	 * @param fechaContratación
	 */
	public void setFechaContratación(GregorianCalendar fechaContratación) {
		this.fechaContratación = fechaContratación;
	}
	@Override
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
		Empleado other = (Empleado) obj;
		if (despacho == null) {
			if (other.despacho != null)
				return false;
		} else if (!despacho.equals(other.despacho))
			return false;
		if (fechaContratación == null) {
			if (other.fechaContratación != null)
				return false;
		} else if (!fechaContratación.equals(other.fechaContratación))
			return false;
		if (salario != other.salario)
			return false;
		return true;
	}
	@Override
	/**
	 *toString: Devuevle en una cadena los valores de todas sus propiedades añadiendo las heredadas de persona.
	 *
	 */
	public String toString() {
		return "Empleado\n" + "Nombre=" + super.nombre + ", Dirección=" + super.dirección + ", Teléfono=" + super.teléfono + ", email=" + super.email +
				"Despacho =" + despacho + ", salario =" + salario + ", Fecha de contratación =" + fechaContratación;
	}


}
