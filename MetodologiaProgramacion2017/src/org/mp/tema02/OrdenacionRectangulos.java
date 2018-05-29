package org.mp.tema02;
public class OrdenacionRectangulos {
  public static void main(String[] args) {
    RectanguloComparable[] rectangulos = {
      new RectanguloComparable(3.4, 5.4),
      new RectanguloComparable(13.24, 55.4),
      new RectanguloComparable(7.4, 35.4),
      new RectanguloComparable(1.4, 25.4)};
    java.util.Arrays.sort(rectangulos);
    for (Rectangulo rectangulo: rectangulos) {
      System.out.print(rectangulo + " ");
      System.out.println();
    }
  }
}
