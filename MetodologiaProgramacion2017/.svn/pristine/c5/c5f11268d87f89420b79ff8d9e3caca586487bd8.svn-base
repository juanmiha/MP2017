package org.mp.tema02;
public class TestComestible {
  public static void main(String[] args) {
    Object[] objetos = {new Tigre(), new Pollo(), new Manzana()};
    System.out.println();
    for (int i = 0; i < objetos.length; i++) {
      if (objetos[i] instanceof Comestible)
        System.out.println(((Comestible)objetos[i]).comoComer());

      if (objetos[i] instanceof Animal) {
        System.out.println(((Animal)objetos[i]).sonido());
      }
    }
  }
}


