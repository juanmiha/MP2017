package org.mp.tema02;
public class MaxUsandoTiposGenericos {
  /** Devuelve el máximo de dos objetos */
  public static <E extends Comparable<E>> E max(E o1, E o2) {
    if (o1.compareTo(o2) > 0)
      return o1;
    else
      return o2;
  }
  public static void main(String [] args){
	 String mayor = max("Hola", "adios");
	 System.out.println(mayor);
  }
}

