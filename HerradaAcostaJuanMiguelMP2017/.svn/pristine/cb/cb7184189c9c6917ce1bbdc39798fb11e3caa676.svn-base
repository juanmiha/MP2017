package org.mp.sesion02;
/**
 * Estdudiante
 *
 * @author Juan Miguel Herrada Acosta
 * @version 31.03.2017
 */
public class Estudiante extends Persona {

	protected int nivel;
	/**
	 *Constructor
	 *
	 *@param nivel
	 *
	 */
	public Estudiante(){
		super();
		this.nivel = 0;
	}
	/**
	 * Constructor
	 *
	 * @param nombre
	 * @param dirección
	 * @param teléfono
	 * @param email
	 * @param nivel
	 */
	public Estudiante(String nombre, String dirección, String teléfono, String email,int nivel) {
		super(nombre,dirección,teléfono,email);
		this.nivel = nivel;
	}
	/**
	 * Gettet: Devuelve el valor de nivel.
	 *
	 * @return nivel
	 */
	public int getNivel() {
		return nivel;
	}
	/**
	 * Set: Asigna el valor de nivel a nivel.
	 *
	 * @param nivel
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;

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
		Estudiante other = (Estudiante) obj;
		if (nivel != other.nivel)
			return false;
		return true;
	}
	@Override
	/**
	 *toString: Devuevle en una cadena los valores de todas sus propiedades añadiendo las heredadas de persona.
	 *
	 */
	public String toString() {
		if (getNivel() == 1)
		return "Estudiante de Grado\n" + "Nombre = " + super.nombre + ", Dirección = " + super.dirección + ", Teléfono = " + super.teléfono + ", email = " + super.email;
		else if (getNivel() == 2)
			return "Estudiante de Máster\n" + "Nombre = " + super.nombre + ", Dirección = " + super.dirección + ", Teléfono = " + super.teléfono + ", email = " + super.email;
		return "Estudiante de Doctorado\n" + "Nombre = " + super.nombre+ ", Dirección = " + super.dirección + ", Teléfono = " + super.teléfono + ", email = " + super.email;

	}

}
