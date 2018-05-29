package org.mp.tema07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CuentaCorrienteSER {

    private String nombreArchivo;
    public CuentaCorrienteSER(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public void escribir(CuentaCorriente cuenta) throws IOException {
        File f = new File(nombreArchivo);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cuenta);
        oos.close();
    }
    public CuentaCorriente leer() throws IOException {
    	CuentaCorriente cuenta=null;
        File f = new File(nombreArchivo);
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            cuenta = (CuentaCorriente) ois.readObject();
        } catch (ClassNotFoundException e) {
        }
        ois.close();
        return cuenta;
    }
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
}
