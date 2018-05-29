package org.mp.sesion07;

public class ResidenciaDAOFactory {

	protected String nombreArchivo;

	public static DataAccessObject createResidenciaDAOFactory(String nombreArchivo, String tipo){

		if(tipo.equals("ser")){
			return new ResidenciaSER(nombreArchivo);
		}else if(tipo.equals("xml")){
			return new ResidenciaXML(nombreArchivo);
		}
		
		return null;
	}
	public String getNombreArchivo(){

		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo){

		this.nombreArchivo = nombreArchivo;
	}
}
