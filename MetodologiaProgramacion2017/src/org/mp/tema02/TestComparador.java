package org.mp.tema02;

import java.util.Comparator;

public class TestComparador {
  public static void main(String[] args) {
    ObjetoGeometrico g1 = new Rectangulo(5, 5);
    ObjetoGeometrico g2 = new Circulo(5);

    ObjetoGeometrico g =
      max(g1, g2, new ObjetoGeometricoComparador());

    System.out.println();
    System.out.println("El área mayor de los objetos es: " +
      g.getArea());
  }

  public static ObjetoGeometrico max(ObjetoGeometrico g1,
      ObjetoGeometrico g2, Comparator<ObjetoGeometrico> c) {
    if (c.compare(g1, g2) > 0)
      return g1;
    else
      return g2;
  }
}
