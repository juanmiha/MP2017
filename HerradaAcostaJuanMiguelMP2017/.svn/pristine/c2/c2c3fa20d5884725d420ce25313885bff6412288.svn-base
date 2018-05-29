package org.mp.sesion04;
/**
 * GenericJosephus
 *
 * @author Juan Miguel HA
 * @version 07/05/2017
 * @param <E>
 */
public class GenericJosephus<E> extends GenericQueue<E> {
	private int k;
	private int n;
	private GenericQueue<E> cola;
	/**
	 * Contructor: Inicializa la cola, k que es el numero que delimita la eliminacion y n que es el numero de elementos
	 *
	 * @param k
	 * @param n
	 * @param objects
	 */
	public GenericJosephus(int k,int n,E[] objects){
		this.k = k;
		this.n = n;
		this.cola = new GenericQueue<E>();
		if	(objects != null){
			for(int i = 0; i < objects.length;i++){
				cola.enqueue(objects[i]);
			}
		}
	}
	/**
	 * Devuelve cola
	 * @return cola
	 */
	public GenericQueue<E> getCola(){
		return cola;
	}
	/**
	 * Devuelve un String con el nombre y los valores de los parametros de la clase GenericJosephus
	 */
	@Override
	public String toString() {
		return "Problema de Josephus: k=" + k + ", n=" + n + "\n" + getCola() + "";
	}
	/**
	 * Devuelve un String con el orden de eliminacion de los terminos teniendo en cuenta k
	 * @param cola
	 * @return String
	 */
	public String ordenEliminar(GenericQueue<E> cola){
		if (n==0){
			throw new RuntimeException("No hay ninguna persona");
		}else if (n==1) {
			return "Solo hay una persona";
		}
		String resultado="Orden de eliminación: \n";
		GenericQueue<E> colaTemp = new GenericQueue<E>();
		int contador = 0;
		E temp;
		while (n>0){
			contador++;
			if(contador == k){
				temp=cola.dequeue();
				resultado+="Debe morir "+temp+"\n";
				colaTemp.enqueue(temp);
				n--;
				contador = 1;
			}
			temp=cola.dequeue();
			cola.enqueue(temp);
		}
		cola.dequeue();
		return resultado;
	}
}
