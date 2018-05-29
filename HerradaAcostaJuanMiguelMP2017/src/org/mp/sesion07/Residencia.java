package org.mp.sesion07;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
*
* @author Juan Miguel Herrada Acosta
* @version 05/06/2017
*/
public class Residencia implements Serializable{

	private String nombre;
	private ArrayList<Habitacion> habitaciones;
	private ArrayList<Residente> residentes;
	private ArrayList<Reserva> reservas;

	/**
	 * Instancia una nueva residencia
	 *
	 * @param nombre
	 *            nombre de la residencia
	 */
	public Residencia(String nombre){
		super();
		this.nombre = nombre;
		this.residentes = new ArrayList<Residente>();
		this.habitaciones = new ArrayList<Habitacion>();
		this.reservas = new ArrayList<Reserva>();
	}
	/**
	 * Instancia una nueva residencia
	 *
	 * @param nombre
	 *            nombre de la residencia
	 * @param Habitaciones
	 * 			  array con todas las habitaciones que tiene la residencia
	 */
	public Residencia(String nombre, Habitacion[] habitaciones) {
		this.nombre = nombre;
		this.habitaciones = new ArrayList<Habitacion>();
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i] != null) {
				this.habitaciones.add(habitaciones[i]);
			}
		}
		residentes = new ArrayList<Residente>();
		reservas = new ArrayList<Reserva>();
	}

	/**
	 * Insertar habitacion.
	 *
	 * @param habitacion
	 *            Habitacion a insertar
	 */
	public void insertarHabitacion(Habitacion habitacion) {

		if (buscarHabitacion(habitacion.getNumero()) == null) {
			habitaciones.add(habitacion);
		}
	}

	/**
	 * Buscar habitacion.
	 *
	 * @param string
	 *            String con el numero de habitacion
	 * @return Si encuentra habitación con ese numero la devuevle, sino devuelve
	 *         null
	 */
	public Habitacion buscarHabitacion(String string) {
		Iterator<Habitacion> iterador = habitaciones.iterator();
		Habitacion habitacion;
		while (iterador.hasNext()) {
			habitacion = iterador.next();
			if (habitacion.getNumero().equals(string)) {
				return habitacion;
			}
		}

		return null;
	}

	/**
	 * Eliminar habitacion.
	 *
	 * @param habitacion
	 *            Habitacion a eliminar
	 */
	public void eliminarHabitacion(Habitacion habitacion) {
		habitaciones.remove(habitacion);

	}

	/**
	 * Ingreso reserva.
	 *
	 * @param residente
	 *            Residente que solicita la reserva
	 * @param habitacion
	 *            Habitacion que solicita el residente
	 * @param fechaEntrada
	 *            Fecha de entrada
	 * @param fechaSalida
	 *            Fecha de salida
	 */
	private void ingresoReserva(Residente residente, Habitacion habitacion, Date fechaEntrada,Date fechaSalida) {
		reservas.add(new Reserva(residente, habitacion, fechaEntrada, fechaSalida));
	}

	/**
	 * Ingreso residente.
	 *
	 * @param nombre
	 *            Nombre Residente
	 * @param dni
	 *            Dni residente
	 * @param sexo
	 *            Sexo residente
	 * @param fechaNacimiento
	 *            Fecha nacimiento residente
	 */
	private void ingresoResidente(String nombre, String dni, char sexo, Date fechaNacimiento) {

		boolean residenteExiste = false;

		Iterator<Residente> it = residentes.iterator();
		while (it.hasNext()) {
			Residente r = it.next();
			if (r.getDni().equals(dni)) {
				residenteExiste = true;
				break;
			}
		}

		Residente residente = new Residente(nombre, dni, sexo, fechaNacimiento);
		if (!residenteExiste) {
			residentes.add(residente);
		}

	}

	/**
	 * Ingreso.
	 *
	 * @param residente
	 *            Residente a ingresar
	 * @param habitacion
	 *            Habitacion asignada
	 * @param fechaEntrada
	 *            Fecha de entrada
	 * @param fechaSalida
	 *            Fecha de salida
	 */
	public void ingreso(Residente residente, Habitacion habitacion, Date fechaEntrada, Date fechaSalida) {
		if (fechaEntrada.before(fechaSalida) || fechaEntrada.equals(fechaSalida)) {
			if (!(isHabitacionOcupada(habitacion, fechaEntrada) || isHabitacionOcupada(habitacion,fechaSalida))) {
				ingresoReserva(residente, habitacion, fechaEntrada, fechaSalida);
				ingresoResidente(residente.getNombre(), residente.getDni(), residente.getSexo(),
						residente.getFechaNacimiento());
			}
		}
	}

	/**
	 * Cambiar habitacion.
	 *
	 * @param residente
	 *            Residente que solicita cambio de habitacion
	 * @param habitacion
	 *            Habitacion elegida por el residente
	 * @param fechaEntrada
	 *            Fecha entrada
	 * @param fechaSalida
	 *            Fecha salida
	 */
	public void cambiarHabitacion(Residente residente, Habitacion habitacion, Date fechaEntrada, Date fechaSalida) {
		/**
		 * Para realizar el cambio de habitación, primero buscamos la reserva
		 * anterior del residente, utilizando como criterio de búsqueda al
		 * Residente y comprobando que la fecha de Salida aun no ha pasado.
		 * Acto seguido se modifica la fecha de salida de la reserva anterior
		 * y se genera la nueva reserva.
		 */
		Date fecha = new Date();

		Iterator<Reserva> iterador = reservas.iterator();

		while (iterador.hasNext()) {
			Reserva reserva = iterador.next();
			if (reserva.getResidente().equals(residente) && reserva.getFechaSalida().after(fecha)) {
				reserva.setFechaSalida(fecha);
				break;
			}
		}

		ingresoReserva(residente, habitacion, fechaEntrada, fechaSalida);
	}

	/**
	 * Salida de un residente.
	 *
	 * @param residente
	 *            Residente de la salida
	 * @param fechaSalida
	 *            Fecha de la salida
	 */
	public void salida(Residente residente, Date fechaSalida) {

		Iterator<Reserva> iterador = reservas.iterator();

		while (iterador.hasNext()) {
			Reserva reserva = iterador.next();
			if (reserva.getResidente().equals(residente) && reserva.getFechaSalida().after(fechaSalida)) {
				reserva.setFechaSalida(fechaSalida);
				break;
			}
		}

		for (int i = 0; i < residentes.size(); i++) {
			Residente otroResidente = residentes.get(i);
			if (otroResidente.equals(residente)) {
				residentes.remove(i);
			}
		}

	}



	/**
	 * Metodo getter del nombre de la residencia
	 *
	 * @return Nombre de la residencia
	 */
	public String getNombre(){
		return nombre;
	}

	/**
	 * Metodo getter del Nº de habitaciones
	 *
	 * @return Nº d habitaciones
	 */
	public int getNHabitaciones() {
		return habitaciones.size();
	}

	/**
	 * Metodo getter del Nº de reservas
	 *
	 * @return Nº de reservas
	 */
	public int getNReservas() {
		return reservas.size();
	}

	/**
	 * Metodo getter del nº de residentes
	 *
	 * @return Nº de residentes
	 */
	public int getNResidentes() {
		return residentes.size();
	}


	/**
	 * Metodo getter de los residentes
	 *
	 * @return Array con los residentes
	 */
	public Residente[] getResidentes() {
		Residente[] residente = new Residente[residentes.size()];
		for (int i = 0; i < residente.length; i++) {
			residente[i] = residentes.get(i);
		}
		return residente;
	}


	/**
	 * Metodo getter de las habitaciones
	 *
	 * @return Array con las habitaciones
	 */
	public Habitacion[] getHabitaciones() {
		Habitacion[] habitacion = new Habitacion[habitaciones.size()];
		for (int i = 0; i < habitacion.length; i++) {
			habitacion[i] = habitaciones.get(i);
		}
		return habitacion;
	}

	/**
	 * Metodo getter de las reservas
	 *
	 * @return ArrayList con las reseras
	 */
	public Reserva[] getReservas() {
		Reserva[] reserva = new Reserva[reservas.size()];
		for (int i = 0; i < reserva.length; i++) {
			reserva[i] = reservas.get(i);
		}
		return reserva;
	}

	/**
	 * Comprueba si una habitacion esta ocupada en una fecha determiada
	 *
	 * @param habitacion
	 *            Habitacion a comprobar si esta ocupada o no
	 *
	 * @param fecha
	 *            Fecha para determinar si la habitacion esta ocupada
	 * @return true si la habitacion esta ocupada, false en caso contrario
	 */
	public boolean isHabitacionOcupada(Habitacion habitacion,Date fecha){
		Iterator<Reserva> iterador = reservas.iterator();

		while (iterador.hasNext()) {
			Reserva reserva = iterador.next();
			if (reserva.getHabitacion().equals(habitacion) && (reserva.getFechaEntrada().before(fecha) || reserva.getFechaEntrada().equals(fecha))
					&& (((Date) reserva.getFechaSalida()).after(fecha) || reserva.getFechaSalida().equals(fecha))) {
				return true;
			}
		}
		return false;
	}



	/**
	 * Listado habitaciones libres.
	 *
	 * @param fecha
	 *            Fecha para comprobar habitaciones libres
	 * @return String con las habitaciones libres
	 */
	public String listadoHabitacionesLibres(Date fecha) {
		String libre = "Habitaciones libres a fecha de " + fecha + ": [";

		Iterator<Habitacion> iterador = habitaciones.iterator();
		while (iterador.hasNext()) {
			Habitacion habitacion = iterador.next();
			if (!isHabitacionOcupada(habitacion, fecha)) {
				libre += habitacion.getNumero() + " ";
			}
		}
		libre += "]";

		return libre;
	}


	/**
	 * Listado residentes habitaciones.
	 *
	 * @param fecha
	 *            Fecha para comprobar residentes
	 * @return String con los nombres de los residentes alojados en la fecha d,
	 *         con sus habitaciones asignadas.
	 */
	public String listadoResidentesHabitaciones(Date fecha) {

		Residente[] residenteAux = new Residente[reservas.size()];
		int contResidenteAux = 0;

		String listaResiHabit = "";

		for(int i = 0; i < reservas.size(); i++){
			if(isHabitacionOcupada(reservas.get(i).getHabitacion(),fecha)){
				residenteAux[contResidenteAux] = reservas.get(i).getResidente();
				contResidenteAux++;
			}
		}

		ordenarAlfabeticamente(residenteAux,contResidenteAux);

		for(int j=0; j<contResidenteAux; j++){
			listaResiHabit = listaResiHabit + residenteAux[j].getNombre()+"\n";
		}

		return listaResiHabit;
	}

	/**
	* Metodo que ordenar alfabeticamente un array de residentes (por nombre)
	* @param residentes
	* 					el array de residentes
	* @param numeroResidentes
	* 					el numero de residentes
	*/
	private void ordenarAlfabeticamente(Residente[] residentes, int numeroResidentes){
		Residente temp;
		for(int i = 0; i < numeroResidentes-1; i++){
			for(int j = i+1; j < numeroResidentes; j++){
				if(residentes[j].getNombre().compareToIgnoreCase(residentes[i].getNombre()) < 0){
					temp = residentes[i];
					residentes[i] = residentes[j];
					residentes[j] = temp;
				}
			}

		}
	}


	/**
	 * Listado edad media por sexo.
	 *
	 * @param fecha
	 *            Fecha para obtener los datos del listado de edad media por
	 *            sexo de residentes
	 * @return String con
	 */
	public String listadoEdadMediaPorSexo(Date fecha) {
		String listaEdadMSexo = "";
		if (getNResidentes() == 0) {
			return "0.0";
		} else {
			double mediaHombres = 0;
			int contHombres = 0;
			double mediaMujeres = 0;
			int contMujeres = 0;

			Iterator<Reserva> iterador = reservas.iterator();
			while (iterador.hasNext()) {
				Reserva reserva = iterador.next();
				if (reserva.getFechaEntrada().before(fecha) || reserva.getFechaEntrada().equals(fecha) && reserva.getFechaSalida().after(fecha)
						|| reserva.getFechaSalida().equals(fecha)) {
					if (reserva.getResidente().getSexo() == "V".charAt(0)) {
						mediaHombres += reserva.getResidente().getEdad(fecha);
						contHombres++;
					} else {
						mediaMujeres += reserva.getResidente().getEdad(fecha);
						contMujeres++;
					}
				}
			}

			listaEdadMSexo += "Listado de edad media por sexo:\n";
			if (mediaHombres == 0) {
				listaEdadMSexo += "- Media de los hombres: 0.0\n";
			} else {
				listaEdadMSexo += "- Media de los hombres: " + mediaHombres / contHombres
						+ "\n";
			}

			if (contMujeres == 0) {
				listaEdadMSexo += "- Media de las mujeres: 0.0\n";
			} else {
				listaEdadMSexo += "- Media de las mujeres: " + mediaMujeres / contMujeres
						+ "\n";
			}
			return listaEdadMSexo;
		}
	}
}

