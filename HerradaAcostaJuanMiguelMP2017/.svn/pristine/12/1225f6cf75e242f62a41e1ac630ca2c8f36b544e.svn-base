package org.mp.sesion05;
import java.util.Comparator;
/**
 * NumeroPaloComparator
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
@SuppressWarnings("rawtypes")
public class NumeroPaloComparator implements Comparator {
	/**
	 * Compara dos Objetos y devuelve un valor entero correpondiente a:
	 *  	1 si el o1 es mayor que o2
	 *  	-1 si el o1 es menor que o2
	 *  	0 si el o1 es igual a o2
	 */
	@Override
	public int compare(Object o1, Object o2) {
		int valor = 0;

		if(o1==o2){
			valor = 0;
		}

		Carta carta1 = (Carta) o1;
		Carta carta2 = (Carta) o2;

		char[] control = {'O', 'C', 'E', 'B'};
		int posA = 0;
		int posB = 0;

		//Recorremos arrayControl buscando palo control 1
		for(int i = 0; i < control.length; i++){
			if(carta1.getPalo().charAt(0) == control[i]){
				posA = i;
				break;
			}
		}
		//Recorremos arrayControl buscando palo control 2
		for(int i = 0; i < control.length; i++){
			if(carta2.getPalo().charAt(0) == control[i]){
				posB = i;
				break;
			}
		}
		//Iniciamos comparacion de numero de carta 1 y 2
		if(carta1.getNumero()<carta2.getNumero()){
			valor = -1;
		}else if(carta1.getNumero()>carta2.getNumero()){
			valor = 1;
		}else{
			if(posA < posB){
				valor = -1;
			}
			if(posA > posB){
				valor = 1;
			}
		}
		return valor;
}

}
