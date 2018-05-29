package org.mp.sesion05;
import java.util.Arrays;
/**
 * Accion
 *
 * @author Juan Miguel Herrada Acosta
 * @version 07.05.2017
 */
public class Ordenacion {
	/**
	 * Ordena el array a por el metodo de insercion
	 * @param a
	 */
	public static void ordenacionPorInsercion(Comparable[] a){
		int j;
		Comparable temp;
		for (int i=1;i<a.length;i++){
			temp=a[i];
			for (j=i-1;j>=0 && temp.compareTo(a[j])<0;j--){
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
	}
	/**
	 *  Ordena el array a por el metodo de insercion
	 * @param a
	 * @param izq
	 * @param der
	 */
	private static void ordenacionPorInsercion(Comparable[] a,int izq,int der){
		int j;
		Comparable tmp;
		for (int p = izq; p <= der; p++) {
			tmp= a[p];
			for(j = p; j > izq &(tmp.compareTo(a[j-1])<0);j--){
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	/**
	 *Llamada recursiva al metodo mergeSort
	 * @param a
	 */
	public static void mergeSort(Comparable[] a){
		Comparable[] vectorTemp = new Comparable[a.length];
		mergeSort(a,vectorTemp,0,a.length-1);
	}
	/**
	 * Ordena recursivamente las dos mitades del vector
	 * @param a
	 * @param vectorTemp
	 * @param izq
	 * @param der
	 */
	private static void mergeSort(Comparable[] a,Comparable[] vectorTemp,int izq,int der){
		if(izq < der ){
			int centro = (izq + der) / 2;
			mergeSort(a,vectorTemp,izq,centro);
			mergeSort(a,vectorTemp,centro+1,der);
			mezclar(a,vectorTemp,izq,centro+1,der);
		}
	}
	/**
	 * Unifica las dos mitades ordenadas en un vector ordenadoAccion.cld
	 * @param a
	 * @param vectorAux
	 * @param posIzq
	 * @param posDer
	 * @param posFin
	 */
	private static void mezclar(Comparable[] a,Comparable[] vectorAux, int posIzq,int posDer,int posFin){
		int finIzq = posDer -1;
		int posAux = posIzq;
		int numElementos = posFin - posIzq + 1;
		while((posIzq <= finIzq) && (posDer <= posFin)){
			if(a[posIzq].compareTo(a[posDer]) <= 0)
				vectorAux[posAux++] = a[posIzq++];
			else
				vectorAux[posAux++] = a[posDer++];
		}
		while(posIzq <= finIzq){
			vectorAux[posAux++] = a[posIzq++];
		}
		while(posDer <= posFin){
			vectorAux[posAux++] = a[posDer++];
		}
		for (int i = 0; i < numElementos; i++,posFin--) {
			a[posFin] = vectorAux[posFin];
		}
	}
	/**
	 * Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.
	 * @param a
	 */
	public static void sort(Comparable[] a){
		Arrays.sort(a);
	}
}
