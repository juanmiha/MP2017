package org.mp.sesion06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * UtilidadesArchivos
 * @author Juan Miguel Herrada Acosta
 * @version 07/05/2017
 */
public class UtilidadArchivos {
	private ArrayList lista;
	/**
	 * Constructor: Inicializa lista a un ArrayList
	 */
	public UtilidadArchivos(){
		this.lista = new ArrayList();
	}
	/**
	 * Copia el contenido del fichero origen en el fichero destino.
	 * @param origen
	 * @param destino
	 * @throws IOException
	 */
	public static void copiar(File origen,File destino)throws IOException{
		InputStream in = new FileInputStream(origen);
	    OutputStream out = new FileOutputStream(destino);

	    // Transfer bytes from in to out
	    byte[] buf = new byte[1024];
	    int len;
	    while ((len = in.read(buf)) > 0) {
	        out.write(buf, 0, len);
	    }
	    in.close();
	    out.close();
	}
	/**
	 * Devuelve un ArrayList con los nombres de los directorios y sus ficheros
	 * @param dir
	 * @return lista
	 */
	public ArrayList listarDirectoriosArchivos(File dir){
		listarDirectoriosArchivosRec(dir);
		return lista;

	}
	/**
	 * Devuelve un ArrayList con los nombres de los directorios y sus ficheros(rec)
	 * @param dir
	 * @return lista
	 */
	private void listarDirectoriosArchivosRec(File dir){
		lista.add(dir.getAbsoluteFile());
		if (dir.isDirectory()) {
			// dis.list devuelve un array de nombres de archivos y directorios dentro del directorio que llama al metodo
	        String[] hijo = dir.list();
	        for (int i=0; i<hijo.length; i++) {
	        	listarDirectoriosArchivosRec(new File(dir, hijo[i]));
	        }
	    }
	}
	/**
	 * Comprime en un zip archivos y lo guarda en la direccion de caminoSalida con el nombre nombreArchivo
	 * @param dir
	 * @param caminoSalida
	 * @param nombreArchivo
	 */
	public void zip(File dir,String caminoSalida,String nombreArchivo){
		listarDirectoriosArchivos(dir);
		// Create a buffer for reading the files
		byte[] buf = new byte[1024];

		try {
		    // Create the ZIP file
		    String archivoSalida = caminoSalida+File.separator+nombreArchivo;
		    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(archivoSalida));

		    // Compress the files
		    for (Iterator iter = lista.iterator(); iter.hasNext();) {
		    	File elemento = ((File)iter.next());
		    	if(elemento.isFile()){
		    		FileInputStream in = new FileInputStream(elemento.getAbsolutePath());
		    		out.putNextEntry(new ZipEntry(elemento.getAbsolutePath()));

			        // Transfer bytes from the file to the ZIP file
			        int len;
			        while ((len = in.read(buf)) > 0) {
			            out.write(buf, 0, len);
		    	}
			        // Complete the entry
			        out.closeEntry();
			        in.close();
		        }
		    }
		    // Complete the ZIP file
		    out.close();
		} catch (IOException e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		}
	}
}
