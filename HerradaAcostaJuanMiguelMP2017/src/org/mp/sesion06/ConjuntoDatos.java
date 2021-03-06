package org.mp.sesion06;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
*
* @author Juan Miguel Herrada Acosta
* @version 05/05/2017
*/
public class ConjuntoDatos {
	private File archivoTexto;
	private String separador;
	private Locale locale;
	private List<String> cabecera;
	private int numeroLineas;
	private int numeroColumnas;
	private double[][] datos;

	public ConjuntoDatos(File archivoTexto,String separador,Locale locale) throws IOException,Exception{
		super();
		this.archivoTexto = archivoTexto;
		this.separador = separador;
		this.locale = locale;
		this.cabecera = cabecera(archivoTexto);
		this.numeroLineas = numLineas(archivoTexto);
		this.numeroColumnas = numColumnas(archivoTexto);
		this.datos = leerDatos(archivoTexto,numeroLineas,numeroColumnas);
	}
	/**
	 * Devuelve un array que contiene la cabecera del archivoTexto
	 *
	 * @param archivoTexto
	 *
	 * @return cabecera
	 *
	 * @throws IOException
	 */
	private List<String> cabecera(File archivoTexto) throws IOException {
		FileReader lectura = new FileReader(archivoTexto);
		BufferedReader guardado = new BufferedReader(lectura);
		String cadena = guardado.readLine();

		ArrayList<String> cabecera = new ArrayList<String>();
		Scanner sc1 = new Scanner(cadena);
		sc1.useDelimiter(this.separador);
		sc1.useLocale(this.locale);
		while (sc1.hasNext()){
			cabecera.add(sc1.next());
		}
		guardado.close();
		sc1.close();

		return cabecera;
	}
	/**
	 * Devuelve el numero de lineas del archivoTexto
	 *
	 * @param archivoTexto
	 *
	 * @return numLineas-1
	 *
	 * @throws IOException
	 */
	private int numLineas(File archivoTexto) throws IOException {
		FileReader lectura = new FileReader(archivoTexto);
		BufferedReader guardado = new BufferedReader(lectura);
		int numLineas = 0;
		while((guardado.readLine()) != null){
			numLineas+=1;
		}
		guardado.close();
		return numLineas-1;
	}
	/**
	 * Devuelve el numero columnas del archivoTexto
	 *
	 * @param archivoTexto
	 *
	 * @return numColumnas
	 *
	 * @throws IOException
	 */
	private int numColumnas(File archivoTexto) throws IOException {
		FileReader lectura = new FileReader(archivoTexto);
		BufferedReader guardado = new BufferedReader(lectura);
		String cadena;
		int numColumnas = 0;
		cadena = guardado.readLine();
		Scanner sc = new Scanner(cadena);
		sc.useDelimiter(this.separador);
		while (sc.hasNext()) {
			sc.next();
			numColumnas += 1;
		}

		guardado.close();
		sc.close();
		return numColumnas;
	}
	/**
	 * Lee un archivo y pasa los datos a una matriz de doubles
	 * @param archivoTexto
	 * @param filas
	 * @param columnas
	 * @return datosA
	 * @throws IOException
	 */
	private double[][] leerDatos(File archivoTexto, int filas, int columnas) throws IOException {
		double[][] datosA = new double[filas][columnas];

		try{
			FileReader lectura = new FileReader(archivoTexto);
			BufferedReader guardado = new BufferedReader(lectura);
			guardado.readLine();
			for(int i = 0;i < datosA.length;i++){
				String cadena = guardado.readLine();
				StringTokenizer tokens = new StringTokenizer(cadena, this.separador);
				int j = 0;
				while (tokens.hasMoreElements()){
					String token = (String)tokens.nextElement();
					datosA[i][j] = Double.parseDouble(token.trim());
					j++;
				}
			}
			guardado.close();
		} catch (IOException e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		}
		return datosA;
	}
	/**
	 *Devuelve un array double con los valores de la columna correspondiente a columna
	 *
	 * @param columna
	 * @return columnaSelec
	 * @throws IOException
	 * @throws RuntimeException
	 */
	public double[] getColumna(int columna) throws IOException,RuntimeException{
		double[] columnaSelec = new double[this.numeroLineas];
			if (columna > datos[0].length - 1)
				throw new RuntimeException("Columna fuera de rango");
			FileReader lectura = new FileReader(archivoTexto);
			BufferedReader guardado = new BufferedReader(lectura);
			Scanner sc = null;
			int numLinea = 0;
			int numColumna;
			String linea;
			guardado.readLine();

			while ((linea = guardado.readLine()) != null) {
				numColumna = 0;
				sc = new Scanner(linea);
				sc.useDelimiter(separador);
				sc.useLocale(locale);
				while (sc.hasNext()) {
					if (numColumna == columna)
						columnaSelec[numLinea] = sc.nextDouble();
					else
						sc.nextDouble();
					numColumna++;
				}
				numLinea++;
			}
			guardado.close();
		return columnaSelec;
	}
	/**
	 *Devuelve un array double con los valores de la columna correspondiente a columna
	 *
	 * @param columna
	 * @return columnaSelec
	 * @throws IOException
	 */
public double[] getColumna(String columna) throws Exception {

		int indice = 0;
		boolean encontrado = false;

		int i = 0;
		for (Iterator iterator = cabecera.iterator(); iterator.hasNext();) {
			String cadena = (String) iterator.next();
			if (cadena.equals(columna)) {
				indice = i;

				encontrado = true;
				break;
			}
			i++;

		}

		if (!encontrado) {
			throw new Exception("Columna no valida");
		}

		return getColumna(indice);
	}
	/**
	 * @return the archivoTexto
	 */
	public File getArchivoTexto() {
		return archivoTexto;
	}
	/**
	 * @return the separador
	 */
	public String getSeparador() {
		return separador;
	}
	/**
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}
	/**
	 * @return the cabecera
	 */
	public List<String> getCabecera() {
		return cabecera;
	}
	/**
	 * @return the numeroLineas
	 */
	public int getNumeroLineas() {
		return numeroLineas;
	}
	/**
	 * @return the numeroColumnas
	 */
	public int getNumeroColumnas() {
		return numeroColumnas;
	}
	/**
	 * @return the datos
	 */
	public double[][] getDatos() {
		return datos;
	}
	/**
	 * Exportar un archivo a otro archivo
	 *
	 * @param cabecera
	 * @param archivoTexto
	 * @param separador
	 */
	public void exportar(String[] cabecera,String archivoTexto,String separador){
		try {
			BufferedWriter escritura = new BufferedWriter(new FileWriter(new File(archivoTexto)));
			String cabeceraDatos = "";

			for (int i  = 0; i < cabecera.length;i++){
				if(i != cabecera.length - 1){
					cabeceraDatos+= cabecera[i] + separador;
				}else{
					cabeceraDatos += cabecera[i];
				}
			}
			escritura.write(cabeceraDatos + "\n");
			double[][] datosExport = new double[this.numeroLineas][cabecera.length];

			for (int i = 0; i < cabecera.length; i++) {
				double[] datoColumna = getColumna(cabecera[i]);
				for (int j = 0; j < datoColumna.length; j++) {
					datosExport[j][i] = datoColumna[j];
				}
			}
			String valoresDatos = "";
			for (int i = 0; i < datosExport.length; i++) {
				for (int j = 0; j < datosExport[0].length; j++) {
					if(j != datosExport[0].length - 1){
						valoresDatos += String.valueOf(datosExport[i][j]) + separador;
					}else{
						valoresDatos += String.valueOf(datosExport[i][j]);
					}
				}
				escritura.write(valoresDatos + "\n");
				valoresDatos = "";
			}
			escritura.close();
		} catch (IOException e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Devuelve un ConjuntoDatos a partir de un arry de string con la cabecera, un string con los datos, el separador y el locale
	 *
	 * @param cabecera
	 * @param archivoTexto
	 * @param separador
	 * @param locale
	 * @return ConjuntoDatos
	 * @throws IOException
	 * @throws Exception
	 */
	public ConjuntoDatos conjuntoDatos(String[] cabecera,String archivoTexto,String separador,Locale locale) throws IOException,Exception{
			exportar(cabecera, archivoTexto, separador);
			return new ConjuntoDatos(new File(archivoTexto), separador, locale);
	}
}
