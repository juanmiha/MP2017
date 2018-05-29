package org.mp.sesion07;
/**
*
* @author Juan Miguel Herrada Acosta
* @version 05/06/2017
*/
public class BandaInt {

	private String nombreBanda;
	private int[][] datos;

	/**
	 * Constructor BandaInt. Instancia una BandaInt pasando como parametro el
	 * nombre de la banda, numero de columnas y numero de lineas.
	 *
	 * @param nombre
	 *            nombre d e la banda
	 * @param x
	 *            numero de columnas
	 * @param y
	 *            numero de lineas
	 */
	public BandaInt(String nombre, int x, int y) {
		super();
		this.nombreBanda = nombre;
		this.datos = new int[x][y];
	}

	/**
	 * Constructor BandaInt. Instancia una BandaInt pasando como parametro el
	 * nombre de la banda y uma matriz int con los datos.
	 *
	 * @param nombre
	 *            nombre d e la banda
	 * @param datos
	 *            matriz int con los datos de la banda
	 */

	public BandaInt(String nombre, int[][] datos) {
		super();
		this.nombreBanda = nombre;
		this.datos = datos.clone();
	}

	/**
	 * Metodo getter del nombre de la banda
	 *
	 * @return nombre de la banda
	 */
	public String getNombreBanda() {
		return this.nombreBanda;
	}

	/**
	 * Metodo setter del nombre de la banda
	 *
	 * @param nombreBanda
	 *            nombre de la banda
	 */
	public void setNombreBanda(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}

	/**
	 * Metodo getter de los datos de la banda
	 *
	 * @return int[][] con los datos de la banda
	 */
	public int[][] getDatos() {
		return this.datos;
	}

	/**
	 * Metodo setter de los datos de la banda
	 *
	 * @param datos
	 *            int[][] con los datos de la banda
	 */
	public void setDatos(int[][] datos) {
		this.datos = datos;
	}

	/**
	 * Metodo getter de un dato (x,y) de la banda
	 *
	 * @param x
	 *            numero de columna
	 * @param y
	 *            numero de linea
	 * @return dato (x,y) de la banda
	 */
	public int getDatosXY(int x, int y) {
		return datos[x][y];
	}

	/**
	 * Metodo setter de un dato (x,y) de la banda
	 *
	 * @param dato
	 *            dato a añadir a la banda
	 * @param x
	 *            numero de columna de la banda
	 * @param y
	 *            numero de linea de la banda
	 * @return dato (x,y) de la banda ¿¿¿???
	 */
	public int setDatosXY(int dato, int x, int y) {
		int temp=this.datos[x][y];
		this.datos[x][y] = dato;
		return temp;
	}

	/**
	 * Metodo toString de BandaInt. Devuelve el nombre de la banda
	 *
	 *  @return nombre de la banda
	 */
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(nombreBanda + ": \n");
		for(int i = 0; i < datos.length; i++){

			for(int j = 0; j < datos[i].length; j++){

				sb.append(datos[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();

		return sb.toString();
	}
}