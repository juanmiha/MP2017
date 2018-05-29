package org.mp.sesion05;

/**
 * SolucionesBusqueda
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
public class SolucionesBusqueda{
	/**
	 * Busqueda del objeto o en un array de forma lineal o secuencial
	 * @param o
	 * @return
	 * @throws ElementoNoEncontradoException
	 */
	public static int busquedaLineal(Busqueda o) throws ElementoNoEncontradoException{
		int buscado;
		buscado = o.getNumBuscado();
		boolean encontrado = false;
		int[] datos = o.getDatos();
		for (int i = 0; i < datos.length; i++) {
			if(buscado == datos[i]){
				encontrado = true;
				break;
			}
		}
		if(!encontrado){
			throw new ElementoNoEncontradoException("No encontrado");
		}
		return buscado;
	}
	/**
	 * Busqueda del objeto o en un array de forma binaria iterativa
	 * @param o
	 * @return
	 * @throws ElementoNoEncontradoException
	 */
	public static int busquedaBinariaIter(Busqueda o) throws ElementoNoEncontradoException {
		int buscado;
		buscado = o.getNumBuscado();
		boolean encontrado = false;
		int[] datos = o.getDatos();
		int primero = 0;
		int ultimo = datos.length - 1;
		int central;
		if((buscado <datos[0]) || (buscado > datos[datos.length - 1])){
			return buscado;
		}else
			while(ultimo >= primero){
				central = (primero + ultimo) / 2;
				if(buscado < datos[central])
					ultimo = central - 1;
				else if(buscado > datos[central])
					primero = central + 1;
				else
					return buscado;
			}
		if(!encontrado){
			throw new ElementoNoEncontradoException("No encontrado");
		}
		return buscado;
    }
	/**
	 * Busqueda del objeto o en un array de forma binaria recursiva
	 * @param buscado
	 * @param datos
	 * @param inicio
	 * @param fin
	 * @return
	 */
	 public static int busquedaBinariaRec(int buscado, int[] datos, int inicio, int fin){
				int middle = (inicio + fin)/2;

				if(fin < inicio){
					 return -1;
				}


				if (buscado < datos[middle]){
					return busquedaBinariaRec(buscado, datos, inicio, middle - 1);
				}

				if (buscado > datos[middle]){
					return busquedaBinariaRec(buscado, datos, middle + 1, fin);
				}

				if (buscado == datos[middle]){
					return middle;
				}

				return -1;
			}
	 /**
	  * Busqueda del objeto o en un array de forma binaria recursiva
	  * @param o
	  * @return
	  * @throws ElementoNoEncontradoException
	  */
	public static int busquedaBinariaRec(Busqueda o) throws ElementoNoEncontradoException{
		int buscado;
		buscado = o.getNumBuscado();
        boolean encontrado = false;
		int[] datos = o.getDatos();
		int primero = 0;
		int ultimo = datos.length - 1;
		busquedaBinariaRec(buscado,datos,primero,ultimo);
		if(!encontrado){
			throw new ElementoNoEncontradoException("No encontrado");
		}
		return buscado;
	}
}
