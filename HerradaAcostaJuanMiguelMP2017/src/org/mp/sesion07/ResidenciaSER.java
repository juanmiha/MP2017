package org.mp.sesion07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ResidenciaSER extends ResidenciaDAOFactory implements DataAccessObject{

	public ResidenciaSER(String nombreArchivo){

		this.nombreArchivo = nombreArchivo;
	}

	public void escribir(Object residencia) throws IOException {

		Residencia residenciaTemp = (Residencia) residencia;
		File f = new File(nombreArchivo);
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(residenciaTemp);
		oos.close();
	}
	public Object leer() throws IOException {

		Residencia residencia;
		File f = new File(nombreArchivo);
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try{

			residencia = (Residencia) ois.readObject();
		}catch(ClassNotFoundException e){

			residencia = null;
			System.out.println("Error: no se ha encontrado la clase Residencia");
		}
		ois.close();
		return residencia;
	}

}