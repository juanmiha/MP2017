package org.mp.sesion02;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Profesor
 *
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public class Profesor extends Empleado {
	protected String horarioTutoria;
	protected int categoría;
	/**
	 * Constructor por defecto
	 */
	public Profesor(){
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
	 * @param horarioTutoria
	 * @param categoría
	 */
	public Profesor(String nombre,String dirección,String teléfono,String email,String despacho,int salario,GregorianCalendar fechaContratación,String horarioTutoria,int categoría ){
		super(nombre,dirección,teléfono,email,despacho,salario,fechaContratación);
		this.horarioTutoria= horarioTutoria;
		this.categoría= categoría;
	}
	/**
	 * Getter: Devuelve el valor de horarioTutoria.
	 *
	 * @return horarioTutoria
	 */
	public String getHorarioTutoria() {
		return horarioTutoria;
	}
	/**
	 * Set: Asigna el valor de horarioTutoria a horarioTutoria.
	 *
	 * @return horarioTutoria
	 */
	public void setHorarioTutoria(String horarioTutoria) {
		this.horarioTutoria = horarioTutoria;
	}
	/**
	 * Getter: Devuelve el valor de categoría.
	 *
	 * @return categoría
	 */
	public int getCategoría() {
		return categoría;
	}
	/**
	 * Set: Asigna el valor de categoría a categoría.
	 *
	 * @return categoría
	 */
	public void setCategoría(int categoría) {
		this.categoría = categoría;
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
		Profesor other = (Profesor) obj;
		if (categoría != other.categoría)
			return false;
		if (horarioTutoria == null) {
			if (other.horarioTutoria != null)
				return false;
		} else if (!horarioTutoria.equals(other.horarioTutoria))
			return false;
		return true;
	}
	@Override
	/**
	 *toString: Devuevle en una cadena los valores de todas sus propiedades añadiendo las heredadas de Empleado, teniedo en cuenta el categoria que tienen.
	 *
	 */
	public String toString() {
		if (getCategoría() == 1)
			return "Profesor Ayudante\n" + "Nombre = "+ super.nombre +", Dirección = " + super.dirección +", Teléfono = "+ super.teléfono + ", email = " + super.email +"\n"
			+ "Despacho = " + super.despacho + ", salario = " + super.salario + ", Fecha de contratación = " + super.fechaContratación.get(Calendar.DAY_OF_MONTH) +"/" + (super.fechaContratación.get(Calendar.MONTH)+1)+ "/"
			+ super.fechaContratación.get(Calendar.YEAR) + "\n"
			+ "Horario = " + horarioTutoria;
		else if (getCategoría() == 2)
			return "Profesor Titular de Universidad\n" + "Nombre = "+ super.nombre +", Dirección = " + super.dirección +", Teléfono = "+ super.teléfono + ", email = " + super.email +"\n"
			+ "Despacho = " + super.despacho + ", salario = " + super.salario + ", Fecha de contratación = " + super.fechaContratación.get(Calendar.DAY_OF_MONTH) +"/" + (super.fechaContratación.get(Calendar.MONTH)+1)+ "/"
			+ super.fechaContratación.get(Calendar.YEAR) + "\n"
			+ "Horario = " + horarioTutoria;

		return "Profesor Catedrático de Universidad\n" + "Nombre = "+ super.nombre +", Dirección = " + super.dirección +", Teléfono = "+ super.teléfono + ", email = " + super.email +"\n"
		+ "Despacho = " + super.despacho + ", salario = " + super.salario + ", Fecha de contratación = " + super.fechaContratación.get(Calendar.DAY_OF_MONTH) +"/" + (super.fechaContratación.get(Calendar.MONTH)+1)+ "/"
		+ super.fechaContratación.get(Calendar.YEAR) + "\n"
		+ "Horario = " + horarioTutoria;
	}


}
