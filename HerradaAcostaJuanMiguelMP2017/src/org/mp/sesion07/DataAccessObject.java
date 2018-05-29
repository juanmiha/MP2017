package org.mp.sesion07;

import java.io.IOException;

public interface DataAccessObject {

	public void escribir(Object object) throws IOException;

	public Object leer() throws IOException;
}