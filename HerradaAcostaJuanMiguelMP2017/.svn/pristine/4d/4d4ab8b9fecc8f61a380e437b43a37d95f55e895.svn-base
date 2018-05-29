package org.mp.sesion02;
/**
 * Persona
 *
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public class Persona {
	protected String nombre;
	protected String dirección;
	protected String teléfono;
	protected String email;

	/**
	 * Constructor
	 *
	 * @param nombre
	 * @param dirección
	 * @param teléfono
	 * @param email
	 */
	public Persona(){
		this.nombre = "";
		this.dirección = "";
		this.teléfono = "";
		this.email = "";
	}
	/**
	 * Constructor
	 *
	 * @param nombre
	 * @param dirección
	 * @param teléfono
	 * @param email
	 */
	public Persona(String nombre, String dirección, String teléfono, String email) {
		super();
		this.nombre = nombre;
		this.dirección = dirección;
		this.teléfono = teléfono;
		this.email = email;
	}
	/**
	 *  Getter: Devuelve el valor de nombre.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 *  Set :Asigna el valor de nombre a nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 *  Getter: Devuelve el valor de dirección.
	 * @return dirección
	 */
	public String getDirección() {
		return dirección;
	}
	/**
	 *  Set :Asigna el valor de dirección a dirección.
	 * @param dirección
	 */
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	/**
	 *  Getter: Devuelve el valor de teléfono.
	 * @return teléfono
	 */
	public String getTeléfono() {
		return teléfono;
	}
	/**
	 *  Set :Asigna el valor de teléfono a teléfono.
	 * @param teléfono
	 */
	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}
	/**
	 *  Getter: Devuelve el valor de email.
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 *  Set :Asigna el valor de email a email.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dirección == null) {
			if (other.dirección != null)
				return false;
		} else if (!dirección.equals(other.dirección))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (teléfono == null) {
			if (other.teléfono != null)
				return false;
		} else if (!teléfono.equals(other.teléfono))
			return false;
		return true;
	}
	@Override
	/**
	 *toString: Devuevle en una cadena los valores de todas sus propiedades..
	 *
	 */
	public String toString() {
		return "Persona [nombre=" + nombre + ", dirección=" + dirección + ", teléfono=" + teléfono + ", email=" + email
				+ "]";
	}



}
