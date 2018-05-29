package org.mp.sesion07;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Juan Miguel Herrada Acosta
 * @version 05/06/2017
 */
public class Imagen {

	private String formatoImagen;
	private ArrayList<BandaInt> bandas;
	private int lineas;
	private int columnas;

	/**
	 * Instancia una nueva imagen.
	 *
	 * @param lineas
	 *            numero de lineas de las bandas
	 * @param columnas
	 *            numero de columnas de las bandas
	 * @param formatoImagen
	 *            formato de la imagen
	 */
	public Imagen(int lineas, int columnas, String formatoImagen) {
		super();
		this.lineas = lineas;
		this.columnas = columnas;
		this.formatoImagen = formatoImagen;
		this.bandas = new ArrayList<BandaInt>();
	}

	/**
	 * Metodo getter de los datos de un pixel en concreto
	 *
	 * @param x
	 *            indice columna de las bandas
	 * @param y
	 *            indice linea de las bandas
	 * @return datos de un pixel en concreto de todas las bandas
	 * @throws XYFueraImagenException
	 *             comprueba que los puntos x1,y1 no esten fuera del rango de
	 *             las bandas de la imagen
	 */
	public int[] getDatosPixel(int x, int y) throws XYFueraImagenException {
		if(!XYValida(x,y,x,y)){
			throw new XYFueraImagenException("XY no valida");
		}
		int[] datos = new int[getNumeroBandas()];
		int i = 0;
		for(Iterator<BandaInt> iterator = bandas.iterator();iterator.hasNext();){
			BandaInt banda = (BandaInt) iterator.next();
			datos[i] = banda.getDatosXY(x, y);
			i++;
		}
		return datos;
	}

	/**
	 * Extrae los datos de las bandas de la imagen desde los puntos x1,y1 hasta
	 * x2,y2
	 *
	 * @param x1
	 *            indice inicio de las columnas de las bandas a leer
	 * @param y1
	 *            indice inicio de las lineas de las bandas a leer
	 * @param x2
	 *            indice final de las columnas de las bandas a leer
	 * @param y2
	 *            indice final de las lineas de las bandas a leer
	 * @return imagen con todos los datos de los puntos del rango x1,y1 - x2,y2
	 *         de las bandas
	 * @throws XYFueraImagenException
	 *             comprueba que los puntos x1,y1 - x2,y2 no esten fuera del
	 *             rango de las bandas de la imagen
	 */
	public Imagen extraerImagen(int x1, int y1, int x2, int y2)throws XYFueraImagenException {
		if(!XYValida(x1,y1,x2,y2)){
			throw new XYFueraImagenException("XY no valida");
		}
		int lin = y2 - y1 + 1;
		int col = x2 - x1 + 1;
		Imagen imagenEx= new Imagen(lin,col,this.formatoImagen);
		for(int i = 0; i<bandas.size();i++){
			int[][] datos = new int[lin][col];
			for(int j = y1, c = 0; j < y2; j++, c++){

				for(int k = x1, f = 0; k < x2; k++, f++){

					datos[c][f] = getBanda(i).getDatosXY(j, k);
				}
			}
			BandaInt bandaIntegers = new BandaInt(getBanda(i).getNombreBanda(), datos);
			imagenEx.anadirBanda(bandaIntegers);
		}
		return imagenEx;
	}

	/**
	 * Añade una banda a la imagen
	 *
	 * @param banda
	 *            banda a añadir
	 */
	public void anadirBanda(BandaInt banda) {
		bandas.add(banda);
	}

	/**
	 * Elimina una banda de la imagen
	 *
	 * @param i
	 *            indice de la banda a eliminar
	 */
	public void eliminarBanda(int i) {
		bandas.remove(i);
	}

	/**
	 * Metodo getter de una banda de la imagen
	 *
	 * @param i
	 *            indice de la banda
	 * @return banda de la imagen con el indice i
	 */
	public BandaInt getBanda(int i) {
		return bandas.get(i);
	}

	/**
	 * Metodo getter de todas las bandas de la imagen
	 *
	 * @return Todas las bandas de la imagen
	 */
	public ArrayList<BandaInt> getBandas() {
		return bandas;
	}

	/**
	 * Metodo getter del numero de bandas de la imagen
	 *
	 * @return numero de bandas
	 */
	public int getNumeroBandas() {
		return bandas.size();
	}

	/**
	 * Metodo getter del numero de lineas de las bandas de la imagen
	 *
	 * @return numero de lineas
	 */
	public int getLineas() {
		return this.lineas;
	}

	/**
	 * Metodo getter del numero de columnas de las bandas de la imagen
	 *
	 * @return numero de columnas
	 */
	public int getColumnas() {
		return this.columnas;
	}

	/**
	 * Metodo getter del formato de la imagen
	 *
	 * @return formato de la imagen
	 */
	public String getFormatoImagen() {
		return this.formatoImagen;
	}

	/**
	 * Metodo setter del formato de la imagen
	 *
	 * @param formatoImagen
	 *            formato de la imagen a settear
	 */
	public void setFormatoImagen(String formatoImagen) {
		this.formatoImagen = formatoImagen;
	}

	/**
	 * Metodo setter de las bandas de la imagen
	 *
	 * @param bandas
	 *            bandas a settear
	 */
	@SuppressWarnings("rawtypes")
	public void setBandas(ArrayList bandas) {
		for(int i = 0; i < bandas.size();i++){

			BandaInt bandas1 = (BandaInt) bandas.get(i);

			this.bandas.add(bandas1);
		}

	}

	/**
	 * Valida el rango de puntos x1,y1 - x2,y2 de las bandas de la imagen
	 *
	 * @param x1
	 *            indice inicio de las columnas de las bandas
	 * @param y1
	 *            indice inicio de las lineas de las bandas
	 * @param x2
	 *            indice final de las columnas de las bandas
	 * @param y2
	 *            indice final de las lineas de las bandas
	 *
	 * @return true en caso de ser un rango correcto, false en caso contrario
	 */
	private boolean XYValida(int x1,int y1,int x2,int y2){
		boolean b = false;
		if(x1>= 0 & x1<=columnas & y1>=0 & y1<= lineas){
			if(x2>= 0 & x2<=columnas & y2>=0 & y2<= lineas){
				b = true;
			}
		}
		return b;
	}


}
