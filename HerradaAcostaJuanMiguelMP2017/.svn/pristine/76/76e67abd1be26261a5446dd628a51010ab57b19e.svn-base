package org.mp.sesion09;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class ConjuntoDatosAdaptador {

	private ConjuntoDatos cd;

	public ConjuntoDatosAdaptador(ConjuntoDatos cd) {
		super();
		this.cd = cd;
	}
	
	  public Object[][]  getDatos(){
		  double[][] datos = cd.getDatos();
			Double[][] datosD = new Double[cd.getNumeroLineas()][cd
					.getNumeroColumnas()];
			
			for (int i = 0; i < datos.length; i++) {
				for (int j = 0; j < datos[0].length; j++) {
					datosD[i][j] = new Double(datos[i][j]);
				}
			}
			return datosD;
		
	  }
	  
	  public Object[]  getCabecera(){
		  Object[] columnas = cd.getCabecera().toArray();
		return columnas;
		
	  }

	public ConjuntoDatos getCd() {
		return cd;
	}

	public void guardarComo(File selectedFile) {
		
		List lista = cd.getCabecera();
		String[] cabecera = new String[lista.size()];
		int i = 0;
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			String object = (String) iterator.next();
			cabecera[i]=object;
			i++;
		}
		try {
			cd.exportar(cabecera, selectedFile.getAbsolutePath()+".txt", cd.getSeparador());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	  
	  
}
